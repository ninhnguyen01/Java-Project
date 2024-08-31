package ChatbotProject;

import java.util.Scanner;

public class SimpleBot3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Theodoric.");
        System.out.println("I was created in 2024.");
        System.out.println("Please, remind me your name.");

        // Read the user's name
        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        // Read all remainders
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();

        // Calculate the age using a formula
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        // Print the result
        System.out.println("Your age is " + age + "; that's a good time to start programming!");

        scanner.close();
    }
}