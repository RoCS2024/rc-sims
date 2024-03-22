package com.student.information.management.data.student.dao;

import com.student.information.management.app.model.student.Student;

import java.sql.ResultSet;
import java.util.List;
/**
 *  The DAO separates business logic from database access code.
 * */
public interface StudentDao {
    List<Student> getAllStudents();
    /**
     * A list of all students.
     *
     * @return A list containing all students.
     */
    Student getStudentById(String id);
    /**
     * Get back a student by their own ID.
     *
     * @param studentId The ID of the student to get back.
     * @return The student object corresponding to the given ID, if it is not found it will
     * become null.
     */
    boolean addStudent(Student student);
    /**
     * Adds a new student.
     *
     * @param student The student to add.
     * @return True if the student was successfully added, it will become false if wrong.
     */
    List<Student> addStudents(ResultSet rs);
    boolean updateStudent(Student student) ;
    /**
     * Updates an existing student's information.
     *
     * @param student The student updated information.
     * @return True if the student was successfully updated, if wrong it will become false.
     */

}
