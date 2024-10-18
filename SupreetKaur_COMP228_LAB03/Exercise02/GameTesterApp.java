import java.util.Scanner;

public class GameTesterApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Game Tester name: ");
        String name = input.nextLine();
        System.out.print("Is the tester full-time (yes/no): ");
        String fullTime = input.nextLine();

        if (fullTime.equalsIgnoreCase("yes")) {
            GameTester fullTimeTester = new FullTimeGameTester(name);
            System.out.println("Salary: $" + fullTimeTester.determineSalary());
        } else {
            System.out.print("Enter hours worked: ");
            int hours = input.nextInt();
            GameTester partTimeTester = new PartTimeGameTester(name, hours);
            System.out.println("Salary: $" + partTimeTester.determineSalary());
        }
    }
}