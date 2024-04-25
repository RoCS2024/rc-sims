package com.student.information.management.appl.facade.student.impl;

import com.student.information.management.appl.facade.student.StudentFacade;
import com.student.information.management.appl.model.student.Student;
import com.student.information.management.data.student.dao.StudentDao;
import com.student.information.management.data.student.dao.impl.StudentDaoImpl;

import java.util.List;
/**
 * An implementation class of the StudentFacade.
 */
public class StudentFacadeImpl implements StudentFacade {

    private StudentDao studentDao;

    /**
     * This creates a new StudentFacadeImpl
     * @param studentDao this helps for managing student data.
     */
    public StudentFacadeImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

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

    @Override
    public Student findStudentByEmail(String email) {
        return  studentDao.findStudentByEmail(email);
    }

}
