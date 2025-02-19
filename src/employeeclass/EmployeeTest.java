package employeeclass;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Md", "Anis", 50000);
        System.out.println("Employee 1: " + employee1.getFirstName() + " " + employee1.getLastName()); 
        System.out.println("Monthly Salary: " + employee1.getMonthlySalary());
    }
}
