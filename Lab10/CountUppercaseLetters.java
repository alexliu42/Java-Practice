/*
 *Program Name:	CountUppercaseLetters.java
 *Author:		Alex Liu
 *Date:		    March 28, 2021
 *Course:	    CPSC 1150 - W05
 *Instructor:	Leon Pan
*/

//Purpose: To count the number of uppercases in a sentence

class CountUppercaseLetters{

    //Method to return the numbers of uppercase in a sentence   
    public static int findUpperCase(String inputS){
        
        /*Loop through the sentnece and use charAt to check if the letters are within the range of 65-90 
        that presents letter a-z from ASCII table   */
        int count = 0;
        for (int i = 0; i<inputS.length();i++){
            if((int)(inputS.charAt(i)) <= 90 && (int)(inputS.charAt(i)) >= 65){
                count++;
            }
        }  
        return count;
    }

    //Main method
    public static void main(String[] args) {
        
        //Loop through the argument string array and store them into the string variable using string concatinatio
        String inputS ="";

        for(int i = 0; i<args.length; i++){
            inputS += args[i];
        }

        //Find uppercase in the string
        int count = findUpperCase(inputS);

        //Display the result on the console
        System.out.println("The total number of uppercase letter is " + count);
    }
}