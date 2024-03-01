package com.student.view.data.student.dao;

import com.student.view.app.model.student.Student;

import java.util.List;

public interface StudentDao {

    List<Student> getAllStudents();


    Student getStudentById(String id);
}
