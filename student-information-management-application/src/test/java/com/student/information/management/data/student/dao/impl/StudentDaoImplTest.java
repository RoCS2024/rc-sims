package com.student.information.management.data.student.dao.impl;

import com.student.information.management.app.model.student.Student;
import com.student.information.management.data.student.dao.StudentDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/**
 * This is to test the student dao impl.
 */
class StudentDaoImplTest {
    @Mock
    private StudentDao studentDao;
    private List<Student> students;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        students = new ArrayList<>();
    }
    /**
     * This is to test get all students.
     */
    @Test
    public void testGetAllStudents() {
        StudentDao studentDao = mock(StudentDao.class);

        Student student = new Student();
        List<Student> students = new ArrayList<>();
        students.add(student);

        when(studentDao.getAllStudents()).thenReturn(students);
        List<Student> studentList = studentDao.getAllStudents();
        assertEquals(studentList.size(), 1);
    }
    /**
     * This is to test get student by id.
     */
    @Test
    public void testGetStudentById() {
        StudentDao studentDao = mock(StudentDao.class);

        Student student1 = new Student();

        List<Student> students = new ArrayList<>();
        students.add(student1);

        when(studentDao.getStudentById("CT21-0073")).thenReturn(student1);
        assertEquals(students.size(), 1);
    }
    /**
     * This is to test add student.
     */
    @Test
    public void testAddStudent() {
        Student student = new Student();

        when(studentDao.addStudent(student)).thenAnswer(new Answer<Boolean>() {
            @Override
            public Boolean answer(InvocationOnMock invocationOnMock) throws Throwable {
                Object[] arguments = invocationOnMock.getArguments();
                if (arguments != null && arguments.length > 0 && arguments[0] != null) {
                    students.add(student);
                    return true;
                }
                return false;
            }
        });

        studentDao.addStudent(student);

        when(studentDao.getAllStudents()).thenReturn(students);
        List<Student> studentList = studentDao.getAllStudents();

        assertEquals(studentList.size(), 1);
    }
    private static final String TEST_STUDENT_ID = "CT21-1111";
    /**
     * This is to test Update Student.
     */
    @Test
    void testUpdateStudent() {
        Student testStudent = new Student();
        testStudent.setStudentId(TEST_STUDENT_ID);
        testStudent.setLastName("Digo");


        boolean result = studentDao.updateStudent(testStudent);
        assertTrue(result);

        Student updatedStudent = studentDao.getStudentById(TEST_STUDENT_ID);
        assertEquals("Digo", updatedStudent.getLastName());
    }
}