package com.student.information.management.data.student.dao;

import com.student.information.management.app.model.student.Student;

import java.sql.ResultSet;
import java.util.List;

public interface StudentDao {
    List<Student> getAllStudents();
    Student getStudentById(String id);
    boolean addStudent(Student student);
    Student addStudents(ResultSet rs);
}
