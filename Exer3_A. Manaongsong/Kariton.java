public class Kariton extends LandTransport {
    private String material;
    private boolean hasCover;
    private String handleType;
    
    public Kariton(String name, String color, String brand, double speed, 
                  int capacity, int wheelCount, String fuelType,
                  String material, boolean hasCover, String handleType) {
        super(name, color, brand, speed, capacity, wheelCount, fuelType);
        this.material = material;
        this.hasCover = hasCover;
        this.handleType = handleType;
    }
    
    public String push() {
        return name + " is being pushed manually with its " + handleType + " handle.";
    }
    
    @Override
    public String displayInfo() {
        return super.displayInfo() + String.format(", Material=%s, Cover=%s, Handle Type=%s", 
                            material, hasCover, handleType);
    }
}
