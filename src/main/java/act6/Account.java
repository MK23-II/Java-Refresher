package act6;

public class Account extends Contributor {

    private String accountType;
    private Contributor contributor;




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
        //will add details later
    }

    public double calculateContribution() {
        //will add details later
    }

    public void displayContribution() {
        //will add details laters
    }


}
