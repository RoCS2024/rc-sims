package com.student.information.management.appl.facade.student.impl;

import com.student.information.management.appl.exception.StudentNotFoundException;
import com.student.information.management.appl.facade.student.StudentFacade;
import com.student.information.management.appl.model.student.Student;
import com.student.information.management.data.student.dao.StudentDao;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

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
    private StudentFacade itemFacade = new StudentFacadeImpl();

    @Mock
    private StudentDao itemDao;

    @Mock
    private List<Student> studentList;

    @Mock
    private Student student;

    @Mock
    private Student addstudent;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        student.setStudentId("1");
        addstudent.setStudentId("2");
        when(StudentDao.getAllStudents()).thenReturn(studentList);

    }
    @AfterEach
    public void validate() {
        validateMockitoUsage();
    }

    @Test
    public void testGetItemById() {
        when(itemDao.getStudentById("1")).thenReturn(student);
        Student expectedItem = itemFacade.getStudentById("1");

        // Assert that expectedItem and item are equal
        assert(expectedItem.equals(student));
        // verify that when calling itemFacade.getItemById(), the itemDao.getItemById() is called.
        verify(itemDao).getStudentById("1");
    }

    @Test
    public void testAddItem() {
        try {
            when(itemFacade.getStudentById(addstudent.getStudentId())).thenReturn(null);
            when(itemDao.addStudent(addstudent)).thenReturn(true);

            boolean result = itemFacade.addStudent(addstudent);

            // Assert that when adding an item, it returns true if successful
            assert(result == true);
            // Assert that addItem is not in the database
            assert(itemFacade.getStudentById("2") == null);
            // Verify that itemDao.addItem() is called when itemFacade.addItem() is invoked
            verify(itemDao).addStudent(addstudent);
        } catch (Exception e) {
            LOGGER.error("Exception caught: " + e.getMessage());
        }

    }

    @Test
    public void testUpdateItem() {
        try {
            when(itemDao.getStudentById(student.getStudentId())).thenReturn(student);
            when(itemDao.updateStudent(student)).thenReturn(true);

            boolean result = itemFacade.updateStudent(student);

            // Assert that when updating an item, it returns true if successful
            assert(result == true);
            // Assert that item to update is in the database
            assert(itemFacade.getStudentById("1").equals(student));
            // Verify that itemDao.updateItem() is called when itemFacade.updateItem() is invoked
            verify(itemDao).updateStudent(student);
        } catch (StudentNotFoundException e) {
            LOGGER.error("Exception caught: " + e.getMessage());
        }
    }


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