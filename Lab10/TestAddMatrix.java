/*
 *Program Name:	TestAddMatrix.java
 *Author:		Alex Liu
 *Date:		    March 28, 2021
 *Course:	    CPSC 1150 - W05
 *Instructor:	Leon Pan
*/

//Purpose: To perform two matrices addition
public class TestAddMatrix {

    //Method to perform two matrices addition and return the result
    public static int[][] addMatrix(int[][] m1, int[][] m2){
        //Create an array to store the result based on the matrix size
        int [][] result = new int[m1.length][m1[0].length];
        
        //Loop through row and col to perform addition 
        for(int i = 0; i< m1.length; i ++ ){
            for (int j = 0; j< m1[0].length; j++){
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }
    
    //Method to print the matrix on the console
    public static void printMatrix(int[][] result){
        
        // Use 2 d array to loop through the matrix, and format the display with space if needed
        for (int i =0; i <result.length;i++){
            for(int j = 0; j<result[0].length;j++){
                System.out.print(result[i][j]); 
                if (result[i][j]<10){
                    System.out.print("  ");            
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println("");
        }
    }
    
    //Main method
    public static void main(String[] args) {
    
        //Declare to martix array with numbers to perform addition
        int[][] m1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] m2 = {{1,2,3},{4,5,6},{7,8,9}};
        
        //Display the matrices on the console
        System.out.println("The matrices for addition are: ");
        printMatrix(m1);
        System.out.println("");
        printMatrix(m2);
        System.out.println("");

        //Dsiplay the result of matrix addition on the console
        System.out.println("The result is: ");
        int[][] result = addMatrix(m1, m2);

        printMatrix(result);

    }
}
