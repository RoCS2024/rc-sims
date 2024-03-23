package com.student.information.management.data.connection;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 * The ConnectionHelper class connects to an Oracle database.
 */
public class ConnectionHelper {
    public static final String URL = "jdbc:oracle:thin:@localhost:1521:baemonville";
    /** @param host  The hostname of the database. */
    public static final String ORACLE_DRIVER = "oracle.jdbc.driver.OracleDriver";
    /** @param port     The port number of the database. */
    public static final String username = "system";
    /** @param username The username to verify the connection. */

    public static final String password = "J03J16R11L27";
    /** @param password The password to verify the connection. */

    public static Connection getConnection() throws RuntimeException {
        try {
            Class.forName(ORACLE_DRIVER).newInstance();
            /** The one who establish connection using Driver Management. */
            return DriverManager.getConnection(URL, username, password);
        } catch (Exception ex) {
            /** Throw a RuntimeException with a descriptive message and the cause */
            throw new RuntimeException("Error connecting to the database", ex);
        }
    }
}
