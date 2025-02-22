package healthrecords;


import java.time.LocalDate;
import java.time.Period;

public class HealthProfile {
    private String firstName, lastName, gender; 
    private int birthDay, birthMonth, birthYear; 
    private double height, weight; // height: inches and weight: pounds

    public HealthProfile(String firstName, String lastName, String gender, int birthMonth, int birthDay, int birthYear, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    
    public int getAge() {
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate currDate = LocalDate.now(); 
        return Period.between(birthDate, currDate).getYears();
    }


    public int getMaximumHeartRate() {
        return 220 - getAge();
    }

    public String getTargetHeartRate() {
        double minTargetHeartRate = (50 * getMaximumHeartRate()) / 100;
        double maxTargetHeartRate = (85 * getMaximumHeartRate()) / 100;
        return String.format("%.2f - %.2f", minTargetHeartRate, maxTargetHeartRate);
    }

    
    public double getBMI() {
        return (weight * 703) / (height * height);
    }
 
    public void displayInfo() {
        System.out.println("\n--- Health Profile ---");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Date of Birth: " + birthMonth + "/" + birthDay + "/" + birthYear);
        System.out.println("Age: " + getAge() + " years");
        System.out.println("Height: " + height + " inches");
        System.out.println("Weight: " + weight + " pounds");
        System.out.println("BMI: " + String.format("%.2f", getBMI()));
        System.out.println("Maximum Heart Rate: " + getMaximumHeartRate() + " bpm");
        System.out.println("Target Heart Rate Range: " + getTargetHeartRate());

        // BMI Chart
        System.out.println("\n--- BMI Values ---");
        System.out.println("Underweight: BMI < 18.5");
        System.out.println("Normal weight: 18.5 - 24.9");
        System.out.println("Overweight: 25 - 29.9");
        System.out.println("Obese: BMI >= 30");
    }


}

