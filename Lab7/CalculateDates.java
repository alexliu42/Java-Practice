/*
 *Program Name:	CaculateDates.java
 *Author:		Alex Liu
 *Date:		    March 7, 2021
 *Course:	    CPSC 1150 - W05
 *Instructor:	Leon Pan
*/

import java.util.Scanner;

//Purpose: To calculate days have passed from the beginning of the year to a given date entered on the console

public class CalculateDates {

    //Main method
   public static void main(String[] args) {
       
        // Obtain inputs from user 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Day: ");
        int day = scanner.nextInt();
        System.out.print("Month: ");
        int month = scanner.nextInt();
        System.out.print("Year: ");
        int year = scanner.nextInt();

        //Repeatedly asking input from user, if the given input is out of range
        while (!isInputValid(day, month, isLeapYear(year))){
            System.out.println("Invalid input, please re-enter!");
            System.out.print("Day: ");
            day = scanner.nextInt();
            System.out.print("Month: ");
            month = scanner.nextInt();
            System.out.print("Year: ");
            year = scanner.nextInt();
       }
       
       // Calculate the days have passed from the begining of the year until one month before the month entered by user
       int sumDays =0;
       for (int i = 1; i <month; i++){
           sumDays = calculateTotalDaysPassed(sumDays, getDaysInMonth(i,isLeapYear(year)));   
       }

       // Add the days of current month to the total 
       sumDays = calculateTotalDaysPassed(sumDays, day-1);

       // Print the total of days have passed and the next date on the console
       System.out.println(sumDays + " days have passed since the beginning of the year.");
       printNextDay(getMonthName(month), day, year, month);
       scanner.close();
       
    }

    // Check if the input is valid by checking the day, month is out of the range with 4 types of month
    public static boolean isInputValid(Integer day, Integer month, boolean isLeapYear){
        boolean thirtyOne = (day <= 31 && (month == 1 || month == 3 || month ==5 || month==7 || month == 8|| month== 10 || month==12));    
        boolean thirty = (day <= 30 && (month==4||month==6||month==9||month==11));
        boolean twentynine = (day <=29 && isLeapYear && month ==2);
        boolean twentyeight = (day <=28 && !isLeapYear && month ==2);
        if( thirtyOne || thirty || twentynine || twentyeight)
        {
            return true;
        }
        else{
            return false;
        }
    }
    
    //Check if the input year is a leap year
    public static boolean isLeapYear(int year){
        if (year % 4 == 0 && (year % 100 != 0 || year % 400==0)){
            return true;
        }
        else{
            return false;
        }
   }

    // Return the name of the month fom the input number of month
    public static String getMonthName(int month){
        String monthName;
        if (month == 1){
            monthName = "January";
        }
        else if ( month == 2){
            monthName="Feburary";
        }
        else if (month ==3){
            monthName = "March";
        }
        else if (month ==4){
            monthName = "April";
        }
        else if (month ==5){
            monthName = "May";
        }
        else if(month ==6){
            monthName ="June";
        }
        else if(month==7){
            monthName = "July";
        }
        else if (month ==8){
            monthName = "August";
        }
        else if(month == 9){
            monthName = "September";
        }
        else if(month == 10){
            monthName = "October";
        }
        else if(month == 11){
            monthName = "November";
        }
        else{
            monthName = "December";
        }
        return monthName;
   }
    
    // Return days in the month depending on the 4 types
    public static int getDaysInMonth(int month, boolean isLeapYear){
        int days = 0;
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12){
            days = 31;
        }
        else if (month == 2 && isLeapYear == true){
            days = 29;
        }
        else if (month ==2 && isLeapYear == false){
            days = 28;
        }
        else{
            days = 30;
        }
        return days;
   }

    //Return the sum of days 
    public static int calculateTotalDaysPassed(int accumulatedDays,int days){
        accumulatedDays += days;
        return accumulatedDays;
   }

    // Update the format of day, month and year if it is required and output the next day on the console
    public static void printNextDay(String monthName, int day, int year, int month){
        day ++;
        if (day  > getDaysInMonth(month, isLeapYear(year))){
            day = 1;
            month++;
            if(month>12){
                month = 1;
                year++;
            }
        }
        System.out.println("The next day is " + getMonthName(month) +" " + day + ", "+ year);
   }
}
