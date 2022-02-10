/*
 *Program Name:	CountVowels.java
 *Author:		Alex Liu
 *Date:		    March 7, 2021
 *Course:	    CPSC 1150 - W05
 *Instructor:	Leon Pan
*/
import java.util.Scanner;

// Purpose: To find the number of vowels from the input entered on the console

class CountVowels{
    
    // Main method
    public static void main(String[] args) {

        // Retriving input from user on the console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Output the number of vowels on the console
        System.out.print("The number of vowel in the sentence is: ");
        System.out.print(numberOfVowels(sentence));
        scanner.close();
    }

    // Method to return the count of vowels from a given string
    public static int numberOfVowels(String sentence){

        // Convert to lowercase so the function can work for uppercase and lowercase 
        sentence = sentence.toLowerCase();
        
        // Increment the counter when the loop finds a vowel char from the input
        int count = 0;
        for(int i = 0; i < sentence.length(); i++){
            if (sentence.charAt(i)=='a' || sentence.charAt(i)=='e' || sentence.charAt(i)=='i' || sentence.charAt(i)=='o' || sentence.charAt(i)=='u'){
                count++;
            }
        }

        // return the counter
        return count;
    }
}