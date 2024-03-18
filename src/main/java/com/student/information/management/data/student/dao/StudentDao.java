package com.student.information.management.data.student.dao;

import com.student.information.management.app.model.student.Student;

import java.sql.ResultSet;
import java.util.List;
/**
 * This is student dao interface.
 */
public interface StudentDao {
    List<Student> getAllStudents();
    Student getStudentById(String id);
    boolean addStudent(Student student);
    List<Student> addStudents(ResultSet rs);
    boolean updateStudent(Student student) ;

}
