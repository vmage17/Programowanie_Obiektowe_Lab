package Lab4.LAB_08.Zadanie1;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Podaj liczbe dodatnia: ");
        double number;
        while (true) {
            try {
                number = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Podaj jedna liczbe!");
            }
        }
        if (number > 0) {
            double sqrt = Math.sqrt(number);
            System.out.printf("Pierwiastek z liczby %.2f: %.2f", number, sqrt);
        } else {
            throw new IllegalArgumentException("Pierwiastek z liczby ujemnej nie istnieje!");
        }
    }
}
