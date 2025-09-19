public class Transportation {
    protected String name;
    protected String color;
    protected String brand;
    protected double speed;
    protected int capacity;
    
    public Transportation(String name, String color, String brand, double speed, int capacity) {
        this.name = name;
        this.color = color;
        this.brand = brand;
        this.speed = speed;
        this.capacity = capacity;
    }
    
    public String displayInfo() {
        return String.format("%s %s %s: Speed=%.1f km/h, Capacity=%d people", 
                            color, brand, name, speed, capacity);
    }
    
    public String move() {
        return name + " is moving.";
    }
}
