package com.student.information.management.appl.model.student;

import java.sql.Timestamp;

/**
 * POJO class for Student objects. This class represents the student information.
 * */
public class Student {
    /** A unique student id of the student. */
    private String studentId;
    /** The last Name of the student. */
    private String lastName;
    /** The first Name of the student. */
    private String firstName;
    /** The middle Name of the student. */
    private String middleName;
    /** The sex of the student. */
    private String sex;
    /** It is the birthday of the student. */
    private Timestamp birthday;
    /** The religion of the student. */
    private String religion;
    /** A unique student email of the student. */
    private String email;
    /** The complete address of the student. */
    private String address;
    /** A unique contact number of the student. */
    private String contactNumber;

    /***
     * Default constructor of the Student class.
     */
    public Student() {

    }

    /**
     * This gets the Student Id.
     * @return the student's Id.
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * This sets the student id
     * @param studentId is the ID to be set.
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * This gets the Last Name.
     * @return the Last Name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This sets the Last Name.
     * @param lastName is the Last Name to be set.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This gets the First Name.
     * @return The First Name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This sets for First Name.
     * @param firstName is the First Name to be set.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This gets for Middle Name.
     * @return The Middle Name.
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * This sets for Middle Name.
     * @param middleName is the Middle Name to be set.
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * This gets the Sex.
     * @return The Sex.
     */
    public String getSex() {
        return sex;
    }

    /**
     * This sets for Sex.
     * @param sex is the Sex to be set.
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * This gets the Birthday.
     * @return The Birthday.
     */
    public Timestamp getBirthday() {
        return birthday;
    }

    /**
     * This sets for Birthday.
     * @param birthday is the Birthday to be set.
     */
    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    /**
     * This gets for Religion.
     * @return The Religion.
     */
    public String getReligion() {
        return religion;
    }

    /**
     * This sets for Religion.
     * @param religion is the Religion to be set.
     */
    public void setReligion(String religion) {
        this.religion = religion;
    }

    /**
     * This gets for Email.
     * @return The Email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * This sets for Email.
     * @param email is the Email to be set.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This gets for Address.
     * @return The Address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * This sets for Address.
     * @param address is the Address to be set.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This gets for Contact Number.
     * @return The Contact Number.
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * This gets for Contact Number.
     * @param contactNumber is the Contact Number to be set.
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
