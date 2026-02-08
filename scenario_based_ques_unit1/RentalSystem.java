class Vehicle {

    String vehicleNumber;
    double rentPerDay;

    Vehicle(String vehicleNumber, double rentPerDay) {
        this.vehicleNumber = vehicleNumber;
        this.rentPerDay = rentPerDay;
    }

    double calculateRent(int days) {
        return rentPerDay * days;
    }
}

class Car extends Vehicle {

    Car(String vehicleNumber, double rentPerDay) {
        super(vehicleNumber, rentPerDay);
    }
}

class Bike extends Vehicle {

    Bike(String vehicleNumber, double rentPerDay) {
        super(vehicleNumber, rentPerDay);
    }
}

public class RentalSystem {
    public static void main(String[] args) {

        Car c1 = new Car("CAR101", 1500);
        Bike b1 = new Bike("BIKE201", 500);

        int days = 3;

        System.out.println("Car Rent: " + c1.calculateRent(days));
        System.out.println("Bike Rent: " + b1.calculateRent(days));
    }
}
