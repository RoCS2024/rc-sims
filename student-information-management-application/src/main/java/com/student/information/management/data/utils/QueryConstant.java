package com.student.information.management.data.utils;

public class QueryConstant {
    private QueryConstant() {
    }

    public static final String GET_ALL_STUDENTS_STATEMENT = "SELECT * FROM STUDENT";
    public static final String GET_STUDENT_BY_STUDENT_ID_STATEMENT = "SELECT * FROM STUDENT WHERE STUDENT_ID = ?";
    public static final String ADD_STUDENT_STATEMENT = "INSERT INTO STUDENT VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public static final String UPDATE_STATEMENT ="UPDATE student" +
            " SET last_name = ?, first_name = ?,  middle_name = ?, sex = ?, religion = ?, email = ?, address = ?, contact_number = ?"
            + "  WHERE student_id = ?";
}
