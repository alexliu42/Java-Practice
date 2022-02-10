/*
 *Program Name:	PlayLottery.java
 *Author:		Alex Liu
 *Date:		    March 21, 2021
 *Course:	    CPSC 1150 - W05
 *Instructor:	Leon Pan
*/

import java.util.Scanner;

//Purpose: To find the number of matches between lottery numbers and the numbers entered by user

public class PlayLottery {

    // Get numbers entered by user on the console and store them into an integer array
    public static int[] getUserNumbers(){
        
        //Ask input from user on the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 6 distinct numbers between 1 and 49:");
        
        //Store the user input into a string, and split the string into an array of string
        String line = scanner.nextLine();
        String[] lineA = line.split(" ");
        
        //Create an integer array to store the converting integer values from string array
        int[] userNumbers = new int[lineA.length];
        System.out.println("The numbers entered are: ");
        
        for(int i=0; i<lineA.length; i++){
            userNumbers[i] = Integer.parseInt(lineA[i]);
            System.out.print(userNumbers[i]+ " ");
        }
        
        scanner.close();

        //Reutrn the integer array
        return userNumbers;
    }
    
    // Generate 6 distinct random numbers between 1 and 49 and store them into an integer array
    public static int[] getRandomNumbers(){
        
        //Create a size of 6 of integer array
        int[] randomNumbers = new int[6];
        System.out.println("The numbers from the lottery are: ");
        
        //Create 6 random numbers between 1 and 49 and store them into an array
        for (int i =0; i <6; i++){    
            randomNumbers[i] = (int) (Math.random() * (49 - 1  + 1) + 1); 
            
            //If the random number is repeated from the array, then re generate a new one. Change the index to be zero to restart checking for repetition
            for (int j =0; j<i; j++){
                if (randomNumbers[i] == randomNumbers[j]){
                    randomNumbers[i] = (int) (Math.random() * (49 - 1  + 1) + 1); 
                    j = 0;
                }
            }
            System.out.print(randomNumbers[i]+ " ");
        }

        //Return the integer array of random generated numbers
        return randomNumbers;
    }

    //Find the number of matches between the numbers entered by users and the lottery numbers
    public static int getTotalMatchNumbers(int[] userNumbers, int[] lotteryNumbers){
        int match = 0;
        
        //Using 2 d array to check for the matches. Outter for loop iterates the array of lottery numbers, and the inner for loop iterates the array of user numbers
        for(int i = 0; i < lotteryNumbers.length;i++){
            for(int j = 0; j <userNumbers.length; j++){

                //Increment match by one if there are common numbers between two arrays
                if(userNumbers[j]==lotteryNumbers[i]){
                    match++;
                }
            }
        }
        
        //Return the count
        return match;
    }

    public static void main(String[] args) {
        
        // Get User numbers and print them on the console
        int[] userNumbers = getUserNumbers();
        System.out.println();

        //Get 6 distinct random numbers and print them on the console
        int[] lotteryNumbers = getRandomNumbers();
        System.out.println();
        
        //Find the matches between two series of numbers and print the count of match on the console.
        int match = getTotalMatchNumbers(userNumbers, lotteryNumbers);          
        System.out.println("The number of you total match is: ");  
        System.out.println(match);
        
    }
}
