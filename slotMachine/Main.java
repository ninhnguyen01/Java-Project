package slotMachine;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Java Slot Machine

        // Declare Variables
        // Display Welcome Message
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        System.out.println("-------------------------");
        System.out.println("  Welcome to Java Slots  ");
        System.out.println(" Symbols: 🍒 🍉 🍋 🔔 ⭐️ ");
        System.out.println("-------------------------\n");

        // Play if balance > 0
        // Enter bet amount
        while (balance > 0) {
            System.out.println();
            System.out.println("Balance : $" + balance);
            System.out.print("Place bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            // verify if bet > balance
            if (bet > balance) {
                System.out.println("Insufficient funds!");
                continue;
            }

            // verify if bet > 0
            else if (bet <= 0) {
                System.out.println("Bet must be greater than 0");
                continue;
            }

            // subtract bet from balance
            else {
                balance -= bet;

            }

            System.out.println("Spinning...");
            // spin row
            row = spinRow();
            // print row
            printRow(row);
            // get payout
            payout = getPayout(row, bet);

            if (payout > 0) {
                System.out.println("You won $" + payout);
                balance += payout;
            } else {
                System.out.println("Sorry, you lost this round!");
                System.out.println();
            }

            // ask to play again
            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();
            System.out.println();

            if (!playAgain.equals("Y")) {
                break;
            }
        }

        // display exit message
        System.out.println("Game over! Your final balance: $" + balance);
        System.out.println();

        scanner.close();
    }

    static String[] spinRow() {
        String[] symbols = { "🍒", "🍉", "🍋", "🔔", "⭐️" };
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    static void printRow(String[] row) {
        System.out.println("--------------");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("--------------");
    }

    static int getPayout(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐️" -> bet * 20;
                default -> 0;
            };
        }

        else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐️" -> bet * 10;
                default -> 0;
            };
        }

        else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐️" -> bet * 10;
                default -> 0;
            };
        }

        return 0;

    }
}