package com.student.information.management.data.utils;

/**
 * Inside the QueryConstants class contains constants representing SQL queries for managing employee information.
 */
public class QueryConstant {
    /**
     * SQL query to retrieves all students from the database.
     */
    public static final String GET_ALL_STUDENTS_STATEMENT = "SELECT * FROM STUDENT";

    /**
     * SQL query to retrieves an student by their Student Number from the database.
     */
    public static final String GET_STUDENT_BY_STUDENT_ID_STATEMENT = "SELECT * FROM STUDENT WHERE STUDENT_ID = ?";

    /**
     * SQL query that adds a new student to the database.
     */
    public static final String ADD_STUDENT_STATEMENT = "INSERT INTO STUDENT VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    /**
     * SQL query to updates an existing student in the database.
     */
    public static final String UPDATE_STATEMENT = "UPDATE student" +
            " SET last_name = ?, first_name = ?,  middle_name = ?, sex = ?, birthday = ?, religion = ?, email = ?, address = ?, contact_number = ?"
            + "  WHERE student_id = ?";
    /**
     * SQL query to find an existing email of the student in the database.
     */
    public static final String FIND_STUDENT_BY_EMAIL_STATEMENT = "SELECT * FROM STUDENT WHERE email = ?";
}
