package Food_Delivery_System.Entities;

public class DeliveryPerson {
    private int deliveryPersonId;
    private String name;
    private long contactNo;

    public DeliveryPerson(int id, String name, long contactNo) {
        this.deliveryPersonId = id;
        this.name = name;
        this.contactNo = contactNo;
    }

    public int getDeliveryPersonId() { return deliveryPersonId; }
    public String getName() { return name; }
    public long getContactNo() { return contactNo; }

    @Override
    public String toString() {
        return "DeliveryPerson{ID=" + deliveryPersonId + ", name='" + name + "', contact=" + contactNo + "}";
    }
}
