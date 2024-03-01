package com.student.view.app.facade.student.impl;

import com.student.view.app.facade.student.StudentFacade;
import com.student.view.app.model.student.Student;
import com.student.view.data.student.dao.StudentDao;
import com.student.view.data.student.dao.impl.StudentDaoImpl;

import java.util.ArrayList;
import java.util.List;
// kukunin ang get student by id
public class StudentFacadeImpl implements StudentFacade {

    private StudentDao studentDao = new StudentDaoImpl();
    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        students = studentDao.getAllStudents();

        return students;
    }

    @Override
    public Student getStudentById(String studentId) {
        return studentDao.getStudentById(studentId);
    }




}
