package com.student.information.management.data.connection;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 * The ConnectionHelper class connects to an Oracle database.
 */
public class ConnectionHelper {
    /** The connection URL. */
    public static final String URL = "jdbc:oracle:thin:@localhost:1521:rcian";
    /** The Oracle driver. */
    public static final String ORACLE_DRIVER = "oracle.jdbc.driver.OracleDriver";
    /** The username used to connect to the database. */
    public static final String username = "system";
    /** The password used to connect to the database. */
    public static final String password = "Changeme0";

    /**
     * This method gets the connection from an Oracle database instance.
     * */
    public static Connection getConnection() throws RuntimeException {
        try {
            Class.forName(ORACLE_DRIVER).newInstance();
            return DriverManager.getConnection(URL, username, password);
        } catch (Exception ex) {
            throw new RuntimeException("Error connecting to the database", ex);
        }
    }
}
