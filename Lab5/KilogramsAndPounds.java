/*
 *Program Name:	KilogransAndPounds.java
 *Author:		Alex Liu
 *Date:		    Feburary 21, 2021
 *Course:	    CPSC 1150 - W05
 *Instructor:	Leon Pan
*/

// Purpose: To display the table of converting between kilograms and pounds that is shown in the assignment outline 

public class KilogramsAndPounds {

    // Main method
    public static void main(String[] args) {

        // Declare the ratio from kilogram to pound as a constant
        final double KILLOTOPOUND = 2.2;
        
        // Display header row using printf to format spaces
        System.out.printf("%10s","kilograms");
        System.out.printf("%10s","pounds");
        System.out.printf("%5s", "|");
        System.out.printf("%12s","pounds");
        System.out.printf("%10s%n","kilograms");
        System.out.println("-------------------------------------------------");
        
        // Initialize variables for each column, and assign them to be the requiring values for first row         
        double col1POUND = KILLOTOPOUND;
        int col1KILO = 1;
        int col2POUND = 20;
        double col2KILO = col2POUND / KILLOTOPOUND;

        // Repeatedly append and display the row with specific format using printf, until reaching kilogram of column1 to be 19  
        while (col1KILO <= 19){
            System.out.printf("%10d",col1KILO);
            System.out.printf("%10.3f",col1POUND);
            System.out.printf("%5s", "|");
            System.out.printf("%10d",col2POUND);
            System.out.printf("%10.3f%n",col2KILO);
            col1KILO += 2;
            col1POUND = col1KILO * KILLOTOPOUND;
            col2POUND += 5;
            col2KILO = col2POUND / KILLOTOPOUND;
        }
    }   
}
