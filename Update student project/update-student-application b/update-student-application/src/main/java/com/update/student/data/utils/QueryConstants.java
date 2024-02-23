package com.update.student.data.utils;


public class QueryConstants {
    private QueryConstants(){

    }

    //public static final String GET_ALL_STUDENTS_STATEMENT = "SELECT * FROM student";
    public static final String GET_STUDENT_BY_ID_STATEMENT = "SELECT * FROM student WHERE student_id = ?";

    public static final String UPDATE_STATEMENT ="UPDATE student SET last_name = ?, " +
            "first_name = ?,  middle_name = ?," +
            "sex = ?,"  + "religion = ?, " + "email = ?, " + "address = ?, " + "contact_number = ?  WHERE student_id = ?";
}
