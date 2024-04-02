package com.student.information.management.data.utils;

/**
 * This is the query constant.
 */
public class QueryConstant {
    private QueryConstant() {
    }

    /**
     * Retrieve all students from STUDENT table
     */
    public static final String GET_ALL_STUDENTS_STATEMENT = "SELECT * FROM STUDENT";

    /**
     * Retrieve a student by their student ID from the STUDENT table
     */
    public static final String GET_STUDENT_BY_STUDENT_ID_STATEMENT = "SELECT * FROM STUDENT WHERE STUDENT_ID = ?";

    /**
     * Insert a new student into the STUDENT table
     */
    public static final String ADD_STUDENT_STATEMENT = "INSERT INTO STUDENT VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    /**
     * Update the existing student record in the STUDENT table
     */
    public static final String UPDATE_STATEMENT ="UPDATE student" +
            " SET last_name = ?, first_name = ?,  middle_name = ?, sex = ?, birthday = ?, religion = ?, email = ?, address = ?, contact_number = ?"
            + "  WHERE student_id = ?";
}
