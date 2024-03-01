package com.update.student.data.student.dao;

import com.update.student.app.model.student.Student;



public interface StudentDao {


   Student getStudentById(String student_id) ;


    boolean updateStudent(Student student) ;

}
