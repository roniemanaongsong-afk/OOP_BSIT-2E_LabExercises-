public class Boat extends WaterTransport {
    private boolean hasSail;
    private int cabinCount;
    private String boatType;
    
    public Boat(String name, String color, String brand, double speed, 
               int capacity, double displacement, String hullMaterial,
               boolean hasSail, int cabinCount, String boatType) {
        super(name, color, brand, speed, capacity, displacement, hullMaterial);
        this.hasSail = hasSail;
        this.cabinCount = cabinCount;
        this.boatType = boatType;
    }
    
    public String row() {
        return name + " is rowing on water. It's a " + boatType + " type boat.";
    }
    
    @Override
    public String displayInfo() {
        return super.displayInfo() + String.format(", Sail=%s, Cabins=%d, Type=%s", 
                            hasSail, cabinCount, boatType);
    }
}
