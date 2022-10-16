package act6;

public class MediSave extends Account {

    public MediSave(String accountType, Contributor contributor) {
        super(accountType, contributor);
    }

    @Override
    public double getContributionRate() {
        return 0.08;
    }
}
