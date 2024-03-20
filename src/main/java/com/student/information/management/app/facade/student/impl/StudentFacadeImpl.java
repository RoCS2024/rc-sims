package com.student.information.management.app.facade.student.impl;

import com.student.information.management.app.facade.student.StudentFacade;
import com.student.information.management.app.model.student.Student;
import com.student.information.management.data.student.dao.StudentDao;
import com.student.information.management.data.student.dao.impl.StudentDaoImpl;

import java.util.List;
/**
 *FacadeImpl covers the complexities of database interactions, such as establishing connections, running queries, and managing transactions, behind a simple interface.
 *This encapsulation keeps the rest of the application away from the complexities of database operations, making it easier to work with.
 *Access to database functionality is made easier and more unified through this interface.
 *This reduces the cognitive load on developers who need to interact with the database
 *because they only need to be familiar with the methods exposed by the facade,
 *not the internal workings of database interactions.
 **/
public class StudentFacadeImpl implements StudentFacade {
    StudentDao studentDao = new StudentDaoImpl();

    @Override
    public List<Student> getAllStudents() { return studentDao.getAllStudents(); }

    @Override
    public Student getStudentById(String student_id) throws RuntimeException {
        return studentDao.getStudentById(student_id);
    }

    @Override
    public boolean addStudent(Student student) {
        boolean result = false;
        try {
            Student targetStudent = getStudentById(student.getStudentId());
            if(targetStudent != null) {
                throw new Exception("Student to add already exists. ");
            }
            result = studentDao.addStudent(student);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        return result;
    }

    @Override
    public boolean updateStudent(Student student) {
        boolean result = false;
        try {
            Student targetStudent = getStudentById(student.getStudentId());
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
