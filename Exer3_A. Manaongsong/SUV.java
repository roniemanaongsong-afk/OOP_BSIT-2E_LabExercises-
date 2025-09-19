public class SUV extends LandTransport {
    private boolean fourWheelDrive;
    private int seatingRows;
    private String drivetrain;
    
    public SUV(String name, String color, String brand, double speed, 
              int capacity, int wheelCount, String fuelType,
              boolean fourWheelDrive, int seatingRows, String drivetrain) {
        super(name, color, brand, speed, capacity, wheelCount, fuelType);
        this.fourWheelDrive = fourWheelDrive;
        this.seatingRows = seatingRows;
        this.drivetrain = drivetrain;
    }
    
    public String offRoad() {
        return name + " is going off-road with " + drivetrain + " drivetrain.";
    }
    
    @Override
    public String displayInfo() {
        return super.displayInfo() + String.format(", 4WD=%s, Seating Rows=%d, Drivetrain=%s", 
                            fourWheelDrive, seatingRows, drivetrain);
    }
}
