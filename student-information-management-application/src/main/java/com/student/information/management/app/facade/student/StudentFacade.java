package com.student.information.management.app.facade.student;

import com.student.information.management.app.model.student.Student;

import java.util.List;

public interface StudentFacade {
    List<Student> getAllStudents();
    Student getStudentById(String student_id);
    boolean addStudent(Student student);
}
