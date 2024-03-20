package com.student.information.management.data.student.dao;

import com.student.information.management.app.model.student.Student;

import java.sql.ResultSet;
import java.util.List;
/**
 * Interface for Student Data Access Object or what we called DAO. The DAO separates business logic from database access code.
 * This separation improves codebase maintainability by
 * ensuring that changes to the database schema or technology have no direct impact on the business logic.
 * DAO encourages modular design by providing a simple interface for accessing data.
 * This modular approach facilitates the independent management and testing of system components.
 * */
public interface StudentDao {
    /**
     * Retrieves all Students from the database
     * @return
     */
    List<Student> getAllStudents();

    /**
     * Student from the database with specified id.
     * @param id the id of the student
     * @return the student
     */
    Student getStudentById(String id);

    /**
     * Adds students from database.
     * @param student to add
     * @return true if adding student is successful.
     */
    boolean addStudent(Student student);
    /**
     * Adds students from database.
     * @return true if adding student is successful.
     */
    List<Student> addStudents(ResultSet rs);
    /**
     * Update students from database.
     * @param student to add
     * @return true if  you update adding student is successful.
     */
    boolean updateStudent(Student student) ;

}
