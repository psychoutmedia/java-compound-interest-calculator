import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {

        //Compound Interest Calculator

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();
        System.out.print("Enter the Interest rate (in %): ");
        rate = scanner.nextDouble() /100;
        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();
        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The Amount after %d years is £%.2f", years, amount);



        scanner.close();

    }
}
