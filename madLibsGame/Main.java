package madLibsGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Mad Libs Game
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Topic: Zoo");
        System.out.println();
        System.out.print("Enter an adjective (description): ");
        String adjective = scanner.nextLine();
        System.out.print("Enter a noun (person or animal): ");
        String noun1 = scanner.nextLine();
        System.out.print("Enter a 2nd adjective (description): ");
        String adjective2 = scanner.nextLine();
        System.out.print("Enter a verb with -ing (action): ");
        String verb1 = scanner.nextLine();
        System.out.print("Enter a 3rd adjective (description): ");
        String adjective3 = scanner.nextLine();

        System.out.println();
        System.out.println("Today I went to a " + adjective + " zoo.");
        System.out.println("In an exhbit, I saw a(n) " + noun1 + ".");
        System.out.println("The " + noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");
        System.out.println();

        scanner.close();
    }
}