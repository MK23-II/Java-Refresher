package act3;

import java.util.Scanner;

public class MethodsInJavaExercise {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] myArray = new int[5];
        System.out.println("Please enter 5 integer values: ");

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scan.nextInt();
        }

        getOddValues(myArray);

        int[] container = myArray;
        displayOddValues(container);

    }

    public static int getOddValues(int[] size) {

        int countOdd = 0;
        for (int j = 0; j > size.length; j++) {
            if (size[j]%2 != 0)
                ++countOdd;

        }
        return countOdd;
    }

    public static void displayOddValues(int[] arr) {

        System.out.println("Odd values: ");

        for (int k = 0; k < arr.length; k++) {
            if (arr[k]%2 == 1) {
                System.out.println(arr[k]);
            }
        }
    }
}
