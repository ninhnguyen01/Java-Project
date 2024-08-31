package ChatbotProject;

import java.util.Scanner;

// Template
/* Hello! My name is Aid.
I was created in 2023.
Please, remind me your name.
What a great name you have, {yourName}! */

// Expected output example
/* Hello! My name is Aid.
I was created in 2023.
Please, remind me your name.
> Max
What a great name you have, Max! */

public class SimpleBot2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Theodoric.");
        System.out.println("I was created in 2024.");
        System.out.println("Please, remind me your name.");
        String name = scanner.next();

        // Read a name
        System.out.printf("What a great name you have, " + name + "!");

        // Close the scanner
        scanner.close();
    }
}
