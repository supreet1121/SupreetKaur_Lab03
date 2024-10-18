public abstract class Mortgage implements MortgageConstants {
    public String mortgageNumber;
    public String customerName;
    public double mortgageAmount;
    public double interestRate;
    public int term;

    public Mortgage(String mortgageNumber, String customerName, double mortgageAmount, double interestRate, int term) {
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        if (mortgageAmount > MAX_MORTGAGE_AMOUNT) {
            this.mortgageAmount = MAX_MORTGAGE_AMOUNT;
        } else {
            this.mortgageAmount = mortgageAmount;
        }
        this.interestRate = interestRate;

        if (term != SHORT_TERM && term != MEDIUM_TERM && term != LONG_TERM) {
            this.term = SHORT_TERM;
        } else {
            this.term = term;
        }
    }

    public abstract void calculateInterestRate(double primeRate);

    public String getMortgageInfo() {
        return "Mortgage Number: " + mortgageNumber + "\n" +
                "Customer Name: " + customerName + "\n" +
                "Mortgage Amount: $" + mortgageAmount + "\n" +
                "Interest Rate: " + interestRate + "%\n" +
                "Term: " + term + " year(s)";
    }

    public double calculateTotalOwed() {
        return mortgageAmount + (mortgageAmount * (interestRate / 100) * term);
    }
}
