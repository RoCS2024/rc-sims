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
    List<Student> getAllStudents();
    Student getStudentById(String id);
    boolean addStudent(Student student);
    List<Student> addStudents(ResultSet rs);
    boolean updateStudent(Student student) ;

}
