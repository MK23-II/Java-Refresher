package act5.Vehicle;

public class Car extends Vehicle{

    Car() {
        System.out.println("Building a Car");
    }

    @Override
    public void drive() {
        System.out.println("Driving a Car");
    }
}
