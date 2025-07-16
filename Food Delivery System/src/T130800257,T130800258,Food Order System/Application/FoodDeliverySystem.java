package Food_Delivery_System.Application;

import Food_Delivery_System.Entities.*;
import Food_Delivery_System.Services.*;

import java.util.*;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FoodServices foodService = new FoodServices();
        CustomerServices customerService = new CustomerServices();
        OrderServices orderService = new OrderServices();

        Map<Integer, Restaurant> restaurantMap = new HashMap<>();
        Map<Integer, Customer> customerMap = new HashMap<>();
        Map<Integer, DeliveryPerson> deliveryMap = new HashMap<>();
        int orderCounter = 1;

        while (true) {
            System.out.println("\n1. Admin Menu\n2. Customer Menu\n3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    int adminChoice;
                    do {
                        System.out.println("\nAdmin Menu:");
                        System.out.println("1. Add Restaurant\n2. Add Food Item to Restaurant\n3. Remove Food Item from Restaurant");
                        System.out.println("4. View Restaurants and Menus\n5. View Orders\n6. Add Delivery Person");
                        System.out.println("7. Assign Delivery Person to Order\n8. Exit");
                        System.out.print("Choose an option: ");
                        adminChoice = sc.nextInt();

                        switch (adminChoice) {
                            case 1 -> {
                                System.out.print("Enter Restaurant ID: ");
                                int id = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Enter Restaurant Name: ");
                                String name = sc.nextLine();
                                Restaurant r = new Restaurant(id, name);
                                restaurantMap.put(id, r);
                                foodService.addRestaurant(r);
                            }
                            case 2 -> {
                                System.out.print("Enter Restaurant ID: ");
                                int rid = sc.nextInt();
                                Restaurant res = restaurantMap.get(rid);
                                if (res != null) {
                                    System.out.print("Enter Food Item ID: ");
                                    int fid = sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("Enter Food Item Name: ");
                                    String fname = sc.nextLine();
                                    System.out.print("Enter Food Item Price: ");
                                    double price = sc.nextDouble();
                                    FoodItem item = new FoodItem(fid, fname, price);
                                    res.addFoodItem(item);
                                    foodService.addFoodItem(item, rid);
                                } else {
                                    System.out.println("Restaurant not found.");
                                }
                            }
                            case 3 -> {
                                System.out.print("Enter Restaurant ID: ");
                                int rid = sc.nextInt();
                                Restaurant res = restaurantMap.get(rid);
                                if (res != null) {
                                    System.out.print("Enter Food Item ID to remove: ");
                                    int fid = sc.nextInt();
                                    res.removeFoodItem(fid);
                                    System.out.println("Food item removed from local menu (Note: DB update not handled here).\n");
                                }
                            }
                            case 4 -> {
                                System.out.println("Restaurants and Menus:");
                                for (Restaurant r : restaurantMap.values()) {
                                    System.out.println("Restaurant ID: " + r.getId() + ", Name: " + r.getName());
                                    for (FoodItem fi : r.getMenu()) {
                                        System.out.println("- Food Item ID: " + fi.getId() + ", Name: " + fi.getName() + ", Price: Rs. " + fi.getPrice());
                                    }
                                }
                            }
                            case 6 -> {
                                System.out.print("Enter Delivery Person ID: ");
                                int did = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Enter Delivery Person Name: ");
                                String dname = sc.nextLine();
                                System.out.print("Enter Contact No.: ");
                                long dcontact = sc.nextLong();
                                DeliveryPerson dp = new DeliveryPerson(did, dname, dcontact);
                                deliveryMap.put(did, dp);
                                foodService.addDeliveryPerson(dp);
                            }
                            case 7 -> {
                                System.out.print("Enter Order ID: ");
                                int oid = sc.nextInt();
                                System.out.print("Enter Delivery Person ID: ");
                                int did = sc.nextInt();
                                DeliveryPerson dp = deliveryMap.get(did);
                                if (dp != null) {
                                    orderService.assignDeliveryPerson(oid, dp);
                                } else {
                                    System.out.println("Delivery person not found.");
                                }
                            }
                        }
                    } while (adminChoice != 8);
                }

                case 2 -> {
                    int custChoice;
                    Customer current = null;
                    do {
                        System.out.println("\nCustomer Menu:");
                        System.out.println("1. Add Customer\n2. View Food Items\n3. Add to Cart\n4. View Cart\n5. Place Order\n6. View Orders\n7. Exit");
                        System.out.print("Choose an option: ");
                        custChoice = sc.nextInt();

                        switch (custChoice) {
                            case 1 -> {
                                System.out.print("Enter User ID: ");
                                int id = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Enter Username: ");
                                String name = sc.nextLine();
                                System.out.print("Enter Contact No.: ");
                                long contact = sc.nextLong();
                                current = new Customer(id, name, contact);
                                customerMap.put(id, current);
                                customerService.addCustomer(current);
                            }
                            case 2 -> {
                                System.out.println("Restaurants and Menus:");
                                for (Restaurant r : restaurantMap.values()) {
                                    System.out.println("Restaurant ID: " + r.getId() + ", Name: " + r.getName());
                                    for (FoodItem fi : r.getMenu()) {
                                        System.out.println("- Food Item ID: " + fi.getId() + ", Name: " + fi.getName() + ", Price: Rs. " + fi.getPrice());
                                    }
                                }
                            }
                            case 3 -> {
                                if (current == null) {
                                    System.out.println("Please add a customer first.");
                                    break;
                                }
                                System.out.print("Enter Restaurant ID: ");
                                int rid = sc.nextInt();
                                Restaurant r = restaurantMap.get(rid);
                                if (r != null) {
                                    System.out.print("Enter Food Item ID: ");
                                    int fid = sc.nextInt();
                                    System.out.print("Enter Quantity: ");
                                    int qty = sc.nextInt();
                                    FoodItem f = r.getFoodItemById(fid);
                                    if (f != null) {
                                        current.getCart().addItem(f, qty);
                                        System.out.println("Food item added to cart!");
                                    } else System.out.println("Invalid food ID.");
                                } else System.out.println("Invalid restaurant ID.");
                            }
                            case 4 -> {
                                if (current != null) System.out.println(current.getCart());
                                else System.out.println("No customer selected.");
                            }
                            case 5 -> {
                                if (current != null) {
                                    Order order = new Order(orderCounter++, current);
                                    orderService.placeOrder(order);
                                    current.getCart().clearCart();
                                } else System.out.println("No customer selected.");
                            }
                            case 6 -> {
                                System.out.println("Feature pending: View orders by customer.");
                            }
                        }
                    } while (custChoice != 7);
                }

                case 3 -> {
                    System.out.println("Exiting...");
                    return;
                }
            }
        }
    }
}
