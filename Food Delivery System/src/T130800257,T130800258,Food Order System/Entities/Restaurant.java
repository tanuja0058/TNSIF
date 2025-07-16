package Food_Delivery_System.Entities;

import java.util.*;

public class Restaurant {
    private int id;
    private String name;
    private List<FoodItem> menu = new ArrayList<>();

    public Restaurant(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public List<FoodItem> getMenu() { return menu; }

    public void addFoodItem(FoodItem item) { menu.add(item); }

    public void removeFoodItem(int foodId) {
        menu.removeIf(item -> item.getId() == foodId);
    }

    public FoodItem getFoodItemById(int id) {
        for (FoodItem item : menu)
            if (item.getId() == id) return item;
        return null;
    }

    @Override
    public String toString() {
        return "Restaurant ID: " + id + ", Name: " + name;
    }
}