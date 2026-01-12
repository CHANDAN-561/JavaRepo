package OOP.Section03;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Contact {
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    public Contact (String name, String phoneNumber, String birthDate) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = toAge (birthDate);
    }

    public Contact (Contact source) {
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age = toAge (source.birthDate);
    }

    //getters
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return age;
    }

    //setter
    public void setName (String name) {
        this.name = name;
    }

    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBirthDate (String birthDate) {
        this.birthDate = birthDate;
        setAge (toAge (birthDate));
    }

    private void setAge (int age) {
        this.age = age;
    }

    private int toAge(String dateOfBirth) {
        LocalDate parsedBirthDate = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern ("dd/MM/yyyy"));
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between (parsedBirthDate, currentDate);
        return period.getYears();
    }

    public String toString() {
        return "Name: " + this.getName() + "\nPhoneNumber: " + this.getPhoneNumber() + "\nBirthDate: " + this.getBirthDate() + "\nAge: " + this.getAge();
    }
}
