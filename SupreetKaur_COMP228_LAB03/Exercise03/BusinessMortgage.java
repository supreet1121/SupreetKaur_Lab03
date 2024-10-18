public class BusinessMortgage extends Mortgage {
    public BusinessMortgage(String mortgageNumber, String customerName, double mortgageAmount, double primeRate, int term) {
        super(mortgageNumber, customerName, mortgageAmount, primeRate + 1.0, term); // Adds 1% to prime rate
    }

    @Override
    public void calculateInterestRate(double primeRate) {
        this.interestRate = primeRate + 1.0;
    }
}

