package Food_Delivery_System.Application;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    // Update these as per your local MySQL configuration
    private static final String URL = "jdbc:mysql://localhost:3306/food_delivery_db";
    private static final String USER = "root";
    private static final String PASSWORD = "root"; // replace with your actual MySQL password

    public static Connection getConnection() {
        Connection conn = null;
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Create connection
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            System.out.println("Error establishing database connection:");
            e.printStackTrace();
        }
        return conn;
    }
}
