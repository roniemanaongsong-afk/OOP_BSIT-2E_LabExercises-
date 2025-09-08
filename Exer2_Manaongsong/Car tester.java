public class CarTester {
    public static void main(String[] args) {
        // Creating a Car object using the constructor
        Car c1 = new Car("Toyota", "Yellow", "2.0L Inline-4", 16);

        // Creating another Car object using the no-argument constructor
        Car c2 = new Car("BMW", "Red", "3.0L Turbo", 18);

        // Displaying the information of the Car objects
        System.out.println("Car 1 Info:");
        c1.displayCarInfo();

        System.out.println("\nCar 2 Info:");
        c2.displayCarInfo();
    }
}
