import java.util.Scanner;

public class ProcessMortgage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the current prime interest rate (as a percentage): ");
        double primeRate = input.nextDouble();

        Mortgage[] mortgages = new Mortgage[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nMortgage #" + (i + 1));
            System.out.print("Enter Mortgage Number: ");
            String mortgageNumber = input.next();
            System.out.print("Enter Customer Name: ");
            String customerName = input.next();
            System.out.print("Enter Mortgage Amount (max $300,000): ");
            double mortgageAmount = input.nextDouble();
            System.out.print("Enter Term (1 for short-term, 3 for medium-term, 5 for long-term): ");
            int term = input.nextInt();
            System.out.print("Enter Mortgage Type (1 for Business, 2 for Personal): ");
            int mortgageType = input.nextInt();

            if (mortgageType == 1) {
                mortgages[i] = new BusinessMortgage(mortgageNumber, customerName, mortgageAmount, primeRate, term);
            } else if (mortgageType == 2) {
                mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, mortgageAmount, primeRate, term);
            } else {
                System.out.println("Invalid mortgage type entered. Defaulting to Personal Mortgage.");
                mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, mortgageAmount, primeRate, term);
            }
        }

        System.out.println("\n--- Mortgage Information ---");
        for (Mortgage mortgage : mortgages) {
            System.out.println(mortgage.getMortgageInfo());
            System.out.println("Total Amount Owed: $" + mortgage.calculateTotalOwed());
            System.out.println("----------------------------");
        }

        input.close();
    }
}
