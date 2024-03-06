package com.integrated.student.information.data.student.dao.impl;

import com.integrated.student.information.app.model.student.Student;
import com.integrated.student.information.data.connection.ConnectionHelper;
import com.integrated.student.information.data.student.dao.StudentDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> getAllStudents() {

        List<Student> students = new ArrayList<>();
        try {
            Connection con = ConnectionHelper.getConnection();
            PreparedStatement statement = con.prepareStatement("select * from student ");
            ResultSet rs = statement.executeQuery();
            return getStudents(students, rs);
        } catch(Exception e){

        }
        return null;
    }

    @Override
    public List<Student> getStudentById() {
        List<Student> students = new ArrayList<>();
        try {
            Connection con = ConnectionHelper.getConnection();
            ResultSet rs;
            try (PreparedStatement statement = con.prepareStatement("select * from student id")) {
                rs = statement.executeQuery();
            }
            return getStudents(students, rs);
        } catch(Exception e){

        }
        return null;
    }

    @Override
    public Student getStudentById(String id) {
        return null;
    }

    private List<Student> getStudents(List<Student> students, ResultSet rs) throws SQLException {
        while (rs.next()) {
            Student student = new Student();
            student.setStudentId(rs.getString("student_id"));
            student.setLastName(rs.getString("last_name"));
            student.setFirstName(rs.getString("first_name"));
            student.setMiddleName(rs.getString("middle_name"));
            student.setSex(rs.getString("sex"));
            student.setBirthdate(rs.getTimestamp("birthdate"));
            student.setReligion(rs.getString("religion"));
            student.setEmail(rs.getString("email"));
            student.setAddress(rs.getString("address"));
            student.setContactNumber(rs.getString("contact_number"));
            students.add(student);

        }
        return students;
    }
}
