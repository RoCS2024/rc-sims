package com.student.information.management.add.data.student.dao.impl;

import com.student.information.management.add.app.model.student.Student;
import com.student.information.management.add.data.student.dao.StudentDao;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/**
 * This is the Student Dao Impl Test.
 */
public class StudentDaoImplTest {
    @Mock
    private StudentDao studentDao;
    private List<Student> students;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        students = new ArrayList<>();
    }

    @Test
    public void testAddStudent() {
        Student student = new Student("CT21-0073", "Amulong", "kate", "itaas", "female", "08/07/2012 07:35:00.000000000 PM", "Catholic", "amulong@gmail.com", "Tagaytay", "009912132");
        Student student2 = new Student("CT21-0073", "Amulong", "kate", "itaas", "female", "08/07/2012 07:35:00.000000000 PM", "Catholic", "amulong@gmail.com", "Tagaytay", "009912132");

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
}
