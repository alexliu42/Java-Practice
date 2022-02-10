/*
 *Program Name:	ComputeTriangleArea.java
 *Author:		Alex Liu
 *Date:		    January 24, 2021
 *Course:		CPSC 1150 - W05
 *Instructor:	Leo Pan
*/

import java.util.Scanner;

// Purpose: To get three points (x1, y1), (x2, y2), (x3, y3) of a triangle and display its area (keep two digits after the decimal point)

public class ComputeTriangleArea {

    // Main method
    public static void main(String[] args) {
        
        // Get three points (x1, y1), (x2, y2), (x3, y3) of a triangle
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three points for a triangle: ");
        Double x1 = scanner.nextDouble();
        Double y1 = scanner.nextDouble();
        Double x2 = scanner.nextDouble();
        Double y2 = scanner.nextDouble();
        Double x3 = scanner.nextDouble();
        Double y3 = scanner.nextDouble();
        scanner.close();

        // Calculate three sides from given formula        
        Double side1 = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2)); 
        Double side2 = Math.sqrt(Math.pow(x1-x3,2) + Math.pow(y1-y3,2));
        Double side3 = Math.sqrt(Math.pow(x2-x3,2) + Math.pow(y2-y3,2));
        
        // Calculate s from given formula
        Double s =(side1 + side2 + side3) / 2;
        
        // Caluclate area from given formula
        Double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        
        // Display the area with two digits after the decimal
        System.out.print("The area of the triangle is: ");
        System.out.printf("%.2f", area);
        
    }
}
