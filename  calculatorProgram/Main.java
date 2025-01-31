package calculatorProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        System.out.println();
        System.out.print("Enter a number: ");
        num1 = scanner.nextDouble();

        System.out.println();
        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.println();
        System.out.print(("Enter a 2nd number: "));
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println();
                    System.out.println("Cannot divide by zero!\n");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid Operator!\n");
                validOperation = false;
            }
        }

        System.out.println();
        if (validOperation && result != 0) {
            System.out.printf("Result: %.2f\n", result);
        }
        System.out.println();

        scanner.close();
    }
}