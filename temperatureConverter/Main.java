package temperatureConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Temperature Converter Program

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();
        System.out.println();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();
        System.out.println();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;
        System.out.printf("Temperature: %.1f°%s\n", newTemp, unit);
        System.out.println();

        scanner.close();
    }
}