package act5.Vehicle;

import java.util.Scanner;

public class Parking {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int doors, seats, wheels;

        //create vehicle object
        Vehicle vehicle1 = new Vehicle();
        System.out.print("Number of doors: ");
        doors = scan.nextInt();
        System.out.print("Number of seats: ");
        seats = scan.nextInt();
        System.out.print("Number of wheels: ");
        wheels = scan.nextInt();

        //for spacing
        System.out.println(" ");

        //create car object
        Car car1 = new Car();
        System.out.print("Number of doors: ");
        doors = scan.nextInt();
        System.out.print("Number of seats: ");
        seats = scan.nextInt();
        System.out.print("Number of wheels: ");
        wheels = scan.nextInt();

        //print details
        car1.drive();



    }
}
