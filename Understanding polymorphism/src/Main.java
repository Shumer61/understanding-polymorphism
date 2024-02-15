import java.util.Date;

class Vehicle {
    protected String type;

    public Vehicle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void rent(int duration) {
        System.out.println("Renting a " + type + " for " + duration + " days.");
    }

    public void rent(int duration, boolean includeInsurance) {
        String insuranceInfo = includeInsurance ? "with insurance" : "without insurance";
        System.out.println("Renting a " + type + " for " + duration + " days " + insuranceInfo + ".");
    }
}

class Car extends Vehicle {
    public Car() {
        super("Car");
    }
}

class Bike extends Vehicle {
    public Bike() {
        super("Bike");
    }
}

class Scooter extends Vehicle {
    public Scooter() {
        super("Scooter");
    }
}

class VehicleRentalService {
    public void rentVehicle(Car car, int duration) {
        car.rent(duration);
    }

    public void rentVehicle(Bike bike, int duration) {
        bike.rent(duration);
    }

    public void rentVehicle(Scooter scooter, int duration) {
        scooter.rent(duration);
    }

    public void rentVehicle(Car car, int duration, boolean includeInsurance) {
        car.rent(duration, includeInsurance);
    }

    public void rentVehicle(Bike bike, int duration, boolean includeInsurance) {
        bike.rent(duration, includeInsurance);
    }

    public void rentVehicle(Scooter scooter, int duration, boolean includeInsurance) {
        scooter.rent(duration, includeInsurance);
    }
}

public class Main {
    public static void main(String[] args) {
        VehicleRentalService rentalService = new VehicleRentalService();

        Car car = new Car();
        Bike bike = new Bike();
        Scooter scooter = new Scooter();

        // Rent without insurance
        rentalService.rentVehicle(car, 5);
        rentalService.rentVehicle(bike, 3);
        rentalService.rentVehicle(scooter, 7);

        // Rent with insurance
        rentalService.rentVehicle(car, 2, true);
        rentalService.rentVehicle(bike, 4, true);
        rentalService.rentVehicle(scooter, 6, true);
    }
}
