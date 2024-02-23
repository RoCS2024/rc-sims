package com.update.student.data.connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHelper {

    public static final String URL = "jdbc:oracle:thin:@localhost:1521:rogate";

    public static final String username = "system";

    public static final String password = "Changeme0";

    public static Connection getConnection()throws SQLException
    {
        return DriverManager.getConnection(URL,username,password);

    }
}



