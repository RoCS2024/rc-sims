package com.student.information.management.appl.facade.student.impl;

import com.student.information.management.appl.facade.student.StudentFacade;
import com.student.information.management.appl.model.student.Student;
import com.student.information.management.data.student.dao.StudentDao;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.*;

/**
 * This is to test student facade impl.
 */
class StudentFacadeImplTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentFacadeImplTest.class);

    @InjectMocks
    private StudentFacadeImpl studentFacade;

    @Mock
    private StudentDao studentDao;

    @Mock
    private List<Student> studentList;

    @Mock
    private Student student;

    @Mock
    private Student addStudent;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        student.setStudentId("1");
        addStudent.setStudentId("2");
        when(studentDao.getAllStudents()).thenReturn(studentList);
    }

    @AfterEach
    public void validate() {
        validateMockitoUsage();
    }

    @Test
    public void testGetAllStudents() {
        List expectedList = studentFacade.getAllStudents();

        assert(expectedList.equals(studentList));
        verify(studentDao).getAllStudents();
    }

    @Test
    public void testGetStudentById() {
        when(studentDao.getStudentById("1")).thenReturn(student);
        Student expectedStudent = studentFacade.getStudentById("1");

        assert(expectedStudent.equals(student));

        verify(studentDao).getStudentById("1");
    }

    @Test
    public void testAddStudent() {
        try {
            when(studentFacade.getStudentById(addStudent.getStudentId())).thenReturn(null);
            when(studentDao.addStudent(addStudent)).thenReturn(true);

            boolean result = studentFacade.addStudent(addStudent);

            assert(result == true);

            assert(studentFacade.getStudentById("2") == null);
            verify(studentDao).addStudent(addStudent);
        } catch (Exception e) {
            LOGGER.error("Exception caught: " + e.getMessage());
        }

    }

    @Test
    public void testUpdateStudent() {
        try {
            when(studentDao.getStudentById(student.getStudentId())).thenReturn(student);
            when(studentDao.updateStudent(student)).thenReturn(true);

            boolean result = studentFacade.updateStudent(student);

            assert(result == true);

            assert(studentFacade.getStudentById("1").equals(student));

            verify(studentDao).updateStudent(student);
        } catch (Exception e) {
            LOGGER.error("Exception caught: " + e.getMessage());
        }
    }
}