package com.student.information.management.app.facade.student;

import com.student.information.management.app.model.student.Student;

import java.util.List;
/**
 * This is the Student Facade.
 */
public interface StudentFacade {
    List<Student> getAllStudents();
    Student getStudentById(String studentId);
    boolean addStudent(Student student);
    boolean updateStudent(Student student);
}
