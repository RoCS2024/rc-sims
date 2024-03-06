package com.integrated.student.information.app.facade.student;

import com.integrated.student.information.app.model.student.Student;

import java.util.List;
public interface StudentFacade {
    List<Student> getAllStudents();

    List<Student> getStudentById(String studentId);


    List<Student> getAllStudentById();
}
