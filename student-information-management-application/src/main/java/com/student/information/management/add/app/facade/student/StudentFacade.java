package com.student.information.management.add.app.facade.student;

import com.student.information.management.add.app.model.student.Student;

import java.util.List;

/**
 * This is the Student Facade.
 */
public interface StudentFacade {
    List<Student> getAllStudents();
    Student getStudentById(String student_id);
    boolean addStudent(Student student);
}
