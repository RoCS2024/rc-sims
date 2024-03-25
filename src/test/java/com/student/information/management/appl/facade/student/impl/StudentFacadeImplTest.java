package com.student.information.management.appl.facade.student.impl;

import com.student.information.management.appl.facade.student.StudentFacade;
import com.student.information.management.appl.model.student.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.*;

/**
 * This is to test student facade impl.
 */
class StudentFacadeImplTest {
//    private StudentFacade studentFacade;
//    @BeforeEach
//    public void setUp() {
//        studentFacade = new StudentFacadeImpl();
//    }
//    /**
//     * This is to test get all students.
//     */
//    @Test
//    public void testGetAllStudents() {
//        Student student = new Student();
//        List<String> studentIds = new ArrayList<>();
//        studentIds.add("CT21-0073");
//    }
//    /**
//     * This is to test get student by id.
//     */
//    @Test
//    public void testGetStudentByID(){
//        Student student = new Student();
//        List<String> studentIds = new ArrayList<>();
//        studentIds.add("CT21-0073");
//    }
//    /**
//     * This is to test add student.
//     */
//    @Test
//    public void testAddStudent() {
//        Student student = new Student();
//        List<String> studentIds = new ArrayList<>();
//        studentIds.add("CT21-0073");
//    }
//    /**
//     * This is to test update student.
//     */
//    @Test
//    public void testUpdateStudent() {
//        // Arrange
//        String studentId = "CT21-0073";
//        Student student = new Student();
//        student.setStudentId(studentId);
//
//        // Create mock object
//        Student mockStudent = mock(Student.class);
//
//        // Act
//        when(mockStudent.getStudentId()).thenReturn(studentId);
//        String retrievedStudentId = mockStudent.getStudentId();
//
//        // Assert
//        assertEquals(studentId, retrievedStudentId);
//        verify(mockStudent, times(1)).getStudentId();
//    }
}