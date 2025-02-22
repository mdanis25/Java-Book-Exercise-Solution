package healthrecords;

import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter gender (Male/Female): ");
        String gender = scanner.nextLine();

        System.out.print("Enter birth day (1-31): ");
        int birthDay = scanner.nextInt();

        System.out.print("Enter birth month (1-12): ");
        int birthMonth = scanner.nextInt();

        System.out.print("Enter birth year: ");
        int birthYear = scanner.nextInt();

        System.out.print("Enter height (in inches): ");
        double height = scanner.nextDouble();

        System.out.print("Enter weight (in pounds): ");
        double weight = scanner.nextDouble();

        // Creating a HealthProfile object
        HealthProfile person = new HealthProfile(firstName, lastName, gender, birthMonth, birthDay, birthYear, height, weight);

        // Displaying user information
        person.displayInfo();

        scanner.close();
    }

    
}
