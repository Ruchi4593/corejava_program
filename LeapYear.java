/*Write a program to check leap year using if else. How to check whether a given year is a leap year or not*/

package basic;

public class LeapYear {
    public static void main(String[] args) {
        // Example year to check
        int year = 2024;

        // Check if the year is a leap year
        // A year is a leap year if:
        // 1. It is divisible by 4, and
        // 2. It is not divisible by 100 unless it is also divisible by 400.
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
        
        /*
        Sample Outputs:
        	Case 1:
        	Year: 2024
        	Output: 2024 is a Leap Year.
        */
    }
}