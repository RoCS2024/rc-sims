package com.student.view.data.student.dao.impl;

import com.student.view.app.model.student.Student;
import com.student.view.data.student.dao.StudentDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class StudentDaoImplTest {
    private StudentDao studentDao;
    private List<Student> students;

    @BeforeEach
    void setUp() {
        Student student1 = new Student();
        Student student2 = new Student();

        students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        studentDao = mock(StudentDao.class);
    }


    @Test
    void testGetAllStudents() {
        when(studentDao.getAllStudents()).thenReturn(students);

        List<Student> expectedStudents = studentDao.getAllStudents();
        assertEquals(expectedStudents, students);
        assertEquals(expectedStudents.size(), 2L);
    }

    @Test
    void testGetStudentById() {
        Student student = new Student();
        students.add(student);

        when(studentDao.getStudentById("CT21-0058")).thenReturn(student);

        Student expectedStudent = studentDao.getStudentById("CT21-0058");
        assertEquals(expectedStudent, student);
        assertEquals(expectedStudent.getFirstName(), "RAM");
    }






}