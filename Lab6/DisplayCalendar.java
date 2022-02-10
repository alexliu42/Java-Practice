/*
 *Program Name:	DisplayCalendar.java
 *Author:		Alex Liu
 *Date:		    Feburary 28, 2021
 *Course:	    CPSC 1150 - W05
 *Instructor:	Leon Pan
*/

import java.util.Scanner;

// Purpose: To display calendar based on the user inputs of year and first day

public class DisplayCalendar {

    // Determine if the year is a leap year and update the days for Feburary
    public static int isLeapYear(int febDays, int year){
        if (year % 4 == 0 && (year % 100 != 0 || year % 400==0)){
            febDays = 29;
        }
        else{
            febDays = 28;
        }
        return febDays;
    }
    
    // Display the headers of each month
    public static void printMonthHeader(String month, int year){
        System.out.println("            "+month +"   " + year);
        System.out.println("_______________________________________");
        System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
    }

    // Display days with their associate formats
    public static void printDays( int day){
        if(day < 10){
            System.out.print(day + "     ");
        }
        else{
            System.out.print(day + "    ");
        }
    }

    // Main method
    public static void main(String[] args) {
        
        // Ask for user inputs of year and first day from the console and save them into variables
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        System.out.print("Enter the first day of the year: ");
        int firstDay = scanner.nextInt();
        System.out.println();
        scanner.close();

        // Pre-define global variables for different number of days and array of months
        int febDays = 0;
        int thirtyDays = 30;
        int thirtyOneDays = 31;
        String[] month = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        // Update leap year information
        febDays = isLeapYear(febDays,year);

        // Position day to the first if the first day is Sunday
        if (firstDay==7){
            firstDay = 0;
        }
        // Display calendar for 12 months
        for (int i = 0; i < 12; i++){
            
            // Display header of each month
            printMonthHeader(month[i], year);

            // Adjust the space required at the begining of each month
            for (int j = 0; j < firstDay; j++){
                System.out.print("      ");
            }
            
            // Display thirty one days for the coresponding month
            if (month[i] == "January" || month[i] == "March" || month[i] == "May" || month[i] == "July" || month[i] == "March" || month[i] == "July" || month[i] == "August" || month[i] == "September" || month[i] == "December"){        
                
                for (int k = 1; k <= thirtyOneDays; k++){
                    
                    printDays(k);
                    
                    // Update the day position
                    firstDay++;
                    
                    // If the day position reaches 7 and it is last day of the month then printing the next day in the new row, otherwise proceed the same step but adding extra space for formatting the display
                    if (firstDay == 7 && k == thirtyOneDays){
                        firstDay = 0;
                    }
                    else if(firstDay == 7){
                        System.out.println();
                        firstDay = 0;
                    }
                }
            }
            // Display thirty days for the coresponding month
            else if (month[i] == "April" || month[i] == "June" || month[i] == "September" || month[i] == "November"){
                for (int l = 1; l <= thirtyDays; l++){
                    
                    printDays(l);

                    // Update the day position
                    firstDay++;
                    
                    // If the day position reaches 7 and it is last day of the month then printing the next day in the new row, otherwise proceed the same step but adding extra space for formatting the display
                    if (firstDay == 7 && l == thirtyDays){
                        firstDay = 0;
                    }
                    else if(firstDay == 7){
                        System.out.println();
                        firstDay = 0;
                    }
                }
            }

            // Display twenty eight days for the coresponding month
            else{
                for (int m = 1; m <= febDays; m++){
                    
                    printDays(m);
                    
                    // Update the day position
                    firstDay++;
                    
                    // If the day position reaches 7 and it is last day of the month then printing the next day in the new row, otherwise proceed the same step but adding extra space for formatting the display
                    if (firstDay == 7 && m == febDays){
                        firstDay = 0;
                    }
                    else if(firstDay == 7){
                        System.out.println();
                        firstDay = 0;
                    }
                }
            }

            // Extra lines required to seperate each month
            System.out.println();
            System.out.println();    
        }
        
    }
}



