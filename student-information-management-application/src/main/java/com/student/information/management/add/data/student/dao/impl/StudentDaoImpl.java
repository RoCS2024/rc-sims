package com.student.information.management.add.data.student.dao.impl;

import com.student.information.management.add.app.model.student.Student;
import com.student.information.management.add.data.connection.ConnectionHelper;
import com.student.information.management.add.data.student.dao.StudentDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static com.student.information.management.add.data.utils.QueryConstant.*;
/**
 * This is the Student Dao Impl.
 */
public class StudentDaoImpl implements StudentDao {
    Connection con = ConnectionHelper.getConnection();

    @Override
    public List<Student> getAllStudents() {
        try {
            PreparedStatement stmt = con.prepareStatement(GET_ALL_STUDENTS_STATEMENT);
            ResultSet rs = stmt.executeQuery();
            List<Student> students = new ArrayList<>();

            while(rs.next()) {
                students.add(setStudent(rs));
            }
            return students;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public Student getStudentById(String id) throws RuntimeException {
        try {
            PreparedStatement stmt = con.prepareStatement(GET_STUDENT_BY_STUDENT_ID_STATEMENT);
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()) {
                return setStudent(rs);
            }

        } catch (Exception ignored) {

        }
        return null;
    }

    @Override
    public boolean addStudent(Student student) {
        try {
            PreparedStatement statement = con.prepareStatement(ADD_STUDENT_STATEMENT);
            statement.setString(1, student.getStudentId());
            statement.setString(2, student.getLastName());
            statement.setString(3, student.getFirstName());
            statement.setString(4, student.getMiddleName());
            statement.setString(5, student.getSex());
            statement.setString(6, student.getBirthday());
            statement.setString(7, student.getReligion());
            statement.setString(8, student.getEmail());
            statement.setString(9, student.getAddress());
            statement.setString(10, student.getContactNumber());
            int result = statement.executeUpdate();
            return result == 1? true: false;

        } catch (Exception e) {}
        return false;
    }

    @Override
    public Student addStudents(ResultSet rs) {
        return null;
    }

    public Student setStudent(ResultSet rs) {
        try{
            Student student = new Student();
            student.setStudentId(rs.getString("student_id"));
            student.setLastName(rs.getString("last_name"));
            student.setFirstName(rs.getString("first_name"));
            student.setMiddleName(rs.getString("middle_name"));
            student.setSex(rs.getString("sex"));
            student.setBirthday(rs.getString("birthday"));
            student.setReligion(rs.getString("religion"));
            student.setEmail(rs.getString("email"));
            student.setAddress(rs.getString("address"));
            student.setContactNumber(rs.getString("contact_number"));
            return student;
        }catch(Exception ignored){

        }
        return null;
    }
}
