package com.integrated.student.information.data.student.dao;

import com.integrated.student.information.app.model.student.Student;

import java.util.List;

public interface StudentDao {
    List<Student> getAllStudents();

    List<Student> getStudentById();

    Student getStudentById(String id);
}
