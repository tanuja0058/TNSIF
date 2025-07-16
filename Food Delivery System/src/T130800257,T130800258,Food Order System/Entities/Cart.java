package Food_Delivery_System.Entities;

import java.util.*;

public class Cart {
    private Map<FoodItem, Integer> items = new HashMap<>();

    public void addItem(FoodItem item, int quantity) {
        items.put(item, items.getOrDefault(item, 0) + quantity);
    }

    public void removeItem(FoodItem item) {
        items.remove(item);
    }

    public Map<FoodItem, Integer> getItems() {
        return items;
    }

    public void clearCart() {
        items.clear();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cart:\n");
        double total = 0;
        for (Map.Entry<FoodItem, Integer> entry : items.entrySet()) {
            double cost = entry.getKey().getPrice() * entry.getValue();
            sb.append("Food Item: ").append(entry.getKey().getName())
              .append(", Quantity: ").append(entry.getValue())
              .append(", Cost: Rs. ").append(cost).append("\n");
            total += cost;
        }
        sb.append("Total Cost: Rs. ").append(total);
        return sb.toString();
    }
}