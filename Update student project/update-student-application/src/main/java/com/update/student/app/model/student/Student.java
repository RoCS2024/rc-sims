package com.update.student.app.model.student;


import java.sql.Timestamp;

public class Student {

    public String student_id;
    private String last_name;
    private String first_name;
    private String middle_name;
    private String sex;
    private Timestamp birthday;
    private String religion;
    private String email;
    private String address;
    private String contact_number;

    public Student(){

    }


    public String getId() {
        return student_id;
    }
    public void setId(String student_id){
        this.student_id = student_id;
    }

    public String getLastname() {
        return last_name;
    }
    public void setLastname(String last_name){
        this.last_name = last_name;
    }

    public String getFirstname() {
        return first_name;
    }
    public void setFirstname(String first_name){
        this.first_name = first_name;
    }

    public String getMiddlename() {
        return middle_name;
    }
    public void setMiddlename(String middle_name){
        this.middle_name = middle_name;
    }

    public String getSex() {
        return sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }

    public Timestamp getBirthday() {
        return birthday;
    }
    public void setBirthday(Timestamp birthday){
        this.birthday = birthday;
    }

    public String getReligion() {
        return religion;
    }
    public void setReligion(String religion){
        this.religion = religion;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String getContactnumber() {
        return contact_number;
    }
    public void setContactnumber(String contact_number){
        this.contact_number = contact_number;
    }
}


