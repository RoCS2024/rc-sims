package com.student.information.management.data.connection;

import java.sql.Connection;
import java.sql.DriverManager;

 /**
 * The ConnectionHelper class connects to an Oracle database. The task of maintaining database connections is taken away by a connection helper.
 * It makes it simpler for developers to concentrate on the main features of the application
 * by sum up the logic for establishing, opening, closing, and connecting database connections.
 * Features for securely managing database can be found in connection helpers.
 * To lower the chance to exposed you're information being exposed in the application code they can
 * securely make a private data like usernames and passwords.
 */
public class ConnectionHelper {
    public static final String URL = "jdbc:oracle:thin:@localhost:1521:baemonville";
    public static final String ORACLE_DRIVER = "oracle.jdbc.driver.OracleDriver";
    public static final String username = "system";
    public static final String password = "J03J16R11L27";

    public static Connection getConnection() throws RuntimeException {
        try {
            Class.forName(ORACLE_DRIVER).newInstance();
            return DriverManager.getConnection(URL, username, password);
        } catch (Exception ex) {
            throw new RuntimeException("Error connecting to the database", ex);
        }
    }
}
