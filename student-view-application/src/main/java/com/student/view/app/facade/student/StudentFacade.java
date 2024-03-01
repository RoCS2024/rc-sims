package com.student.view.app.facade.student;

import com.student.view.app.model.student.Student;

import java.util.List;
// kukunin ang get student by id facade muna bago impl
public interface StudentFacade {
    List<Student> getAllStudents();

    Student getStudentById(String studentId);

}

