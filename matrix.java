//BERHASIL 2 ITERASI, HANYA TIDAK TERLIHAT ITERASINYA

package matrix;

import java.util.ArrayList;
import java.util.Arrays;

public class matrix {
    
    public static int [] heurristic = new int[9];
    public static int [] heurristicArr = new int[9];
    public static int abcHeur, counterAbc = 0;;
    public static String [] initArr = new String[9];;
    
    public static void main(String[] args) {
        String abc, goalArr;
        
        int initial[][] = {{2, 0, 3}, 
                            {1, 8, 4}, 
                             {7, 6, 5}};
//        int initial[][] = {{0, 2, 3}, 
//                            {1, 8, 4}, 
//                             {7, 6, 5}};
//        int initial[][] = {{4, 8, 0}, 
//                            {2, 3, 1}, 
//                             {7, 6, 5}};
        int initTemp [][] = new int[initial.length][initial.length];
//        int goal[][] = {{1, 2, 3}, 
//                        {4, 5, 6}, 
//                         {7, 8, 0}};
        int goal[][] = {{1, 2, 3}, 
                        {8, 0, 4}, 
                         {7, 6, 5}};
          
        copyArray(initTemp, initial);
        
        System.out.println("Initial Array");
        printInitialArray(initial);
        System.out.println("Goal Array");
        printGoalArray(goal);
        
        System.out.println("---------------------------------------");
        
        
//        if (initial != goal) { 
//        do{ 
        for(int a = 0; a < 3; a++) {
            for(int b = 0; b < 3; b++){
                //disini salah, karena saat da ada yang sama walau hanya 1 kolom dianggap bener
                
                //if nya salah
                    if (initial[a][b] == 0 && a != 2 && b != 2 && a == 0 && b == 0) {
                        swapKanan(initial, a, b);
                        abc = Arrays.deepToString(initial).replaceAll("\\D", "");
                        goalArr = Arrays.deepToString(goal).replaceAll("\\D", "");
                        abc1(abc, initial, goal, goalArr);
//                        Heuristic(initial, goal);
                        printInitialArray(initial);
                        
                        //---------------------------
                        copyArray(initial, initTemp);
                        //---------------------------
                        swapBawah(initial, a, b);
                        abc = Arrays.deepToString(initial).replaceAll("\\D", "");
                        goalArr = Arrays.deepToString(goal).replaceAll("\\D", "");
                        abc1(abc, initial, goal, goalArr);
//                        Heuristic(initial, goal);
                        printInitialArray(initial);
                        
                        System.out.println("A: "+a+" b: "+b);
                        System.out.println("---------------------------------------");
                    }else if (initial[a][b] == 0 && a != 2 && b != 2 && a == 0 && b == 1) {
                        swapBawah(initial, a, b);
                        abc = Arrays.deepToString(initial).replaceAll("\\D", "");
                        goalArr = Arrays.deepToString(goal).replaceAll("\\D", "");
                        abc1(abc, initial, goal, goalArr);
//                        Heuristic(initial, goal);
                        printInitialArray(initial);
                        
                        //---------------------------
                        copyArray(initial, initTemp);
                        //---------------------------
                        
                        swapKanan(initial, a, b);
                        abc = Arrays.deepToString(initial).replaceAll("\\D", "");
                        goalArr = Arrays.deepToString(goal).replaceAll("\\D", "");
                        abc1(abc, initial, goal, goalArr);
//                        Heuristic(initial, goal);
                        printInitialArray(initial);
                        
                        //---------------------------
                        copyArray(initial, initTemp);
                        //---------------------------
                        
                        swapKiri(initial, a, b);
                        abc = Arrays.deepToString(initial).replaceAll("\\D", "");
                        goalArr = Arrays.deepToString(goal).replaceAll("\\D", "");
                        abc1(abc, initial, goal, goalArr);
//                        Heuristic(initial, goal);
                        printInitialArray(initial);
                        
                        System.out.println("A: "+a+" b: "+b);
                        
                        System.out.println("---------------------------------------");
                        System.out.println("Mulai Bandingkan...");
                        
                    }else if (initial[a][b] == 0 && a != 2 && b != 2 && a == 0 && b == 2) {
                        swapBawah(initial, a, b);
                        abc = Arrays.deepToString(initial).replaceAll("\\D", "");
                        goalArr = Arrays.deepToString(goal).replaceAll("\\D", "");
                        abc1(abc, initial, goal, goalArr);
//                        Heuristic(initial, goal);
                        printInitialArray(initial);
                        
                        //---------------------------
                        copyArray(initial, initTemp);
                        //---------------------------
                        
                        swapKiri(initial, a, b);
                        abc = Arrays.deepToString(initial).replaceAll("\\D", "");
                        goalArr = Arrays.deepToString(goal).replaceAll("\\D", "");
                        abc1(abc, initial, goal, goalArr);
//                        Heuristic(initial, goal);
                        printInitialArray(initial);
                        
                        System.out.println("A: "+a+" b: "+b);
                        System.out.println("---------------------------------------");
                    }else if (initial[a][b] == 0 && a != 2 && b != 2 && a == 1 && b == 0) {
                        swapBawah(initial, a, b);
                        abc = Arrays.deepToString(initial).replaceAll("\\D", "");
                        goalArr = Arrays.deepToString(goal).replaceAll("\\D", "");
                        abc1(abc, initial, goal, goalArr);
//                        Heuristic(initial, goal);
                        printInitialArray(initial);
                        
                        //---------------------------
                        copyArray(initial, initTemp);
                        //---------------------------
                        
                        swapAtas(initial, a, b);
                        abc = Arrays.deepToString(initial).replaceAll("\\D", "");
                        goalArr = Arrays.deepToString(goal).replaceAll("\\D", "");
                        abc1(abc, initial, goal, goalArr);
//                        Heuristic(initial, goal);
                        printInitialArray(initial);
                        
                        
                        //---------------------------
                        copyArray(initial, initTemp);
                        //---------------------------
                        
                        swapKanan(initial, a, b);
                        abc = Arrays.deepToString(initial).replaceAll("\\D", "");
                        goalArr = Arrays.deepToString(goal).replaceAll("\\D", "");
                        abc1(abc, initial, goal, goalArr);
//                        Heuristic(initial, goal);
                        printInitialArray(initial);
                        
                        
                        System.out.println("A: "+a+" b: "+b);
                        System.out.println("---------------------------------------");
                    }else if (initial[a][b] == 0 && a != 2 && b != 2 && a == 1 && b == 1) {
                        swapAtas(initial, a, b);
                        abc = Arrays.deepToString(initial).replaceAll("\\D", "");
                        goalArr = Arrays.deepToString(goal).replaceAll("\\D", "");                        
                        abc1(abc, initial, goal, goalArr);
//                        Heuristic(initial, goal);
                        printInitialArray(initial);
                        
                        //---------------------------
                        copyArray(initial, initTemp);
                        //---------------------------
                        
                        swapBawah(initial, a, b);
                        abc = Arrays.deepToString(initial).replaceAll("\\D", "");
                        goalArr = Arrays.deepToString(goal).replaceAll("\\D", "");                        
                        abc1(abc, initial, goal, goalArr);
//                        Heuristic(initial, goal);
                        printInitialArray(initial);
                        
                        //---------------------------
                        copyArray(initial, initTemp);
                        //---------------------------
                        
                        swapKanan(initial, a, b);
                        abc = Arrays.deepToString(initial).replaceAll("\\D", "");
                        goalArr = Arrays.deepToString(goal).replaceAll("\\D", "");                        
                        abc1(abc, initial, goal, goalArr);
//                        Heuristic(initial, goal);
                        printInitialArray(initial);
                        
                        //---------------------------
                        copyArray(initial, initTemp);
                        //---------------------------
                        
                        swapKiri(initial, a, b);
                        abc = Arrays.deepToString(initial).replaceAll("\\D", "");
                        goalArr = Arrays.deepToString(goal).replaceAll("\\D", "");                        
                        abc1(abc, initial, goal, goalArr);
//                        Heuristic(initial, goal);
                        printInitialArray(initial);
                        
                        System.out.println("A: "+a+" b: "+b);
                        System.out.println("---------------------------------------");
                    }else if (initial[a][b] == 0 && a != 2 && b != 2 && a == 1 && b == 2) {
                        swapAtas(initial, a, b);
                        abc = Arrays.deepToString(initial).replaceAll("\\D", "");
                        goalArr = Arrays.deepToString(goal).replaceAll("\\D", "");                        
                        abc1(abc, initial, goal, goalArr);
//                        Heuristic(initial, goal);
                        printInitialArray(initial);
                        
                        //---------------------------
                        copyArray(initial, initTemp);
                        //---------------------------
                        
                        swapBawah(initial, a, b);
                        abc = Arrays.deepToString(initial).replaceAll("\\D", "");
                        goalArr = Arrays.deepToString(goal).replaceAll("\\D", "");                        
                        abc1(abc, initial, goal, goalArr);
//                        Heuristic(initial, goal);
                        printInitialArray(initial);
                        
                        //---------------------------
                        copyArray(initial, initTemp);
                        //---------------------------
                        
                        swapKiri(initial, a, b);
                        abc = Arrays.deepToString(initial).replaceAll("\\D", "");
                        goalArr = Arrays.deepToString(goal).replaceAll("\\D", "");                        
                        abc1(abc, initial, goal, goalArr);
//                        Heuristic(initial, goal);
                        printInitialArray(initial);
                        
                        System.out.println("A: "+a+" b: "+b);
                        System.out.println("---------------------------------------");
                    }else if (initial[a][b] == 0 && a != 2 && b != 2 && a == 2 && b == 0) {
                        swapAtas(initial, a, b);
                        abc = Arrays.deepToString(initial).replaceAll("\\D", "");
                        goalArr = Arrays.deepToString(goal).replaceAll("\\D", "");                        
                        abc1(abc, initial, goal, goalArr);
//                        Heuristic(initial, goal);
                        printInitialArray(initial);
                        
                        //---------------------------
                        copyArray(initial, initTemp);
                        //---------------------------
                        
                        swapKanan(initial, a, b);
                        abc = Arrays.deepToString(initial).replaceAll("\\D", "");
                        goalArr = Arrays.deepToString(goal).replaceAll("\\D", "");                        
                        abc1(abc, initial, goal, goalArr);
//                        Heuristic(initial, goal);
                        printInitialArray(initial);
                        
                        System.out.println("A: "+a+" b: "+b);
                        System.out.println("---------------------------------------");
                    }else if (initial[a][b] == 0 && a != 2 && b != 2 && a == 2 && b == 1) {
                        swapKiri(initial, a, b);
                        abc = Arrays.deepToString(initial).replaceAll("\\D", "");
                        goalArr = Arrays.deepToString(goal).replaceAll("\\D", "");                        
                        abc1(abc, initial, goal, goalArr);
//                        Heuristic(initial, goal);
                        printInitialArray(initial);
                        
                        //---------------------------
                        copyArray(initial, initTemp);
                        //---------------------------
                        
                        swapAtas(initial, a, b);
                        abc = Arrays.deepToString(initial).replaceAll("\\D", "");
                        goalArr = Arrays.deepToString(goal).replaceAll("\\D", "");                        
                        abc1(abc, initial, goal, goalArr);
//                        Heuristic(initial, goal);
                        printInitialArray(initial);
                        
                        //---------------------------
                        copyArray(initial, initTemp);
                        //---------------------------
                        
                        swapKanan(initial, a, b);
                        abc = Arrays.deepToString(initial).replaceAll("\\D", "");
                        goalArr = Arrays.deepToString(goal).replaceAll("\\D", "");                        
                        abc1(abc, initial, goal, goalArr);
//                        Heuristic(initial, goal);
                        printInitialArray(initial);
                        
                        System.out.println("A: "+a+" b: "+b);
                        System.out.println("---------------------------------------");
                    }else if (initial[a][b] == 0 && a != 2 && b != 2 && a == 2 && b == 2) {
                        swapAtas(initial, a, b);
                        abc = Arrays.deepToString(initial).replaceAll("\\D", "");
                        goalArr = Arrays.deepToString(goal).replaceAll("\\D", "");                        
                        abc1(abc, initial, goal, goalArr);
//                        Heuristic(initial, goal);
                        printInitialArray(initial);
                        
                        //---------------------------
                        copyArray(initial, initTemp);
                        //---------------------------
                        
                        swapKiri(initial, a, b);
                        abc = Arrays.deepToString(initial).replaceAll("\\D", "");
                        goalArr = Arrays.deepToString(goal).replaceAll("\\D", "");                        
                        abc1(abc, initial, goal, goalArr);
//                        Heuristic(initial, goal);
                        printInitialArray(initial);
                        
                        System.out.println("A: "+a+" b: "+b);
                        System.out.println("---------------------------------------");
                    }
                }
            }
//        }while (initial != goal);
    }
    
