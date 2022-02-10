/*
 *Program Name:	LargestInArrays.java
 *Author:		Alex Liu
 *Date:		    March 14, 2021
 *Course:	    CPSC 1150 - W05
 *Instructor:	Leon Pan
*/

import java.util.Scanner;

//Purpose: To return the largest number in the form of integer and double from a series of 5 numbers using overloading method
public class LargestInArrays{
    
    //Return the max integer from an integer array
    public static int max (int[] array){

        //Set the largest integer to be the first element in the array
        int largest = array[0];

        //Iterate through the array of integers and compare each integer with the largest integer
        for (int i = 1; i  < array.length; i++){

            //If the integer in the array is larger than the largest integer, then update the largest integer
            if (largest<array[i]){
                largest = array[i];
            }
        }
        return largest;
    }
    
    //Return the max double from a double array
    public static double max (double[] array){

        //Set the largest double to be the first element in the array
        double largest = array[0];

        //Iterate through the array of doubles and compare each double with the largest double
        for (int i = 1; i  < array.length; i++){

            //If the double in the array is larger than the largest double, then update the largest double
            if (largest<array[i]){
                largest = array[i];
            }
        }
        return largest;
    }

    //Main method
    public static void main(String[] args) {
        
        String lineS;
        String [] lineSA;

        //Obtain 5 integers from user entering on the console, and store the input as a string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 integers: ");
        lineS = scanner.nextLine();
        
        //Convert the string into string array using split function
        lineSA = lineS.split(" ");

        //Create an integer array with the size of string array 
        int[] integersIntA = new int[lineSA.length];

        //Transfer the element in the string array to integer array
        for (int i = 0; i<lineSA.length; i ++){
            integersIntA[i] = Integer.parseInt(lineSA[i]);
        }
        
        //Display the max number in the integer array on the console
        System.out.println("The largest integer is: ");
        System.out.println(max (integersIntA));

        //Use the same method above to find the max double in the double array
        System.out.println("Please enter 5 doubles: ");
        lineS = scanner.nextLine();
        lineSA = lineS.split(" ");
        double[] doublesDoubleA = new double[lineSA.length];

        for (int j = 0; j<lineSA.length; j ++){
            doublesDoubleA[j] = Double.parseDouble(lineSA[j]);
        }

        System.out.println("The largest double is: ");        
        System.out.println(max (doublesDoubleA));
        scanner.close();
    }
}