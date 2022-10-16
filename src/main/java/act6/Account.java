package act6;

import java.text.DecimalFormat;

public class Account extends Contributor {

    private String accountType;
    private Contributor contributor; //aggregation

    private static final DecimalFormat value = new DecimalFormat("0.00");


    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Contributor getContributor() {
        return contributor;
    }

    public void setContributor(Contributor contributor) {
        this.contributor = contributor;
    }

    public Account(String accountType, Contributor contributor) {
        this.accountType = accountType;
        this.contributor = contributor;

    }

    public abstract double getContributionRate() {
        //return contribution rate based on account type
    }

    public double calculateContribution() {
        return getContributor().getSalary() * getContributionRate();
    }

    public void displayContribution() {
        System.out.println("Contribution amount: " + value.format(calculateContribution()));
    }


}
