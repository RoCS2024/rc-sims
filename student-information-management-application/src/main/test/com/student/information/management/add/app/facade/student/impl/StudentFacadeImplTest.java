package com.student.information.management.add.app.facade.student.impl;

import com.student.information.management.add.app.model.student.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
/**
 * This is the Student Facade Impl Test.
 */
public class StudentFacadeImplTest {
    @Test
    public void testAddStudent() {
        Student student = new Student("CT21-0073", "Amulong", "kate", "itaas", "female", "08/07/2012 07:35:00.000000000 PM", "Catholic", "amulong@gmail.com", "tagaytay", "009912132");
        List<String> studentIds = new ArrayList<>();
        studentIds.add("CT21-0073");
    }
}
