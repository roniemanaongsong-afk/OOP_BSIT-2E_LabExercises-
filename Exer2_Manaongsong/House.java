// House.java
public class House {
    private String address;
    private String color;
    private int numberOfRooms;
    private double price;

    // Constructor
    public House(String address, String color, int numberOfRooms, double price) {
        this.address = address;
        this.color = color;
        this.numberOfRooms = numberOfRooms;
        this.price = price;
    }

    // Getters and setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display house information
    public void displayHouseInfo() {
        System.out.println("Address: " + this.address);
        System.out.println("Color: " + this.color);
        System.out.println("Number of Rooms: " + this.numberOfRooms);
        System.out.println("Price: $" + this.price);
    }
}
