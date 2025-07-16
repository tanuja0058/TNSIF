package Food_Delivery_System.Entities;

import java.util.*;

public class Order {
    private int orderId;
    private Customer customer;
    private Map<FoodItem, Integer> items;
    private String status;
    private DeliveryPerson deliveryPerson;
    private String deliveryAddress;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = new HashMap<>(customer.getCart().getItems());
        this.status = "Pending";
        this.deliveryPerson = null;
    }

    public int getOrderId() { return orderId; }
    public Customer getCustomer() { return customer; }
    public Map<FoodItem, Integer> getItems() { return items; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public DeliveryPerson getDeliveryPerson() { return deliveryPerson; }
    public void setDeliveryPerson(DeliveryPerson deliveryPerson) {
        this.deliveryPerson = deliveryPerson;
    }
    public void setDeliveryAddress(String address) { this.deliveryAddress = address; }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customer=" + customer.getUsername() +
                ", items=" + items +
                ", status='" + status + '\'' +
                ", deliveryPerson=" + (deliveryPerson != null ? deliveryPerson.getName() : "Not Assigned") +
                '}';
    }
}
