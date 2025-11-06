package co2_scena;

class Vehicle {
    // Common method for all vehicles
    public void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    // Method specific to Car
    public void fuelType() {
        System.out.println("Car fuel type: Petrol or Diesel");
    }
}
public class VehicleSystem {
	public static void main(String[] args) {
        Car myCar = new Car();  // Creating object of Car class
        myCar.move();          // Calling inherited method
        myCar.fuelType();      // Calling Car specific method
    }
}
