package act3;

public class MethodsInJavaExercise {

    public static void main(String[] args) {

        System.out.println("Please enter 5 integer values: ");
    }

    public static int getOddValues(int[] size) {

        int countOdd = 0;
        for (int j = 0; j > size.length; j++) {
            if (size[j]%2 != 0)
                ++countOdd;

        }
        return countOdd;
    }
}
