package com.integrated.student.information.app.facade.student.impl;

import com.integrated.student.information.app.facade.student.StudentFacade;
import com.integrated.student.information.app.model.student.Student;
import com.integrated.student.information.data.student.dao.StudentDao;
import com.integrated.student.information.data.student.dao.impl.StudentDaoImpl;

import java.util.ArrayList;
import java.util.List;
public class StudentFacadeImpl implements StudentFacade {
    private StudentDao studentDao = new StudentDaoImpl();
    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        students = studentDao.getAllStudents();

        return students;
    }

    @Override
    public List<Student> getStudentById(String studentId) {
        return null;
    }

    @Override
    public List<Student> getAllStudentById() {
        return null;
    }
}
