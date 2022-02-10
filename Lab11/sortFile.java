/*
 *Program Name:	sortFile.java
 *Author:		Alex Liu
 *Date:		    April 4, 2021
 *Course:	    CPSC 1150 - W05
 *Instructor:	Leon Pan
*/

import java.io.*;
import java.util.*;

//Purpose: To create a new copy of sorted data by name or date using file IO 
public class sortFile{

    // Method to read data from file and return them in a stored array
    public static String[] input(String filename) throws FileNotFoundException{
        
        // Create a new file and put the file into scanner to track data
        File myFile = new File(filename);
        Scanner input = new Scanner(myFile);

        // Count lines of data in the file and create the same size of array to store data
        int count = 0;
        while(input.hasNextLine()){
            input.nextLine();
            count++;
        }
        String[] arr = new String[count];
        input.close();


        //Store every line of data from file into the array created
        Scanner input2 = new Scanner(myFile);
        int i = 0;
        while(input2.hasNextLine()){
            arr[i] = input2.nextLine();
            i++;
        }
        input2.close();
        return arr; 
    }

    //Method to save the sorted array as a new file with the name of filename 
    public static void output(String filename, String[] info) throws FileNotFoundException{
        //Place myFile object into a PrintWriter object to append data into file
        File myFile = new File(filename);
        PrintWriter outPut = new PrintWriter(myFile);
        for(int i = 0; i<info.length; i++){
            outPut.println(info[i]);
        }
        outPut.close();
    }

    //Method to sort the array by month
    public static String[] sortByMonth(String[] info){
        
        /*Iterate through each line in the data, 
        use Scanner object to obtain the date from every line,
        and store the dates into an array.
        */
        String[] arr = new String[info.length];
        for(int i =0; i<info.length; i++){
            Scanner scanner = new Scanner(info[i]);
            arr[i] = scanner.next();
            scanner.close();
        }
        
        //Sort the array with dates 
        String temp = "";
        int flag = 0;
        for(int j =0; j+1<arr.length;j++){
            if(arr[j].compareTo(arr[j+1])>0){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]= temp;
                flag = 1;
                
            }
            if(j+1==arr.length-1 && flag ==1){
                j = -1;
                flag = 0;
            }
        }

        /* Iterate through the sorted date array and original input array to find the matches.
           Sorted the array with lines of data by using the index of date array         
        */
        String temp2 = "";
        for(int k = 0; k<arr.length;k++){
            for(int l = 0; l<info.length; l++){
                Scanner scanner = new Scanner(info[l]);
                if(scanner.next().compareTo(arr[k])==0){
                    temp2 = info[k];
                    info[k] = info[l];
                    info[l]= temp2;
                    scanner.close();
                    break;
                }
                scanner.close();
            }
        }
        return info;
    }

    // Method to sort the array by name
    public static String[] sortByName(String[] info){
        
        //Use Scanner object to obtain the name information from the array of lines and store them into an array
        String[] arr = new String[info.length];
        String nameDetail = "";
        for(int i =0; i<info.length; i++){
            Scanner scanner = new Scanner(info[i]);
            scanner.next();
            while(scanner.hasNext()){
                nameDetail += scanner.next() + " ";
            }
            arr[i]=nameDetail;
            nameDetail="";
            scanner.close();
        }
        
        //Sort the name array by using compareTo to compare between strings
        String temp = "";
        int flag = 0;
        for(int j =0; j+1<arr.length;j++){
            if(arr[j].compareTo(arr[j+1])>0){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]= temp;
                flag = 1;
            }
            if(j+1==arr.length-1 && flag ==1){
                j = -1;
                flag = 0;
            }
        }
        
        return arr;
    }

    //Main method
    public static void main(String[] args) throws FileNotFoundException{
        
        //Read the input file releasedates and store it into an array
        String[] arr = input("releasedates.txt");
        
        //Sort the array by name 
        arr = sortByName(arr);

        //Save the array sorted with name as SortedByName.txt
        output("SortedByName.txt",arr);
        
        //Read the input file releasedates and store it into an array
        String[] arr2 = input("releasedates.txt");
        //Sort the array by month
        arr2 = sortByMonth(arr2);
        //Save the array sorted with date as SortedByDate.txt
        output("SortedByDate.txt",arr2);
        
    }
}
