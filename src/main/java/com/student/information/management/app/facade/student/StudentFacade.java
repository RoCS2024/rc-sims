package com.student.information.management.app.facade.student;

import com.student.information.management.app.model.student.Student;

import java.util.List;
/**
 * Student Facades conceal the complexity of underlying subsystems
 * from the rest of the application.
 **/
public interface StudentFacade {
    List<Student> getAllStudents();
    /**
     * Get back a list of all students.
     *
     * @return List containing all students.
     */
    Student getStudentById(String studentId);
    /**
     * Get back a student by their own ID.
     *
     * @param studentId The ID of the student to get back.
     * @return The student object agree with the given ID, or if it is not found it will be null.
     */
    boolean addStudent(Student student);
    /**
     * Adds a new student.
     *
     * @param student The student to add.
     * @return True if the student was successfully added, if wrong it will become false.
     */
    boolean updateStudent(Student student);
    /**
     * Updates an existing student's information.
     *
     * @param student The student updated information.
     * @return True if the student was successfully updated, if wrong it will become false.
     */
}
