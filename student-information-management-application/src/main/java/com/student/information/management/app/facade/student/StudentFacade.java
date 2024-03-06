package com.student.information.management.app.facade.student;

import com.student.information.management.app.model.student.Student;

import java.util.List;

public interface StudentFacade {
    List<Student> getAllStudents();

    List<Student> getAllStudentById(String studentId);

    Student getStudentById(String studentId);
    boolean addStudent(Student student);

    boolean updateStudent(Student student);
}
