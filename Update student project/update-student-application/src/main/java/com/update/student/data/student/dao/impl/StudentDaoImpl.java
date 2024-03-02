package com.update.student.data.student.dao.impl;

import com.update.student.app.model.student.Student;
import com.update.student.data.connection.ConnectionHelper;
import com.update.student.data.student.dao.StudentDao;

import java.sql.*;


import static com.update.student.data.utils.QueryConstants.*;


public class StudentDaoImpl implements StudentDao {


    @Override
    public Student getStudentById(String student_id)  {
        try{
            Connection connection;
            connection = new ConnectionHelper().getConnection();
            PreparedStatement statement = connection.prepareStatement(GET_STUDENT_BY_ID_STATEMENT);
            statement.setString(1,student_id);
            ResultSet result = statement.executeQuery();

            if (result.next()){
                return setStudent(result);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public boolean updateStudent(Student student)  {
        try  {
            Connection connection;
            connection = new ConnectionHelper().getConnection();
            PreparedStatement statement = connection.prepareStatement(UPDATE_STATEMENT);
            statement.setString(1, student.getLastname());
            statement.setString(2, student.getFirstname());
            statement.setString(3, student.getMiddlename());
            statement.setString(4, student.getSex());
            statement.setTimestamp(5, student.getBirthday());
            statement.setString(5, student.getReligion());
            statement.setString(6, student.getEmail());
            statement.setString(7, student.getAddress());
            statement.setString(8, student.getContactnumber());
            statement.setString(9, student.getId());
            int result = statement.executeUpdate();

           return result == 1? true: false;
        } catch (Exception e) {

        }
        return true;
    }

    private Student setStudent(ResultSet result) {
        try{
            Student student = new Student();
            student.setId(result.getString("student_id"));
            student.setLastname(result.getString("last_name"));
            student.setFirstname(result.getString("first_name"));
            student.setMiddlename(result.getString("middle_name"));
            student.setSex(result.getString("sex"));
            student.setBirthday(result.getTimestamp("birthday"));
            student.setReligion(result.getString("religion"));
            student.setEmail(result.getString("email"));
            student.setAddress(result.getString("address"));
            student.setContactnumber(result.getString("contact_number"));
            return student;
        } catch (Exception e) {

        }
        return null;
    }
}








