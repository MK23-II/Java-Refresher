package act2;

import java.util.Scanner;

public class CommandLineCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int option = 0;
        int firstNumber;
        int secondNumber;


        while (option != 5) {

            //Options
            System.out.println("_____________________");
            System.out.println("---OPTIONS---");
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.println("5 - Exit");
            System.out.println("_____________________");

            System.out.print("Please choose a number: ");
            option = scan.nextInt();

            switch (option) {

                case 1 :
                    System.out.print("Enter first number: ");
                    firstNumber = scan.nextInt();

                    System.out.print("Enter second number: ");
                    secondNumber = scan.nextInt();

                    System.out.println("Result: " + addition(firstNumber, secondNumber));
                    break;

                case 2 :
                    System.out.print("Enter first number: ");
                    firstNumber = scan.nextInt();

                    System.out.print("Enter second number: ");
                    secondNumber = scan.nextInt();

                    System.out.println("Result: " + subtraction(firstNumber, secondNumber));
                    break;

                case 3 :
                    System.out.print("Enter first number: ");
                    firstNumber = scan.nextInt();

                    System.out.print("Enter second number: ");
                    secondNumber = scan.nextInt();

                    System.out.println("Result: " + multiplication(firstNumber, secondNumber));
                    break;


                case 4 :
                    System.out.print("Enter first number: ");
                    firstNumber = scan.nextInt();

                    System.out.print("Enter second number: ");
                    secondNumber = scan.nextInt();

                    System.out.println("Result: " + division(firstNumber, secondNumber));
                    break;

                default :
                    System.out.println("Exit");
            }


        }


    }

    public static int addition(int a, int b) {

        int value;
        value = a + b;

        return value;

    }

    public static int subtraction(int a, int b) {

        int value;
        value = a - b;

        return value;

    }

    public static int multiplication(int a, int b) {

        int value;
        value = a * b;

        return value;

    }

    public static double division(double a, double b) {

        double value;
        value = a / b;

        return value;

    }



}
