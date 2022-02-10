/*
 *Program Name:	DisplayWeekTempStat.java
 *Author:		Alex Liu
 *Date:		    March 14, 2021
 *Course:	    CPSC 1150 - W05
 *Instructor:	Leon Pan
*/

import java.util.Scanner;

//Purpose: To diplay the highest temperature of each day in a week based on user input from the console, then find the average, hottest, coldest temperatures and the hottest, coldest days from the input.
public class DisplayWeekTempStat {

    //Main method
    public static void main(String[] args) {
        
        //Creat an integer array with size of 7
        int temp[] = new int[7];

        //Ask for the user to enter the highest temperauture of each day and store them in the integer array
        System.out.println("Please enter the highest temperature of each day in a week (start with Sunday): ");
        Scanner scanner = new Scanner(System.in);
        for ( int i = 0; i < 7; i++){    
            temp[i] = scanner.nextInt();
        }
        scanner.close();

        //Find the average temperature from the integer array and display it with 2 decimals on the console
        double average = average(temp);
        System.out.print("The average temperature of the week is: ");
        System.out.printf("%.2f", average);
        System.out.print(" degree");
        
        //Print a line
        System.out.println("");

        //Find the max temperature from the integer array and display it on the console
        int max = max(temp);
        System.out.println("The hottest temperature is: " + max + " degree");
        
        //Find the min temperature from the integer array and display it on the console
        int min = min(temp);        
        System.out.println("The coldest temperature is: " + min + " degree");
        
        //Create a string array with days stored starting with Sunday
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};        
        
        //Find the hottest days in numbers and store them in the integer array
        int[] hottestA = searchTemp(temp, max);

        //Display the hottest days on the console using hottest days in number as the indice to further return the days in words 
        System.out.print("The hosttest days are: ");
        for(int j = 0; j < hottestA.length; j++){

            //Do not print comma if the element is the last element, other wise print comma with the days
            if (j == hottestA.length -1 ){
                System.out.print(days[hottestA[j]]);
            }
            else{
                System.out.print(days[hottestA[j]] + ", ");
            
            }
        }

        // Same steps as finding the hottest day, but take in the min temperature of the week this time to find the coldest day
        System.out.println("");
        int[] coldestA = searchTemp(temp, min);
        System.out.print("The coldest days are: ");
        for(int k = 0; k < coldestA.length; k++){
            if (k == coldestA.length -1 ){
                System.out.print(days[coldestA[k]]);
            }
            else{
                System.out.print(days[coldestA[k]] + ", ");
            
            }
        }
  
    }

    //Return the double average temperature within the integer array
    public static double average(int[] integersA){
        
        //Initialize the sum to be zero as double
        double sum = 0;

        //Iterate through the integer array and adding them together
        for (int i = 0; i < integersA.length; i++){
            sum += integersA[i];
        }

        //Return the sum divided by numbers of elements in the array as average in double
        return sum/integersA.length; 
    }

    //Return the max integer in the integer array 
    public static int max (int[] integersA){
        
        //Set the largest number to be the first element of the array
        int largest = integersA[0];

        //Compare the integers in the array and update the largest number
        for (int i = 1; i<integersA.length; i++){
            if (integersA[i]>largest){
                largest = integersA[i];
            }
        }
        return largest;
    }

    //Return the min integer in the integer array 
    public static int min (int[] integersA){

        //Set the min number to be the first element of the array
        int smallest = integersA[0];

        //Compare the integers in the array and update the smallest number
        for (int i = 1; i<integersA.length; i++){
            if (integersA[i]<smallest){
                smallest = integersA[i];
            }
        }
        return smallest;
    }

    //Return the indices of temp array where it matches the key
    public static int[] searchTemp (int[] temp, int key){
        
        //Find how many element matches the key in the temp array
        int count = 0;
        for (int i = 0; i < temp.length; i++){
            if (temp[i] == key){
                count++ ;
            }
        }

        //Create the array to store the indices with the size of matches found
        int[] result = new int[count];

        //Iterate through the temp array to transfer the indices that match the key to the result array
        int k = 0;
        for (int j = 0; j < temp.length; j++){
            if (temp[j] == key){
                result[k] = j; 
                k++;
            }
        }  
        return result;
        
    }
}
