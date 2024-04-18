package com.student.information.management.data.student.dao;

import com.student.information.management.appl.model.student.Student;

import java.sql.ResultSet;
import java.util.List;
/**
 * Interface for Student Data Access Object.
 * */
public interface StudentDao {
    /**
     * Retrieves all Students from the database.
     *
     * @return list of all students.
     * */
    List<Student> getAllStudents();

    /**
     * Retrieves a Student from the database with specified id.
     *
     * @param id the id of the students.
     * @return the Student.
     * */
    Student getStudentById(String id);

    /**
     * Adds a Student to the database.
     *
     * @param student student to add.
     * @return true if adding is successful.
     * */
    boolean addStudent(Student student);

    /**
     * Adds Students to the database.
     *
     * @param rs student to add.
     * @return list of  students.
     * */
    List<Student> addStudents(ResultSet rs);

    /**
     * Updates a Student in the database.
     *
     * @param student  student to update.
     * @return true if update is successful.
     * */
    boolean updateStudent(Student student) ;

    /**
     * Finds an email in the database.
     *
     * @param email email to find.
     * @return true if finding email is successful.
     * */
    Student findStudentByEmail(String email);
}
