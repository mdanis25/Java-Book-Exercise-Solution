package heartrate;

import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter birth day (1-31): ");
        int birthDay = scanner.nextInt();
        
        System.out.print("Enter birth month (1-12): ");
        int birthMonth = scanner.nextInt();


        System.out.print("Enter birth year: ");
        int birthYear = scanner.nextInt();

        HeartRates person = new HeartRates(firstName, lastName, birthDay, birthMonth, birthYear);


        System.out.println("\n--- Health Profile ---");
        person.displayInfo();

        scanner.close();

    }
}
