package com.student.view.data.student.dao.impl;

import com.student.view.app.model.student.Student;
import com.student.view.data.connection.ConnectionHelper;
import com.student.view.data.student.dao.StudentDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    Connection con = ConnectionHelper.getConnection();
    @Override
    public List<Student> getAllStudents() {

        List<Student> students = new ArrayList<>();
        try {

            PreparedStatement statement = con.prepareStatement("select * from student ");
            ResultSet rs = statement.executeQuery();
            return getStudents(students, rs);
        } catch(Exception e){

        }
        return null;
    }


    @Override
    public Student getStudentById(String id) {
        try {
            PreparedStatement statement = con.prepareStatement("select * from student where student_id = ?");
            statement.setString(1, id);
            ResultSet rs = statement.executeQuery();
            return rs.next()? setStudent(rs) : null;
        } catch (Exception e) {

        }
        return null;

    }
    private Student setStudent(ResultSet rs) throws SQLException {
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

        return student;
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
