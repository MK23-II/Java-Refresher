package act6;

public class Ordinary extends Account {

    public Ordinary(String accountType, Contributor contributor) {
        super(accountType, contributor);
    }

    @Override
    public double getContributionRate() {
        return 0.06;
    }
}
