/*
 *Program Name:	GenerateRandomNumbers.java
 *Author:		Alex Liu
 *Date:		    March 14, 2021
 *Course:	    CPSC 1150 - W05
 *Instructor:	Leon Pan
*/

//Purpose: To generate 6 distinct random numbers between 1 and 49
public class GenerateRandomNumbers {
    public static void main(String[] args) {

        //Create an integer array with a size of 6
        int[] randIntA = new int[6];

        //Display the appropiate message on the console
        System.out.println("The 6 distinct random numbers between 1 and 49 are: ");

        //Generate 6 integers between 1 and 49 and store them in the array 
        for(int i = 0; i < 6; i++){
            randIntA[i] =  (int) (Math.random() * (49 - 1 + 1) ) + 1;
            
            //Check if the generating integer is the same from the previous generation
            for (int j = 0; j < i; j++){
                //If repetition occurs, generate a another random integer between 1 and 49, and set the indice to be 0 to recheck from the begining of the array 
                if (randIntA[j] == randIntA[i]){
                    randIntA[i] =  (int) (Math.random() * (49 - 1 + 1) ) + 1;
                    j = 0;
                }
            } 
            
            //Display 6 distinct random integers between 1 and 49 on the console
            System.out.print(randIntA[i] + " ");
        }
        
    }
}
