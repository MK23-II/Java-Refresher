package act5.Vehicle;

public class Vehicle {

    int doors;
    int seats;
    int wheels;


    Vehicle() {
        System.out.println("Building a Vehicle");
    }

    Vehicle(int vehicleDoors, int vehicleSeats, int vehicleWheels) {
        doors = vehicleDoors;
        seats = vehicleSeats;
        wheels = vehicleWheels;

    }

    public void drive() {
        System.out.println("Driving a vehicle...");
    }



}
