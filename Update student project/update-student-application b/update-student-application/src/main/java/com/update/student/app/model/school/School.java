package com.update.student.app.model.school;

public class School {
    private int school_id;
    public String stud_id;

    public String school_level;
    public String school_year;
    public String school_name;

    public School(int school_id, String stud_id, String school_level, String school_year, String school_name){

    this.school_id = school_id;
    this.stud_id = stud_id;
    this.school_level = school_level;
    this.school_year = school_year;
    this. school_name = school_name;
    }

    public int getSchool_id(){return school_id;}

    public void setSchool_id(int school_id) {
        this.school_id = school_id;
    }
}
