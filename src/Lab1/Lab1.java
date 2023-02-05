package Lab1;

import java.util.Scanner;

public class Lab1 {

    static Scanner in = new Scanner (System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.printf(Boolean.toString(rightTriangle(a+Math.random()*(b-a), a+Math.random()*(b-a), a+Math.random()*(b-a))));
    }

    // Lab1 zad1
    public static void getName() {
        System.out.printf("Radosław 23");
    }

    // Lab1 zad2
    public static void sum() {
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Suma: " + Integer.toString(a + b));
        System.out.println("Różnica: " + Integer.toString(a - b));
        System.out.println("Iloczyn: " + Integer.toString(a * b));
    }

    // Lab1 zad3
    public static boolean isEven(int number) {
        if (number % 2 == 0)
            return true;
        return false;
    }

    // Lab1 zad4
    public static boolean isDivBy3and5(int number) {
        if (number % 3 == 0 && number % 5 == 0)
            return true;
        return false;
    }

    // Lab1 zad5
    public static double toPowerOf3(double number) {
        return number * number * number;
    }

    // Lab1 zad6
    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }

    // Lab1 zad7
    public static boolean rightTriangle(double a, double b, double c) {
        if (a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b)
            return true;
        return false;
    }

}