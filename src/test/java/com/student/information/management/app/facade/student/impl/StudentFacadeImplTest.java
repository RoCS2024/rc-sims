package com.student.information.management.app.facade.student.impl;

import com.student.information.management.app.facade.student.StudentFacade;
import com.student.information.management.app.model.student.Student;
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
    private StudentFacade studentFacade;
    @BeforeEach
    public void setUp() {
        studentFacade = new StudentFacadeImpl();
    }
    /**
     * This is to test get all students.
     */
    @Test
    public void testGetAllStudents() {
        Student student = new Student();
        List<String> studentIds = new ArrayList<>();
        studentIds.add("CT21-0073");
    }
    /**
     * This is to test get student by id.
     */
    @Test
    public void testGetStudentByID(){
        Student student = new Student();
        List<String> studentIds = new ArrayList<>();
        studentIds.add("CT21-0073");
    }
    /**
     * This is to test add student.
     */
    @Test
    public void testAddStudent() {
        Student student = new Student();
        List<String> studentIds = new ArrayList<>();
        studentIds.add("CT21-0073");
    }
    /**
     * This is to test update student.
     */
    @Test
    public void testUpdateStudent() {
        String studentId = "CT21-0073";
        Student student = new Student();
        student.setStudentId(studentId);

        Student mockStudent = mock(Student.class);
        when(mockStudent.getStudentId()).thenReturn(studentId);
        String retrievedStudentId = mockStudent.getStudentId();
        verify(mockStudent, times(1)).getStudentId();

    }
    /**
     * This is to test the non-existent student.
     */
    @Test
    public void testGetNonexistentStudent() {
        Student nonExistentStudent = studentFacade.getStudentById("CT21-9999");
        assertNull(nonExistentStudent);
    }
}