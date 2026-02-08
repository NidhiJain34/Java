package scenario_based_ques_unit2;

abstract class Vehicle {

    abstract void fuelType();
}

class Car extends Vehicle {

    void fuelType() {
        System.out.println("Car uses Petrol");
    }
}

class Bike extends Vehicle {

    void fuelType() {
        System.out.println("Bike uses Petrol");
    }
}

public class VehicleTest {
    public static void main(String[] args) {

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.fuelType();
        v2.fuelType();
    }
}

