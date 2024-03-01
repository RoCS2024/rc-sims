package com.student.information.management.add.data.student.dao;

import com.student.information.management.add.app.model.student.Student;

import java.sql.ResultSet;
import java.util.List;
/**
 * This is the Student Dao Interface.
 */
public interface StudentDao {
    List<Student> getAllStudents();
    Student getStudentById(String id);
    boolean addStudent(Student student);
    Student addStudents(ResultSet rs);
}
