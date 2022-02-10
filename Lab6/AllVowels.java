/*
 *Program Name:	AllVowels.java
 *Author:		Alex Liu
 *Date:		    Feburary 28, 2021
 *Course:	    CPSC 1150 - W05
 *Instructor:	Leon Pan
*/

// Purpose: To generate and display random 4 vowels all in lowercase. Regenerate a new letter if the generation is not a vowel.

class AllVowels {
    
    // Generate random letter  
    public static char randomChar() {
        
        // Create random integer from 1 to 26
        int randomInt = (int) (Math.random() * (26 + 1));

        // Convert the integer to char using code point based on ASCII table
        char c = (char) ('a' + randomInt);

        // Return random letter 
        return c;
    }
    
    // Check if letter is vowel
    public static boolean isVowel(char c){

        // Reuturn true is input c is vowel
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    // Main method
    public static void main(String[] args) {

        // Initialization for counter to count for number of vowels
        int count = 0;
        
        // Infinite loop to repeat creating random letter and check if the letter is vowel
        while (true){

            // Create a random letter
            char c = randomChar();

            // If the random letter is a vowel, display the vowel on the console
            if(isVowel(c)){
                System.out.print(c + " ");
                count++;

                // If 4 vowels are generated then break and stop the infinite loop
                if (count == 4){
                    break;
                }
            }            
        }    
    }
    
}