public class WaterTransport extends Transportation {
    protected double displacement;
    protected String hullMaterial;
    
    public WaterTransport(String name, String color, String brand, double speed, 
                         int capacity, double displacement, String hullMaterial) {
        super(name, color, brand, speed, capacity);
        this.displacement = displacement;
        this.hullMaterial = hullMaterial;
    }
    
    public String sail() {
        return String.format("%s is sailing with displacement of %.1f tons.", 
                            name, displacement);
    }
    
    @Override
    public String displayInfo() {
        return super.displayInfo() + String.format(", Displacement=%.1f tons, Hull Material=%s", 
                            displacement, hullMaterial);
    }
}
