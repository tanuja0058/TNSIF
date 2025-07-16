package Food_Delivery_System.Services;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.*;
import java.util.Map;

import Food_Delivery_System.Application.DBUtil;
import Food_Delivery_System.Entities.Customer;

public class CustomerServices {
    public void addCustomer(Customer customer) {
        try (Connection conn = DBUtil.getConnection()) {
            String sql = "INSERT INTO Customer (id, username, contact_no) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, customer.getUserId());
            stmt.setString(2, customer.getUsername());
            stmt.setLong(3, customer.getContactNo());
            stmt.executeUpdate();
            System.out.println("Customer created successfully!");
        } catch (Exception e) {
            System.out.println("Error adding customer:");
            e.printStackTrace();
        }
    }
}