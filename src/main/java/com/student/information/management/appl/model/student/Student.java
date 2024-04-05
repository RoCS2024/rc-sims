package com.student.information.management.appl.model.student;

import java.sql.Timestamp;

/**
 * POJO class for Student objects.
 */
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
     * This is Getter for Student Id.
     * @return The Student Id.
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * This is Setter for Student Id.
     * @param studentId The Student Id to set.
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * This is Getter for Last Name.
     * @return The Last Name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This is Setter for Last Name.
     * @param lastName The Last Name to set.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This is Getter for First Name.
     * @return The First Name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This is Setter for First Name.
     * @param firstName The First Name to set.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This is Getter for Middle Name.
     * @return The Middle Name.
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * This is Setter for Middle Name.
     * @param middleName The Middle Name to set.
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * This is Getter for Sex.
     * @return The Sex.
     */
    public String getSex() {
        return sex;
    }

    /**
     * This is Setter for Sex.
     * @param sex The Sex to set.
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * This is Getter for Birthday.
     * @return The Birthday.
     */
    public Timestamp getBirthday() {
        return birthday;
    }

    /**
     * This is Setter for Birthday.
     * @param birthday The Birthday to set.
     */
    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    /**
     * This is Getter for Religion.
     * @return The Religion.
     */
    public String getReligion() {
        return religion;
    }

    /**
     * This is Setter for Religion.
     * @param religion The Religion to set.
     */
    public void setReligion(String religion) {
        this.religion = religion;
    }

    /**
     * This is Getter for Email.
     * @return The Email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * This is Setter for Email.
     * @param email The Email to set.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This is Getter for Address.
     * @return The Address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * This is Setter for Address.
     * @param address The Address to set.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This is Getter for Contact Number.
     * @return The Contact Number.
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * This is Setter for Contact Number.
     * @param contactNumber The Contact Number to set.
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
