package com.student.information.management.app.facade.student.impl;

import com.student.information.management.app.model.student.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class StudentFacadeImplTest {
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
}