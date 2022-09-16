package act2;

import java.util.Scanner;

public class ArraysExercise {

    public static void main(String[] args) {

        System.out.print("Enter required size of the array: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int numbers[] = new int[size];
        int firstNum = 1;
        numbers[0] = firstNum;

        //geometric pattern
        while(size!=0){
            System.out.println(firstNum);
            firstNum *=2;
            size -= 1;

        }

        //calculate sum of all array elements
        int totalSum = 0;
        int sum = firstNum;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            totalSum = sum-2;
        }
        System.out.println("Sum of all the inputs is: " + totalSum);

        //calculate the average
        double average = totalSum/numbers.length;
        int averageTotal = (int) average; //type cast double to int
        System.out.println("Average of the inputs is: " + averageTotal);

    }
}
