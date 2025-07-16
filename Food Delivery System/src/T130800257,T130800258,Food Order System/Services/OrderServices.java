package Food_Delivery_System.Services;

import java.sql.*;
import java.util.Map;

import Food_Delivery_System.Application.DBUtil;
import Food_Delivery_System.Entities.DeliveryPerson;
import Food_Delivery_System.Entities.FoodItem;
import Food_Delivery_System.Entities.Order;

public class OrderServices {
    public void placeOrder(Order order) {
        try (Connection conn = DBUtil.getConnection()) {
            String sql = "INSERT INTO Orders (id, customer_id, delivery_address, status) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, order.getOrderId());
            stmt.setInt(2, order.getCustomer().getUserId());
            stmt.setString(3, "N/A");
            stmt.setString(4, order.getStatus());
            stmt.executeUpdate();

            for (Map.Entry<FoodItem, Integer> entry : order.getItems().entrySet()) {
                String itemSql = "INSERT INTO OrderItems (order_id, food_id, quantity) VALUES (?, ?, ?)";
                PreparedStatement itemStmt = conn.prepareStatement(itemSql);
                itemStmt.setInt(1, order.getOrderId());
                itemStmt.setInt(2, entry.getKey().getId());
                itemStmt.setInt(3, entry.getValue());
                itemStmt.executeUpdate();
            }

            System.out.println("Order placed successfully!");
        } catch (Exception e) {
            System.out.println("Error placing order:");
            e.printStackTrace();
        }
    }

    public void assignDeliveryPerson(int orderId, DeliveryPerson dp) {
        try (Connection conn = DBUtil.getConnection()) {
            String sql = "UPDATE Orders SET delivery_person_id = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, dp.getDeliveryPersonId());
            stmt.setInt(2, orderId);
            stmt.executeUpdate();
            System.out.println("Delivery person assigned to order successfully!");
        } catch (Exception e) {
            System.out.println("Error assigning delivery person:");
            e.printStackTrace();
        }
    }
}

