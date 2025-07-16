package Food_Delivery_System.Services;

import java.sql.*;

import Food_Delivery_System.Application.DBUtil;
import Food_Delivery_System.Entities.DeliveryPerson;
import Food_Delivery_System.Entities.FoodItem;
import Food_Delivery_System.Entities.Restaurant;

public class FoodServices {
    public void addRestaurant(Restaurant restaurant) {
        try (Connection conn = DBUtil.getConnection()) {
            String sql = "INSERT INTO Restaurant (id, name) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, restaurant.getId());
            stmt.setString(2, restaurant.getName());
            stmt.executeUpdate();
            System.out.println("Restaurant added successfully!");
        } catch (Exception e) {
            System.out.println("Error adding restaurant:");
            e.printStackTrace();
        }
    }

    public void addFoodItem(FoodItem item, int restaurantId) {
        try (Connection conn = DBUtil.getConnection()) {
            String sql = "INSERT INTO FoodItem (id, name, price, restaurant_id) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, item.getId());
            stmt.setString(2, item.getName());
            stmt.setDouble(3, item.getPrice());
            stmt.setInt(4, restaurantId);
            stmt.executeUpdate();
            System.out.println("Food item added successfully!");
        } catch (Exception e) {
            System.out.println("Error adding food item:");
            e.printStackTrace();
        }
    }

    public void addDeliveryPerson(DeliveryPerson dp) {
        try (Connection conn = DBUtil.getConnection()) {
            String sql = "INSERT INTO DeliveryPerson (id, name, contact_no) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, dp.getDeliveryPersonId());
            stmt.setString(2, dp.getName());
            stmt.setLong(3, dp.getContactNo());
            stmt.executeUpdate();
            System.out.println("Delivery person added successfully!");
        } catch (Exception e) {
            System.out.println("Error adding delivery person:");
            e.printStackTrace();
        }
    }
}
