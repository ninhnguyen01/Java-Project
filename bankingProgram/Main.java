package bankingProgram;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Banking program
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("---------------");
            System.out.println("Banking Program");
            System.out.println("---------------");
            System.out.println("1) Show Balance");
            System.out.println("2) Deposit");
            System.out.println("3) Withdraw");
            System.out.println("4) Exit");
            System.out.println("---------------");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice!\n");
            }

        }

        System.out.println("----------------------------");
        System.out.println("Thank you for your business!");
        System.out.println("----------------------------\n");
        scanner.close();

    }

    static void showBalance(double balance) {
        System.out.println("---------------");
        System.out.printf(" Balance: $%.2f\n", balance);
        System.out.println("---------------\n");
    }

    static double deposit() {
        System.out.println("---------------");
        double amount;
        System.out.println("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();
        System.out.println("---------------\n");

        if (amount < 0) {
            System.out.println("Amount can't be negative!\n");
            return 0;
        }

        else {
            return amount;
        }

    }

    static double withdraw(double balance) {
        System.out.println("---------------");
        double amount;
        System.out.println("Enter an amount to be withdrawn: ");
        amount = scanner.nextDouble();
        System.out.println("---------------\n");

        if (amount > balance) {
            System.out.println("Insufficent funds!\n");
            return 0;
        }

        else if (amount < 0) {
            System.out.println("Amount can't be negative!\n");
            return 0;
        }

        else {
            return amount;
        }

    }

}