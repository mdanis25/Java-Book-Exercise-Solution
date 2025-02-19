package employeeclass;

public class Employee {
    private String firstName, lastName; 
    private double monthlySalary; 

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = (monthlySalary > 0) ? monthlySalary : 0.0;    
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }


    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = (monthlySalary > 0) ? monthlySalary : 0.0;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
    
    
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public double getYearlySalaryIncrease() {
        return getYearlySalary() * 0.1;
    }

}
