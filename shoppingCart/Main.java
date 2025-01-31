package shoppingCart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println("What item would you like to buy? ");
        item = scanner.nextLine();
        System.out.println();

        System.out.print("Enter item price: ");
        price = scanner.nextDouble();
        System.out.println();

        System.out.print("Enter quantity amount: ");
        quantity = scanner.nextInt();
        System.out.println();

        System.out.println("Name: " + item);
        System.out.println("Price: " + price);
        System.out.println("Quantity:" + " x" + quantity);
        total = price * quantity;
        System.out.print("Total: " + currency + total);
        System.out.println();

        scanner.close();
        System.out.println();
    }
}