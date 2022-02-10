/*
 *Program Name:	CheckerBoard.java
 *Author:		Alex Liu
 *Date:		    March 28, 2021
 *Course:	    CPSC 1150 - W05
 *Instructor:	Leon Pan
*/

//Purpose: To find the row or column that has all zeros, or if the major or minor diagonal has all zeros from a 8 by 8 array filling with random 1s and 0s.
public class CheckerBoard {

    //Method to diplay the row has zeros in the array
    public static void findAllZerosRow(int[][] arr){

        /*Loop through the 2 d array, use outter loop to control the row and inner loop to control the column
          Check through each single row, if there is 1 in the row, then check the next row, else display the row number  
        */
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if (arr[i][j] == 1){
                    break;
                }
                else if(j == arr[0].length-1){
                        System.out.println("All 0's on row " + i);
                    
                }
            }
        }
    }
    
    //Method to diplay the column has zeros in the array
    public static void findAllZerosCol(int[][]arr){
        
        /*Loop through the 2 d array, use outter loop to control the column and inner loop to control the row
          Check through each single column, if there is 1 in the column, then check the next column, else display the column number  
        */
        for(int j = 0; j < arr[0].length; j++){
            for (int i = 0; i < arr.length; i++){
                if (arr[i][j] == 1){
                    break;
                }
                else if(i == arr.length-1){
                    System.out.println("All 0's on column " + j);
                    
                }
            }
        }
    }

    //Method to diplay the message that major diagonal has zeros    
    public static void findAllMajorDiag(int[][]arr){
        
        /*Loop through each row and increment index j at the same time to track the major diagonal
          If there is 1 in the major diagonal, then break the loop, else display the message if its all zeros
        */
        int j = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i][j] == 1){
                break;
            }
            else if(i == arr.length-1){
                System.out.println("All 0's on the major diagonal");
            }
            j++;       
        }
    }

    //Method to diplay the message that minor diagonal has zeros    
    public static void findAllMinorDiag(int[][]arr){
        
        /*Loop through each row and decrement index j at the same time to track the minor diagonal
          If there is 1 in the minor diagonal, then break the loop, else display the message if its all zeros
        */
        int j = arr[0].length-1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i][j] == 1){
                break;
            }
            else if(i == arr.length-1){
                System.out.println("All 0's on the minor diagonal");
            }
            j--;       
        }
    }

    //Method to return the array of 8 by 8 that contains random zeros and ones
    public static int[][] getRandomZerosOnes(){

        //Create a 2 d array size 8 by 8 
        int[][] arr = new int[8][8];
        
        //Loop through 2 d array and assign a random number between zero and one 
        for(int i = 0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = (int)(Math.random() * (1 - 0 + 1));
            }
        }
         
        return arr;
    }

    //Main method
    public static void main(String[] args) {
        
        //Obtrain a 8 by 8 array with random zeros and ones filling in
        int[][] arr = getRandomZerosOnes();

        //Display the created array on the display        
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("");
        //Display the row that has all zeros on the console if needed
        findAllZerosRow(arr);        
        //Display the column that has all zeros on the console if needed
        findAllZerosCol(arr);
        //Display the message that has all zeros in major diagonal on the console if needed
        findAllMajorDiag(arr);
        //Display the message that has all zeros in minor diagonal on the console if needed
        findAllMinorDiag(arr);
    }    
}
