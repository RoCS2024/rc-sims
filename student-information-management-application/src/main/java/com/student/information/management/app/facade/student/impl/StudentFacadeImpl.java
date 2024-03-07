package com.student.information.management.app.facade.student.impl;

import com.student.information.management.app.facade.student.StudentFacade;
import com.student.information.management.app.model.student.Student;
import com.student.information.management.data.student.dao.StudentDao;
import com.student.information.management.data.student.dao.impl.StudentDaoImpl;

import java.util.List;
/**
 * This is the Student Facade Impl.
 */
public class StudentFacadeImpl implements StudentFacade {
    StudentDao studentDao = new StudentDaoImpl();
    /**
     * This is get all students.
     */
    @Override
    public List<Student> getAllStudents() { return studentDao.getAllStudents(); }
    @Override
    public Student getStudentById(String student_id) throws RuntimeException {
        return studentDao.getStudentById(student_id);
    }
    /**
     * This is adding student.
     */
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
    /**
     * This is update student.
     */
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
