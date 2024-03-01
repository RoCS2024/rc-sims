package com.student.information.management.add.app.model.student;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This is the Student Model.
 */
public class Student {
    private String studentId;
    private String lastName;
    private String firstName;
    private String middleName;
    private String sex;
    private String birthday;
    private String religion;
    private String email;
    private String address;
    private String contactNumber;

    public Student(){

    }

    public Student(String studentId, String lastName, String firstName, String middleName, String sex, String birthday, String religion, String email, String address, String contactNumber) {
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * Validation for student id should be have a pattern like CT00-0000.
     */
    private static List<String> existingStudentIds = new ArrayList<>();

    public static boolean isValidStudentId(String studentId) {
        String pattern = "CT\\d{2}-\\d{4}";
        if (studentId.matches(pattern)) {
            if (existingStudentIds.contains(studentId)) {
                System.out.println("Student ID " + studentId + " already exists.");
                return false;
            } else {
                existingStudentIds.add(studentId);
                return true;
            }
        } else {
            System.out.println("Invalid student ID format.");
            return false;
        }
    }
    /**
     * Validation for lastName it should be a string only.
     */
    public static boolean isValidLastName(String lastName) {
        return !lastName.isEmpty() && lastName.matches("[a-zA-Z ]+");
    }
    /**
     * Validation for firstName it should be a string only.
     */
    public static boolean isValidFirstName(String firstName) {
        return !firstName.isEmpty() && firstName.matches("[A-a-zZ ]+");
    }
    /**
     * Validation for middleName it should be a string only.
     */
    public static boolean isValidMiddleName(String middleName) {
        return !middleName.isEmpty() && middleName.matches("[A-a-zZ ]+");
    }
    /**
     * Validation for sex it should be a male or female only.
     */
    public static boolean isValidSex(String sex) {
        return sex.equalsIgnoreCase("Male") || sex.equalsIgnoreCase("Female");
    }
    /**
     * Validation for Birthday it should have this pattern MM/DD/YYYY.
     */
    public static boolean isValidBirthday(String birthday) {
        String[] parts = birthday.split("/");
        if (parts.length != 3)
            return false;

        int month, day, year;
        try {
            month = Integer.parseInt(parts[0]);
            day = Integer.parseInt(parts[1]);
            year = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            return false;
        }

        if (month < 1 || month > 12)
            return false;

        if (day < 1 || day > 31)
            return false;

        if (year < 1950 || year > 2100)
            return false;

        return true;
    }
    /**
     * Validation for religion it should be a string only.
     */
    public static boolean isValidReligion(String religion) {
        return !religion.isEmpty() && religion.matches("[a-zA-Z ]+");
    }
    /**
     * Validation for email it should have a @ and . input.
     */
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    /**
     * Validation for address it should not be null.
     */
    public static boolean isValidAddress(String address) {
        return address != null && !address.isEmpty();
    }
    /**
     * Validation for contact number it should be a number only.
     */
    public static boolean isValidContactNumber(String contactNumber) {
        String contactNumberRegex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(contactNumberRegex);
        Matcher matcher = pattern.matcher(contactNumber);
        return matcher.matches();
    }
}
