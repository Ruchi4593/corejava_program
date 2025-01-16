 /*Write java program to check  candidate eligible for voting or not*/

package basic;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.println("Enter your age: ");
        int age = scanner.nextInt(); // Input age from the user

        // Check if the candidate is eligible to vote
        // A person is eligible to vote if their age is 18 or more
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // Close the Scanner object
        scanner.close();
        
        /*
         Output:
         Enter your age: 
         16
         You are not eligible to vote.
         */
    }
}