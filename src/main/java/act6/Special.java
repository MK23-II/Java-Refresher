package act6;

public class Special extends Account {

    public Special(String accountType, Contributor contributor) {
        super(accountType, contributor);
    }

    @Override
    public double getContributionRate() {
        return 0.07;
    }
}
