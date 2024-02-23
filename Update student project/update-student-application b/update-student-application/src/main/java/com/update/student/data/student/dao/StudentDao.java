package com.update.student.data.student.dao;

import com.update.student.app.model.student.Student;

import java.util.List;
import java.sql.SQLException;


public interface StudentDao {


   Student getStudentById(String student_id) ;
    boolean updateStudent(Student student) ;

    //    List<Student> getAllStudents() throws SQLException;



}
