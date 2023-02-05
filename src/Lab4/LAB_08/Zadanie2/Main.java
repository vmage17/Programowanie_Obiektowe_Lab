package Lab4.LAB_08.Zadanie2;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws BlednaWartoscDlaSilniException {
        System.out.println("Podaj liczbe dodatnia: ");
        try {
            int number = scanner.nextInt();
            getFactorial(number);
        } catch (BlednaWartoscDlaSilniException e) {
            System.out.println("Blad liczenia silni: " + e.getMessage());
        }
    }

    private static void getFactorial(int number) throws BlednaWartoscDlaSilniException {
        if (number < 0) {
            throw new BlednaWartoscDlaSilniException("Silnia z liczby ujemnej nie istnieje!");
        }
        long factorial = 1;
        for (int i = number; i > 1; i--) {
            factorial *= i;
        }
        System.out.println("Silnia z liczby " + number + ": " + factorial);
    }
}
