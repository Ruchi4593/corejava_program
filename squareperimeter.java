/*write a program to find the perimeter of the square*/
package basic;

import java.util.Scanner;

public class SquarePerimeter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Declare a variable to hold the side length of the square
        double sideLength;

        // Prompt the user to enter the side length
        System.out.println("Enter the side length of the square: ");
        sideLength = scanner.nextDouble(); // Taking the side length as a double

        // Calculate the perimeter of the square
        // Formula: Perimeter = 4 * sideLength
        double perimeter = 4 * sideLength;

        // Display the calculated perimeter
        System.out.println("The perimeter of the square is: " + perimeter);

        // Close the Scanner
        scanner.close();
        
        /*
        Output:
       
        	Enter the side length of the square: 
        	5
        	The perimeter of the square is: 20.0
        */
    }
}