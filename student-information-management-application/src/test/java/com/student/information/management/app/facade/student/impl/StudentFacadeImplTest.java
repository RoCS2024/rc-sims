package com.student.information.management.app.facade.student.impl;

import com.student.information.management.app.facade.student.StudentFacade;
import com.student.information.management.app.model.student.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


class StudentFacadeImplTest {
    private StudentFacade studentFacade;
    @BeforeEach
    public void setUp() {
        studentFacade = new StudentFacadeImpl();
    }
    @Test
    public void testGetAllStudents() {
        Student student = new Student();
        List<String> studentIds = new ArrayList<>();
        studentIds.add("CT21-0073");
    }
    @Test
    public void testGetStudentByID(){
        Student student = new Student();
        List<String> studentIds = new ArrayList<>();
        studentIds.add("CT21-0073");
    }

    @Test
    public void testAddStudent() {
        Student student = new Student();
        List<String> studentIds = new ArrayList<>();
        studentIds.add("CT21-0073");
    }

    @Test
    public void testUpdateStudent() {
        Student existingStudent = studentFacade.getStudentById("CT21-1111");
        existingStudent.setAddress("SanFrancisco");
        studentFacade.updateStudent(existingStudent);

        Student updatedStudent = studentFacade.getStudentById("CT21-1111");

        assertEquals("SanFrancisco", updatedStudent.getAddress());
    }

    @Test
    public void testGetNonexistentStudent() {
        Student nonExistentStudent = studentFacade.getStudentById("CT21-9999");
        assertNull(nonExistentStudent);
    }
}