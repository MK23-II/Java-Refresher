package act2;

import java.util.Scanner;

public class SimpleBankingApp {

    //global variable
    static int startingBalance;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String username;

        int option = 0;
        int addFund;
        int transferFund;


        System.out.println("Please enter your name: ");
        username = scan.nextLine();

        System.out.println("Please enter your starting balance: ");
        startingBalance = scan.nextInt();


        while (option != 4) {

            System.out.println("____________________");
            System.out.println("---OPTIONS---");
            System.out.println("1 - Check Balance");
            System.out.println("2 - Add Funds");
            System.out.println("3 - Transfer Funds");
            System.out.println("4 - Exit the program");
            System.out.println("____________________");

            System.out.println("Choose an option: ");
            option = scan.nextInt();

            switch (option) {

                case 1:

                    System.out.println("Username: " + username);
                    System.out.println("Balance: " + startingBalance);
                    break;

                case 2:

                    System.out.println("Enter how much funds to add to your account: ");
                    addFund = scan.nextInt();
                    addBalance(addFund);
                    break;

                case 3:

                    System.out.println("Enter how much funds to transfer from your account: ");
                    transferFund = scan.nextInt();
                    transferBalance(transferFund);
                    break;

                default:
                    System.out.println("Exit");
            }

        }

    }

    public static void addBalance(int a) {
        startingBalance += a;
    }

    public static void transferBalance(int b) {
        startingBalance -= b;
    }


}
