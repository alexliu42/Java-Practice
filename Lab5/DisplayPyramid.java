/*
 *Program Name:	DisplayPyramid.java
 *Author:		Alex Liu
 *Date:		    Feburary 21, 2021
 *Course:	    CPSC 1150 - W05
 *Instructor:	Leon Pan
*/
import java.util.Scanner;

// Purpose: To display pyramid based on user input between 1 and 15.

public class DisplayPyramid {

    // Main method
    public static void main(String[] args) {

        // Get a number between 1 and 15 from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 15: ");
        Integer number = scanner.nextInt();
        scanner.close();

        /* Display the pyramid using for loop to print each row, 
           first nested loop to adjust number position
           second nested loop to print number in descending order with conditional statements to adjust format 
           third nested loop to print number in ascending order with conditional statements to adjust format
        */
        Integer rowPos;
        rowPos = number;
            
        for(int i = 1; i <= number; i++){
            for(int j = 1; j < rowPos; j++){
                    System.out.print("   ");                                    
            }
            for (int k = i; k > 1; k--){
                if (k < 10){
                    System.out.print(k+"  ");
                }
                else{
                    System.out.print(k+" ");
                }
            }
            for (int l = 1; l <= i; l++){
                if (l < 10){
                    System.out.print(l+"  ");
                }
                else{
                    System.out.print(l+" ");
                }
            }
            System.out.println("");
            rowPos--;
        }      
    }    
}
