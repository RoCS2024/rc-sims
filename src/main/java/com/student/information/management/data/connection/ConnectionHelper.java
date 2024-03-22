package com.student.information.management.data.connection;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 * This is the Connection for Database.
 */
public class ConnectionHelper {
    public static final String URL = "jdbc:oracle:thin:@localhost:1521:oracleDB";
    public static final String ORACLE_DRIVER = "oracle.jdbc.driver.OracleDriver";
    public static final String username = "system";
    public static final String password = "Changeme0";

    public static Connection getConnection() throws RuntimeException {
        try {
            Class.forName(ORACLE_DRIVER).newInstance();
            return DriverManager.getConnection(URL, username, password);
        } catch (Exception ex) {
            throw new RuntimeException("Error connecting to the database", ex);
        }
    }
}
