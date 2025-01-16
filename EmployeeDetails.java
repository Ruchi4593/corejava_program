package basic;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables to hold employee details
        int employeeId;
        String employeeName;
        String employeeAddress;
        double employeeSalary;

        // Prompt user for input and store the values
        System.out.println("Enter Employee ID: ");
        employeeId = scanner.nextInt(); // Taking Employee ID as integer

        scanner.nextLine(); // Consume the newline character left by nextInt()

        System.out.println("Enter Employee Name: ");
        employeeName = scanner.nextLine(); // Taking Employee Name as a string

        System.out.println("Enter Employee Address: ");
        employeeAddress = scanner.nextLine(); // Taking Employee Address as a string

        System.out.println("Enter Employee Salary: ");
        employeeSalary = scanner.nextDouble(); // Taking Employee Salary as a double

        // Display the employee details
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Address: " + employeeAddress);
        System.out.println("Employee Salary: " + employeeSalary);

        // Close the Scanner
        scanner.close();
        
        /*
        Output:
        	Enter Employee ID: 
        	101
        	Enter Employee Name: 
        	Riya Khan
        	Enter Employee Address: 
        	123 Main Street
        	Enter Employee Salary: 
        	50000

        	--- Employee Details ---
        	Employee ID: 101
        	Employee Name: Riya Khan
        	Employee Address: 123 Main Street
        	Employee Salary: 50000
        	*/
    }
}
