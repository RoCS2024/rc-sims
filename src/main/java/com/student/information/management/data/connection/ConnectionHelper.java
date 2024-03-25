package com.student.information.management.data.connection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This is the Connection for Database.
 */
public class ConnectionHelper {
    public static final String URL = "jdbc:oracle:thin:@localhost:1521:rogate";
    public static final String ORACLE_DRIVER = "oracle.jdbc.driver.OracleDriver";
    public static final String username = "system";
    public static final String password = "Changeme0";

    private static final Logger LOGGER = LoggerFactory.getLogger(ConnectionHelper.class);

    public static Connection getConnection() throws RuntimeException {
        try {
            Class.forName(ORACLE_DRIVER).newInstance();
            return DriverManager.getConnection(URL, username, password);
        } catch (ClassNotFoundException ex) {
            LOGGER.error("Error has occurred. Driver not found." + ex.getMessage());
        } catch (InstantiationException | IllegalAccessException ex) {
            LOGGER.error("Error has occurred. Cannot create a database instance." + ex.getMessage());
        } catch (SQLException ex) {
            LOGGER.error("Error has occurred. Cannot connect to the database." + ex.getMessage());
        }
        return null;
    }
}