    private static String abc1(String abc12, int[][] arrInitHeur, int[][] arrGoalHeur, String goalArr){
        
//        System.out.println(counterAbc);
//        for (int i = counterAbc; i < abc12.length(); i++) {
//            System.out.println(counterAbc);
            initArr[counterAbc] = abc12;
            counterAbc++;
//        }
        
        String [] initArr1 = new String [initArr.length];
        int index1 = 0;
        
        //Bandungkan yang terbesar
        ArrayList temp = new ArrayList();
        
        for (int i = 0; i < initArr.length; i++) {
            initArr1[i] = initArr[i];
        }
        
        int counter = 0;
        for (int i = 0; i < counterAbc; i++) {
//            System.out.println("Step: "+initArr1[i]);
            for (int bc = 0; bc < 9; bc++) {
                    if (initArr1[i].charAt(bc) == goalArr.charAt(bc)) {
                        
                        counter += 1;
                        
                    }
                }
            
            System.out.println("Array: "+initArr1[i]+", Nilai Heuristik:"+counter);
            System.out.println(counter);
            System.out.println(initArr1[i]);
            
            initArr1[i] += String.valueOf(counter);
            System.out.println(initArr1[i]);
            counter = 0;
            
            System.out.println("---------------------------------------");
            
        }
        System.out.println("Largest Number: "+initArr1[0]);
        
//        Heuristic(arrInitHeur, arrGoalHeur);
    

        return initArr1[0];
    }
    
        
    
