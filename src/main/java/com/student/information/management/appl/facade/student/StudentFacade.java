package com.student.information.management.appl.facade.student;

import com.student.information.management.appl.model.student.Student;

import java.util.List;
/**
 * An interface to the Student Facade.
 */
public interface StudentFacade {

    /**
     * Retrieves all Students from the database.
     *
     * @return list of all students.
     * */
    List<Student> getAllStudents();

    /**
     * Retrieves a Student from the database with specified id.
     *
     * @param studentId the id of the students.
     * @return the Student.
     * */
    Student getStudentById(String studentId);

    /**
     * Adds a Student to the database.
     *
     * @param student student to add.
     * @return true if adding is successful.
     * */
    boolean addStudent(Student student);

    /**
     * Updates a Student in the database.
     *
     * @param student  student to update.
     * @return true if update is successful.
     * */
    boolean updateStudent(Student student);
}
