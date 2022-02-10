/*
 *Program Name:	TestBubbleSort.java
 *Author:		Alex Liu
 *Date:		    March 21, 2021
 *Course:	    CPSC 1150 - W05
 *Instructor:	Leon Pan
*/
import java.util.Scanner;

//Purpose: To sort the numbers from smallest to largest using bubble sort

class TestBubbleSort{

    // The method sorts the double array from smallest to largest using bubble sort
    public static void bubbleSort(double[] list){
        //Initial declaration 
        boolean changed = true;
        double temp = 0;

        /*Compare the next element and current element in the list, if the current element is bigger than the next element then swap these two numbers*/ 
        /*Set the changed flag to be false when entering the do while loop everytime, and whenever there is swap happened, turn the changed flag to be true*/
        /*Proceed the same strategy until there is no more swap need to be done, which is checked by the changed flag. The array will be in sorted order*/
        
        do {
            changed = false;
            for (int j = 0; j < list.length - 1; j++){
                if(list[j]>list[j+1]){
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    changed = true;
                }
            }
        }while(changed);
 
        System.out.println("The sorted doubles are: ");
        for(int i = 0; i<list.length;i++){
            System.out.print(list[i] + " ");
        }
    }

    //Main Method
    public static void main(String[] args) {
        
        /*Obtain inputs from user in the console, read the whole line of numbers in as string, 
        convert the string into string array, convert each element in the string array into double
        and store them into a double array*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a series of doubles to be sorted: ");
        String line = scanner.nextLine();
        String[] lineA = line.split(" ");
        double[] list = new double[lineA.length];
        for(int i = 0; i < lineA.length;i++){
            list[i] = Double.parseDouble(lineA[i]);
        }

        // Sort the array using bubble sort
        bubbleSort(list);
        scanner.close();
    }
}