
import java.util.Scanner;

public class InsuranceTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Insurance[] insuranceArray = new Insurance[1];

        System.out.print("Enter type of insurance (Life/Health): ");
        String insuranceType = input.nextLine();
        System.out.print("Enter monthly cost: ");
        double cost = input.nextDouble();

        if (insuranceType.equalsIgnoreCase("Life")) {
            insuranceArray[0] = new Life();
        } else if (insuranceType.equalsIgnoreCase("Health")) {
            insuranceArray[0] = new Health();
        }

        insuranceArray[0].setInsuranceCost(cost);
        insuranceArray[0].displayInfo();
    }
}
