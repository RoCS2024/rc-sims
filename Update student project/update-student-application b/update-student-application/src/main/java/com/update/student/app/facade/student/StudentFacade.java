package com.update.student.app.facade.student;

import com.update.student.app.model.student.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentFacade {

//    List<Student>getAllStudents() throws SQLException;
//
    Student getStudentById(String student_id) ;

    boolean updateStudent(Student student);

//   Student updateStudent(String updateId) throws SQLException;
}
