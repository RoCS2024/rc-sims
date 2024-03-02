package com.update.student.app.facade.student.impl;

import com.update.student.app.facade.student.StudentFacade;
import com.update.student.app.model.student.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentFacadeImplTest {

    private StudentFacade studentFacade;

    @BeforeEach
    public void setUp() {
        studentFacade = new StudentFacadeImpl();
    }

    @Test
    public void testGetStudentById() {
        Student expectedStudent = new Student();
        expectedStudent.setId("CT21-1111");
        expectedStudent.setLastname("Digo");
        expectedStudent.setFirstname("Joven");
        expectedStudent.setMiddlename("G");
        expectedStudent.setSex("Male");
        expectedStudent.setBirthday(null);
        expectedStudent.setReligion("Catholic");
        expectedStudent.setEmail("joven.digo3@email.com");
        expectedStudent.setAddress("SanFrancisco");
        expectedStudent.setContactnumber("09567838483");
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
