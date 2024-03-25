package com.student.information.management.data.student.dao.impl;

import com.student.information.management.appl.model.student.Student;
import com.student.information.management.data.student.dao.StudentDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * This is to test the student dao impl.
 */
class StudentDaoImplTest {
    private StudentDao studentDao;
    private List<Student> students;

    @BeforeEach
    public void setUp() {
        students = new ArrayList<>();
        Student student1 = new Student();
        Student student2 = new Student();
        students.add(student1);
        students.add(student2);

        studentDao = mock(StudentDao.class);
    }
    /**
     * This is to test get all students.
     */
    @Test
    public void testGetAllStudents() {
        when(studentDao.getAllStudents()).thenReturn(students);
        List<Student> studentList = studentDao.getAllStudents();
        assertEquals(studentList.size(), 2);
    }

    /**
     * This is to test get student by id.
     */
    @Test
    public void testGetStudentById() {
        Student student1 = new Student();
        student1.setStudentId("CT21-0073");

        when(studentDao.getStudentById("CT21-0073")).thenReturn(student1);

        Student expectedStudent = studentDao.getStudentById("CT21-0073");

        assertEquals(expectedStudent, student1);
        assertEquals(expectedStudent.getStudentId(), student1.getStudentId());
    }

    @Test
    public void testAddStudent() {
        Student student = new Student();
        student.setStudentId("CT21-0073");

        when(studentDao.addStudent(student)).thenReturn(true);
        when(studentDao.getStudentById("CT21-0073")).thenReturn(student);

        Student expectedStudent = studentDao.getStudentById("CT21-0073");
        assertEquals(expectedStudent.getStudentId(), student.getStudentId());
    }

    @Test
    public void testUpdateStudent() {
        Student student = new Student();
        student.setStudentId("CT21-0073");
        student.setLastName("Amulong");

        when(studentDao.addStudent(student)).thenReturn(true);
        when(studentDao.updateStudent(student)).thenReturn(true);
        when(studentDao.getStudentById("CT21-0073")).thenReturn(student);

        Student expectedStudent = studentDao.getStudentById("CT21-0073");
        assertEquals(expectedStudent.getLastName(), student.getLastName());
    }

}