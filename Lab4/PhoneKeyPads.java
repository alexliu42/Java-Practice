/*
 *Program Name:	PhoneKeyPads.java
 *Author:		Alex Liu
 *Date:		    Feburary 06, 2021
 *Course:	    CPSC 1150 - W05
 *Instructor:	Leon Pan
*/

import java.util.Scanner;

// Purpose: To display the number corresponding to the international standard letter / number mapping found on the telephone on the console based on user input

public class PhoneKeyPads {

    // Main method
    public static void main(String[] args){

        // Get a letter in either upper case or lower case from the console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a letter (uppercase or lowercase): ");
        String letter = scanner.next();
        System.out.print(letter + " is ");
        letter = letter.toLowerCase();
        scanner.close();
        
        ////Find which case matches the letter entered by user
        switch(letter){

            //If letter matches a then printing out its associated information on the console, and use system.exit(0) to indicate sucessful termination   
            case ("a"):
                System.out.println("on the number key 2");
                System.exit(0);
            
            //If letter matches b then printing out its associated information on the console, and use system.exit(0) to indicate sucessful termination   
            case ("b"):
                System.out.println("on the number key 2");
                System.exit(0);
            
            //If letter matches c then printing out its associated information on the console, and use system.exit(0) to indicate sucessful termination   
            case ("c"):
                System.out.println("on the number key 2");
                System.exit(0);
            
            //If letter matches d then printing out its associated information on the console, and use system.exit(0) to indicate sucessful termination   
            case ("d"):
                System.out.println("on the number key 3");
                System.exit(0);

            //If letter matches e then printing out its associated information on the console, and use system.exit(0) to indicate sucessful termination   
            case ("e"):
                System.out.println("on the number key 3");
                System.exit(0);

            //If letter matches f then printing out its associated information on the console, and use system.exit(0) to indicate sucessful termination           
            case ("f"):
                System.out.println("on the number key 3");
                System.exit(0);

            //If letter matches g then printing out its associated information on the console, and use system.exit(0) to indicate sucessful termination   
            case ("g"):
                System.out.println("on the number key 4");
                System.exit(0);

            //If letter matches h then printing out its associated information on the console, and use system.exit(0) to indicate sucessful termination   
            case ("h"):
                System.out.println("on the number key 4");
                System.exit(0);

            //If letter matches i then printing out its associated information on the console, and use system.exit(0) to indicate sucessful termination   
            case ("i"):
                System.out.println("on the number key 4");
                System.exit(0);

            //If letter matches j then printing out its associated information on the console, and use system.exit(0) to indicate sucessful termination   
            case ("j"):
                System.out.println("on the number key 5");
                System.exit(0);

            //If letter matches k then printing out its associated information on the console, and use system.exit(0) to indicate sucessful termination   
            case ("k"):
                System.out.println("on the number key 5");
                System.exit(0);

            //If letter matches l then printing out its associated information on the console, and use system.exit(0) to indicate sucessful termination   
            case ("l"):
                System.out.println("on the number key 5");
                System.exit(0);

            //If letter matches m then printing out its associated information on the console, and use system.exit(0) to indicate sucessful termination   
            case ("m"):
                System.out.println("on the number key 6");
                System.exit(0);

            //If letter matches n then printing out its associated information on the console, and use system.exit(0) to indicate sucessful termination   
            case ("n"):
                System.out.println("on the number key 6");
                System.exit(0);

            //If letter matches o then printing out its associated information on the console, and use system.exit(0) to indicate sucessful termination   
            case ("o"):
                System.out.println("on the number key 6");
                System.exit(0);

            //If letter matches p then printing out its associated information on the console, and use system.exit(0) to indicate sucessful termination    
            case ("p"):
                System.out.println("on the number key 7");
                System.exit(0);

            //If letter matches q then printing out its associated information on the console, and use system.exit(0) to indicate sucessful termination   
            case ("q"):
                System.out.println("on the number key 7");
                System.exit(0);

            //If letter matches r then printing out its associated information on the console, and use system.exit(0) to indicate sucessful termination   
            case ("r"):
                System.out.println("on the number key 7");
                System.exit(0);

            //If letter matches s then printing out its associated information on the console, and use system.exit(0) to indicate sucessful termination   
            case ("s"):
                System.out.println("on the number key 7");
                System.exit(0);

            //If letter matches t then printing out its associated information on the console, and use system.exit(0) to indicate sucessful termination   
            case ("t"):
                System.out.println("on the number key 8");
                System.exit(0);

            //If letter matches u then printing out its associated information on the console, and use system.exit(0) to indicate sucessful termination   
            case ("u"):
                System.out.println("on the number key 8");
                System.exit(0);
            
            //If letter matches v then printing out its associated information on the console, and use system.exit(0) to indicate sucessful termination   
            case ("v"):
                System.out.println("on the number key 8");
                System.exit(0);

            //If letter matches w then printing out its associated information on the console, and use system.exit(0) to indicate sucessful termination   
            case ("w"):
                System.out.println("on the number key 9");
                System.exit(0);

            //If letter matches x then printing out its associated information on the console, and use system.exit(0) to indicate sucessful termination   
            case ("x"):
                System.out.println("on the number key 9");
                System.exit(0);

            //If letter matches y then printing out its associated information on the console, and use system.exit(0) to indicate sucessful termination   
            case ("y"):
                System.out.println("on the number key 9");
                System.exit(0);

            //If letter matches z then printing out its associated information on the console, and use system.exit(0) to indicate sucessful termination   
            case ("z"):
                System.out.println("on the number key 9");
                System.exit(0);

            //If the input is not a english letter then diplays error message
            default: 
                System.out.println("an invalid input");
                System.out.println("Error: invalid input, please enter a letter");
        }
    }
}
