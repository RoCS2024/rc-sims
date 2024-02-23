//package com.update.student.app.facade.student.impl;
//
//import com.update.student.app.facade.student.StudentFacade;
//import com.update.student.app.model.student.Student;
//import com.update.student.data.student.dao.StudentDao;
//import org.junit.jupiter.api.*;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.*;
//import static org.mockito.Mockito.times;
//
//class StudentFacadeImplTest {
//
//    private StudentDao studentDao;
//    private StudentFacade studentFacade;
//
//    @BeforeEach
//    void setUp() {
//        studentDao = mock(StudentDao.class);
//        studentFacade = new StudentFacadeImpl(studentDao);
//    }
//
//    @Test
//    void testGetStudentById()  {
//        String id = "CT21-1111";
//        Student student = new Student();
//
//        when(student.getStudentById(id)).thenReturn(student);
//
//        Student retrievedEvent = studentFacade.getStudentById(id);
//
//        verify(studentDao, times(1)).getStudentById(id);
//        assertEquals(student, retrievedEvent);
//    }
//
//}