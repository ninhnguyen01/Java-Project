package compoundInterestCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Compound Interest Calculator

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.println();
        System.out.print("Enter principal amount: ");
        principal = scanner.nextDouble();
        System.out.println();

        System.out.print("Enter interest rate (in %): ");
        rate = scanner.nextDouble() / 100;
        System.out.println();

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();
        System.out.println();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();
        System.out.println();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);
        System.out.printf("The amount after %d year(s) is: $%.2f\n", years, amount);
        System.out.println();
        scanner.close();
    }

}