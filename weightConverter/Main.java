package weightConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Weight Conversion Program

        System.out.println();
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.println();

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();
        System.out.println();

        if (choice == 1) {
            System.out.println();
            System.out.print("Enter the weight in (lbs): ");
            weight = scanner.nextDouble();
            System.out.println();
            newWeight = weight * 0.453592;
            System.out.printf("Weight in (kgs) is: %.2f\n", newWeight);
            System.out.println();
        }

        else if (choice == 2) {
            System.out.println();
            System.out.print("Enter the weight in (kgs): ");
            weight = scanner.nextDouble();
            System.out.println();
            newWeight = weight * 2.20462;
            System.out.printf("Weight in (lbs) is: %.2f\n", newWeight);
            System.out.println();

        }

        else {
            System.out.println();
            System.out.println("You DID NOT select a valid option!");
            System.out.println();
        }

        scanner.close();
    }
}