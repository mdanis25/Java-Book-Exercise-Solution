package employeeclass;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Md", "Anis", 50000);
        Employee employee2 = new Employee("Fatema Tuj Johura", "Safa", 60000);

        System.out.println("Employee 1: " + employee1.getFirstName() + " " + employee1.getLastName()); 
        System.out.println("Employee 2: " + employee2.getFirstName() + " " + employee2.getLastName());


        // Yearly Salary of Both Employee 
        System.out.println("Yearly Salary: " + employee1.getYearlySalary());
        System.out.println("Yearly Salary: " + employee2.getYearlySalary());

        // After give 10% increment of Yearly Salary
        employee1.giveRaise(10);
        employee2.giveRaise(10);
        System.out.println("Yearly Salary after 10% increment: " + employee1.getYearlySalary());
        System.out.println("Yearly Salary after 10% increment: " + employee2.getYearlySalary());
    }
}
