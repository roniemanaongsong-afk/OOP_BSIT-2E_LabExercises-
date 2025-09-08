public class Car {

    private String brand;
    private String color;
    private String engineSpecs;
    private int tireSize;

    // Constructor
    public Car(String brand, String color, String engineSpecs, int tireSize) {
        this.brand = brand;
        this.color = color;
        this.engineSpecs = engineSpecs;
        this.tireSize = tireSize;
    }

    // Getters and setters for the attributes
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngineSpecs() {
        return engineSpecs;
    }

    public void setEngineSpecs(String engineSpecs) {
        this.engineSpecs = engineSpecs;
    }

    public int getTireSize() {
        return tireSize;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    // Method to display car information
    public void displayCarInfo() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Color: " + this.color);
        System.out.println("Engine Specs: " + this.engineSpecs);
        System.out.println("Tire Size: " + this.tireSize);
    }

    public static void main(String[] args) {
        // Example usage
        Car myCar = new Car("Toyota", "Red", "2.5L Inline-4", 17);
        myCar.displayCarInfo();
    }
}
