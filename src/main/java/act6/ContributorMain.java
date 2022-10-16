package act6;

import java.text.DecimalFormat;

public class ContributorMain {

    private static final DecimalFormat value = new DecimalFormat("0.00");

    public static void main(String[] args) {

        //contributor object
        Contributor contributor1 = new Contributor("John", "Doe", 25, 20000);
        System.out.println("Salary: " + value.format(contributor1.getSalary()));

        





    }

}
