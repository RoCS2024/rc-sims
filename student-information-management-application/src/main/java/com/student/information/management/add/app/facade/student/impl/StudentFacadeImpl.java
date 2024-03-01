package com.student.information.management.add.app.facade.student.impl;

import com.student.information.management.add.app.facade.student.StudentFacade;
import com.student.information.management.add.app.model.student.Student;
import com.student.information.management.add.data.student.dao.StudentDao;
import com.student.information.management.add.data.student.dao.impl.StudentDaoImpl;

import java.util.List;

/**
 * This is the StudentFacadeImpl.
 */
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
}
