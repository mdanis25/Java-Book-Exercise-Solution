package heartrate;

import java.time.LocalDate; 
import java.time.Period;


public class HeartRates {
    private String firstName, lastName;
    private int birthDay, birthMonth, birthYear; 

    public HeartRates(String firstName, String lastName, int birthDay, int birthMonth, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
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



    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
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

    public void displayInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Date of Birth: " + birthMonth + "/" + birthDay + "/" + birthYear);
        System.out.println("Age: " + getAge() + " years");
        System.out.println("Maximum Heart Rate: " + getTargetHeartRate() + " bpm");
        System.out.println("Target Heart Rate Range: " + getTargetHeartRate());
    }

}