    private static void Bandingkan(){
        
    }

    private static void copyArray(int [][] arrOld, int [][] arrCurr){
        for(int i=0; i<arrOld.length; i++){
            for(int j=0; j<arrOld[i].length; j++){
              arrOld[i][j]=arrCurr[i][j];
//                System.out.println(arrOld[i][j]);
            }
        }
    }
    
    private static void Convert2Dke1D(int [][] arrInitConvert){
        //panjang array 2d nya, jadi baris kali kolom makanya jadinya gini
            int newArray[] = new int[arrInitConvert.length*arrInitConvert[0].length]; //gini , DEKLRASAI
            // Mulai masukin elemen2nya
            for (int row = 0, count = 0; row < arrInitConvert.length; row++) {
                for (int col = 0; col < arrInitConvert.length; col++) {
                    newArray[count] = arrInitConvert[row][col];
                    count++;
                }
            }
            System.out.print("Nilai 1D Array: ");
            for(int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
            System.out.println("");
    }
    
    public static void swapKanan(int[][] arr, int a, int b) {
        int temp = arr[a][b];
        arr[a][b] = arr[a][b+1];
        arr[a][b+1] = temp;
        System.out.println("'"+temp+"' Geser Kanan");
    }
    
    public static void swapBawah(int[][] arr, int a, int b) {
        int temp = arr[a][b];
        arr[a][b] = arr[a+1][b];
        arr[a+1][b] = temp;
        System.out.println("'"+temp+"' Geser Bawah");
    }

    public static void swapKiri(int[][] arr, int a, int b) {
        int temp = arr[a][b];
        arr[a][b] = arr[a][b-1];
        arr[a][b-1] = temp;
        System.out.println("'"+temp+"' Geser Kiri");
    }
    
    public static void swapAtas(int[][] arr, int a, int b) {
        int temp = arr[a][b];
        arr[a][b] = arr[a-1][b];
        arr[a-1][b] = temp;
        System.out.println("'"+temp+"' Geser Atas");
    }
    
    public static void printInitialArray(int[][] arr) {
        for(int a = 0; a < 3; a++) {
            for(int b = 0; b < 3; b++){
                System.out.print(arr[a][b] + " ");
            }
                
            System.out.println();
        }
        System.out.println();
        
    }
 
    public static void printGoalArray(int[][] arr1) {
        for(int a = 0; a < 3; a++) {
            for(int b = 0; b < 3; b++){
                System.out.print(arr1[a][b] + " ");
//                System.out.print("baris:"+a+" Kolom:"+b+" "+arr[a][b] + " ");
            }
                
            System.out.println();
        }
        System.out.println();
    }
    
    public static int Heuristic(int[][] arrInit, int[][] arrGoal){
//        heurristic[arrInit[1][1]] = -1;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j<=2; j++) {
                for (int k = 0; k <= 2; k++) {
                    for (int l = 0; l <=2 ; l++) {
                        if (arrInit[i][j] == 1 && arrGoal[k][l] == 1) {
                            heurristicArr[arrInit[i][j]] = Math.abs(heurristic[arrInit[i][j]] = (Math.abs(i - l)+Math.abs(j - k)));
//                            System.out.println("Nilai Heuristic: "+heurristicArr[arrInit[i][j]]);
                            abcHeur += Math.abs(heurristic[arrInit[i][j]] = (Math.abs(i - l)+Math.abs(j - k)));
//                            System.out.println("H("+arrInit[i][j]+") = ("+i+" - "+l+" )+("+j+" - "+k+")");
//                            System.out.println("");
                            
                        }else if (arrInit[i][j] == 2 && arrGoal[k][l] == 2) {
                            heurristicArr[arrInit[i][j]] = Math.abs(heurristic[arrInit[i][j]] = (Math.abs(i - l)+Math.abs(j - k)));
//                            System.out.println("Nilai Heuristic: "+heurristicArr[arrInit[i][j]]);
                            abcHeur += Math.abs(heurristic[arrInit[i][j]] = (Math.abs(i - l)+Math.abs(j - k)));
//                            System.out.println("H("+arrInit[i][j]+") = ("+i+" - "+l+" )+("+j+" - "+k+")");
//                            System.out.println("");
                            
                        }else if (arrInit[i][j] == 3 && arrGoal[k][l] == 3) {
                            heurristicArr[arrInit[i][j]] = Math.abs(heurristic[arrInit[i][j]] = (Math.abs(i - l)+Math.abs(j - k)));
//                            System.out.println("Nilai Heuristic: "+heurristicArr[arrInit[i][j]]);
                            abcHeur += Math.abs(heurristic[arrInit[i][j]] = (Math.abs(i - l)+Math.abs(j - k)));
//                            System.out.println("H("+arrInit[i][j]+") = ("+i+" - "+l+" )+("+j+" - "+k+")");
//                            System.out.println("");
                            
                        }else if (arrInit[i][j] == 4 && arrGoal[k][l] == 4) {
                            heurristicArr[arrInit[i][j]] = Math.abs(heurristic[arrInit[i][j]] = (Math.abs(i - l)+Math.abs(j - k)));
//                            System.out.println("Nilai Heuristic: "+heurristicArr[arrInit[i][j]]);
                            abcHeur += Math.abs(heurristic[arrInit[i][j]] = (Math.abs(i - l)+Math.abs(j - k)));
//                            System.out.println("H("+arrInit[i][j]+") = ("+i+" - "+l+" )+("+j+" - "+k+")");
//                            System.out.println("");
                            
                        }else if (arrInit[i][j] == 5 && arrGoal[k][l] == 5) {
                            heurristicArr[arrInit[i][j]] = Math.abs(heurristic[arrInit[i][j]] = (Math.abs(i - l)+Math.abs(j - k)));
//                            System.out.println("Nilai Heuristic: "+heurristicArr[arrInit[i][j]]);
                            abcHeur += Math.abs(heurristic[arrInit[i][j]] = (Math.abs(i - l)+Math.abs(j - k)));
//                            System.out.println("H("+arrInit[i][j]+") = ("+i+" - "+l+" )+("+j+" - "+k+")");
//                            System.out.println("");
                            
                        }else if (arrInit[i][j] == 6 && arrGoal[k][l] == 6) {
                            heurristicArr[arrInit[i][j]] = Math.abs(heurristic[arrInit[i][j]] = (Math.abs(i - l)+Math.abs(j - k)));
//                            System.out.println("Nilai Heuristic: "+heurristicArr[arrInit[i][j]]);
                            abcHeur += Math.abs(heurristic[arrInit[i][j]] = (Math.abs(i - l)+Math.abs(j - k)));
//                            System.out.println("H("+arrInit[i][j]+") = ("+i+" - "+l+" )+("+j+" - "+k+")");
//                            System.out.println("");
                            
                        }else if (arrInit[i][j] == 7 && arrGoal[k][l] == 7) {
                            heurristicArr[arrInit[i][j]] = Math.abs(heurristic[arrInit[i][j]] = (Math.abs(i - l)+Math.abs(j - k)));
//                            System.out.println("Nilai Heuristic: "+heurristicArr[arrInit[i][j]]);
                            abcHeur += Math.abs(heurristic[arrInit[i][j]] = (Math.abs(i - l)+Math.abs(j - k)));
//                            System.out.println("H("+arrInit[i][j]+") = ("+i+" - "+l+" )+("+j+" - "+k+")");
//                            System.out.println("");
                            
                        }else if (arrInit[i][j] == 8 && arrGoal[k][l] == 8) {
                            heurristicArr[arrInit[i][j]] = Math.abs(heurristic[arrInit[i][j]] = (Math.abs(i - l)+Math.abs(j - k)));
//                            System.out.println("Nilai Heuristic: "+heurristicArr[arrInit[i][j]]);
                            abcHeur += Math.abs(heurristic[arrInit[i][j]] = (Math.abs(i - l)+Math.abs(j - k)));
//                            System.out.println("H("+arrInit[i][j]+") = ("+i+" - "+l+" )+("+j+" - "+k+")");
//                            System.out.println("");
                            
                        }
                    }
                }
            }
        }
            System.out.println("Total Nilai Heuristic: "+abcHeur);
            System.out.println("");
        return abcHeur;
    }     
    
}