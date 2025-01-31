import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a Captain? (true/false): ");
        boolean isCaptain = scanner.nextBoolean();

        System.out.println();
        System.out.println("Hello " + name + '!');
        System.out.println("You are " + age + " years old.");

        if (isCaptain == true) {
            System.out.println("Here is the information.");
        }

        else {
            System.out.println("Your request is denied! Leave now.");
        }

        System.out.println();

        scanner.close();
    }
}
