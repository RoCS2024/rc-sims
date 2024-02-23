package com.update.student.app.facade.student.impl;

import com.update.student.app.facade.student.StudentFacade;
import com.update.student.app.model.student.Student;
import com.update.student.data.student.dao.StudentDao;
import com.update.student.data.student.dao.impl.StudentDaoImpl;




public class StudentFacadeImpl implements StudentFacade {
    StudentDao studentDao = new StudentDaoImpl();


    @Override
    public Student getStudentById(String student_id) {
        return studentDao.getStudentById(student_id);
    }

    @Override
    public boolean updateStudent(Student student) {
        boolean result = false;
        try {
            Student targetStudent = getStudentById(student.getId());
            if (targetStudent == null) {
                throw new Exception("Student to update not found. ");
            }
            result = studentDao.updateStudent(student);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        return result;
    }
}




