public class PersonalMortgage extends Mortgage {
    public PersonalMortgage(String mortgageNumber, String customerName, double mortgageAmount, double primeRate, int term) {
        super(mortgageNumber, customerName, mortgageAmount, primeRate + 2.0, term);
    }

    @Override
    public void calculateInterestRate(double primeRate) {
        this.interestRate = primeRate + 2.0;
    }
}