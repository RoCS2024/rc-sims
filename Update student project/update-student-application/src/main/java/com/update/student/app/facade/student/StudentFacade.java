package com.update.student.app.facade.student;

import com.update.student.app.model.student.Student;


public interface StudentFacade {

    Student getStudentById(String student_id) ;

    boolean updateStudent(Student student);


}
