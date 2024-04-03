package com.student.information.management.appl.model.student;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * POJO class for Student objects.
 * */
public class Student {
    private String studentId;
    private String lastName;
    private String firstName;
    private String middleName;
    private String sex;
    private Timestamp birthday;
    private String religion;
    private String email;
    private String address;
    private String contactNumber;
    /**
     * This is the Constructor for Student.
     */
    public Student() {

    }

    /**
     * This is the Getter for Student Id.
     */
    public String getStudentId() {
        return studentId;
    }
    /**
     * This is the Setter for Student Id.
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    /**
     * This is the Getter for Last Name.
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * This is the Setter for Last Name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * This is the Getter for First Name.
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * This is the Setter for First Name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * This is the Getter for Middle Name.
     */
    public String getMiddleName() {
        return middleName;
    }
    /**
     * This is the Setter for Middle Name.
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    /**
     * This is the Getter for Sex.
     */
    public String getSex() {
        return sex;
    }
    /**
     * This is the Setter for Sex.
     */
    public void setSex(String sex) {
        this.sex = sex;
    }
    /**
     * This is the Getter for Birthday.
     */
    public Timestamp getBirthday() {
        return birthday;
    }
    /**
     * This is the Setter for Birthday.
     */
    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }
    /**
     * This is the Getter for Religion.
     */
    public String getReligion() {
        return religion;
    }
    /**
     * This is the Setter for Religion.
     */
    public void setReligion(String religion) {
        this.religion = religion;
    }
    /**
     * This is the Getter for Email.
     */
    public String getEmail() {
        return email;
    }
    /**
     * This is the Setter for Email.
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * This is the Getter for Address.
     */
    public String getAddress() {
        return address;
    }
    /**
     * This is the Setter for Address.
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * This is the Getter for Contact Number.
     */
    public String getContactNumber() {
        return contactNumber;
    }
    /**
     * This is Setter for Contact Number.
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

}
