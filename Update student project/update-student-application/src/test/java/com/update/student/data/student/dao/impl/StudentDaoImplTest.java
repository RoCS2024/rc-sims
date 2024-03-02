package com.update.student.data.student.dao.impl;
import com.update.student.app.model.student.Student;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentDaoImplTest {

    private static final String TEST_STUDENT_ID = "CT21-1111";

    private static StudentDaoImpl studentDao;

    @BeforeAll
    static void setup() {
        studentDao = new StudentDaoImpl();
    }

    @Test
    void testGetStudentById() {
        Student student = studentDao.getStudentById(TEST_STUDENT_ID);
        assertNotNull(student);

        assertEquals("CT21-1111", student.getId());
        assertEquals("Digo", student.getLastname());
        assertEquals("Joven", student.getFirstname());
        assertEquals("G", student.getMiddlename());
        assertEquals("Male", student.getSex());
        assertEquals(null, student.getBirthday());
        assertEquals("Catholic", student.getReligion());
        assertEquals("joven.digo3@email.com", student.getEmail());
        assertEquals("SanFrancisco", student.getAddress());
        assertEquals("09567838483", student.getContactnumber());
    }

    @Test
    void testUpdateStudent() {

        Student testStudent = new Student();
        testStudent.setId(TEST_STUDENT_ID);
        testStudent.setLastname("Digo");
        testStudent.setFirstname("Joven");
        testStudent.setMiddlename("G");
        testStudent.setSex("Male");
        testStudent.setBirthday(null);
        testStudent.setReligion("Catholic");
        testStudent.setEmail("joven.digo3@email.com");
        testStudent.setAddress("SanFrancisco");
        testStudent.setContactnumber("09567838483");

        boolean result = studentDao.updateStudent(testStudent);
        assertTrue(result);

        Student updatedStudent = studentDao.getStudentById(TEST_STUDENT_ID);
        assertEquals("Digo", updatedStudent.getLastname());
        assertEquals("Joven", updatedStudent.getFirstname());
        assertEquals("G", updatedStudent.getMiddlename());
        assertEquals("Male", updatedStudent.getSex());
        assertEquals(null, updatedStudent.getBirthday());
        assertEquals("Catholic", updatedStudent.getReligion());
        assertEquals("joven.digo3@email.com", updatedStudent.getEmail());
        assertEquals("SanFrancisco", updatedStudent.getAddress());
        assertEquals("09567838483", updatedStudent.getContactnumber());
    }

}
