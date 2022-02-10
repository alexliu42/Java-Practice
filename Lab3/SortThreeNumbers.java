/*
 *Program Name:	SortThreeNumbers.java
 *Author:		Alex Liu
 *Date:		    January 30, 2021
 *Course:		CPSC 1150 - W05
 *Instructor:	Leon Pan
*/

import java.util.Scanner;

// Purpose: To that get three integers from the user and display the integers from smallest to largest. 

public class SortThreeNumbers {
    
    // Main method
    public static void main(String[] args) {
        
        // Get three integers from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter three integers: ");
        Integer firstInt = scanner.nextInt();
        Integer secondInt = scanner.nextInt();
        Integer thirdInt = scanner.nextInt();

        // Compare all the integers to sort them from smallest to largest
        Integer largest;
        Integer smallest;
        Integer med;

        if (firstInt >= secondInt && firstInt >= thirdInt){
            largest = firstInt;
            if(secondInt >= thirdInt){
                smallest = thirdInt;
                med = secondInt;
            }
            else{
                smallest = secondInt;
                med = thirdInt;
            }
        }
        else if(secondInt >= firstInt && secondInt >= thirdInt){
            largest = secondInt;
            if(firstInt >= thirdInt){
                smallest = thirdInt;
                med = firstInt;
            }
            else{
                smallest = firstInt;
                med = thirdInt;
            }
        }
        else {
            largest = thirdInt;
            if(firstInt >= secondInt){
                smallest = secondInt;
                med = firstInt;
            }
            else{
                smallest = firstInt;
                med = secondInt;
            }
        }

        // Display three sorted integers
        System.out.print("Three integers from smallest to largest: ");
        System.out.print(smallest + " ");
        System.out.print(med + " ");
        System.out.print(largest + " ");
        
        scanner.close();
        }
}
