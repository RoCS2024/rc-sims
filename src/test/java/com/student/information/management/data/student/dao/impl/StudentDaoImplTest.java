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
//    /**
//     * This is to test get student by id.
//     */
//    @Test
//    public void testGetStudentById() {
//        StudentDao studentDao = mock(StudentDao.class);
//
//        Student student1 = new Student();
//
//        List<Student> students = new ArrayList<>();
//        students.add(student1);
//
//        when(studentDao.getStudentById("CT21-0073")).thenReturn(student1);
//        assertEquals(students.size(), 1);
//    }
//    /**
//     * This is to test add student.
//     */
//    @Test
//    public void testAddStudent() {
//        Student student = new Student();
//
//        when(studentDao.addStudent(student)).thenAnswer(new Answer<Boolean>() {
//            @Override
//            public Boolean answer(InvocationOnMock invocationOnMock) throws Throwable {
//                Object[] arguments = invocationOnMock.getArguments();
//                if (arguments != null && arguments.length > 0 && arguments[0] != null) {
//                    students.add(student);
//                    return true;
//                }
//                return false;
//            }
//        });
//
//        studentDao.addStudent(student);
//
//        when(studentDao.getAllStudents()).thenReturn(students);
//        List<Student> studentList = studentDao.getAllStudents();
//
//        assertEquals(studentList.size(), 1);
//    }
//    /**
//     * This is to test Update Student.
//     */
//
//
//    @Test
//    void testUpdateStudentById() {
//        StudentDao studentDao = mock(StudentDao.class);
//
//        Student testStudent = new Student();
//        testStudent.setStudentId("CT21-0073");
//        testStudent.setLastName("Amulong");
//
//        when(studentDao.updateStudent(any(Student.class))).thenReturn(true);
//
//        boolean result = studentDao.updateStudent(testStudent);
//
//        assertTrue(result, "Update should be successful");
//
//        verify(studentDao, times(1)).updateStudent(testStudent);
//
//        when(studentDao.getStudentById("CT21-0073")).thenReturn(testStudent);
//
//        Student updatedStudent = studentDao.getStudentById(testStudent.getStudentId());
//
//        assertNotNull(updatedStudent, "Updated student should not be null");
//        assertEquals(testStudent.getLastName(), updatedStudent.getLastName(), "Student's last name should be updated");
//    }
}