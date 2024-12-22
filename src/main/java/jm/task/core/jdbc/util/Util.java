package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private final static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private final static String URL = "jdbc:mysql://localhost:3306/?user=root";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "katacon";

    public static Connection getConnection() {
        {
            try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)){
                Class.forName(DB_DRIVER);
                return connection;
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }



}
