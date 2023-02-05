package Lab1;

import java.util.Scanner;

public class Lab2 {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //quadraticEquation();
        //order(6,4,1);
        //rainAndBus();
        bonusAndDiscount();
        calculator();
    }

    // Lab2 zad1
    public static void quadraticEquation() {
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Podaj a: ");
        double a = in.nextDouble();
        System.out.println("Podaj b: ");
        double b = in.nextDouble();
        System.out.println("Podaj c: ");
        double c = in.nextDouble();
        //System.out.println(Double.toString(a) + "*x^2 + " + Double.toString(b) + "*x + " + Double.toString(c) + " = 0");
        if (a == 0 && b != 0) {
            System.out.print("Rozwiązaniem równania kwadratowego jest: " + -c/b);
            return;
        }
        if (a == 0 && b == 0 && c == 0) {
            System.out.print("Równanie kwadratowe nie ma rozwiązań");
            return;
        }
        double delta = b*b - 4*a*c;
        if (delta < 0) {
            System.out.print("Równanie kwadratowe nie ma rozwiązań");
            return;
        }
        if (delta == 0) {
            System.out.print("Rozwiązaniem równania kwadratowego jest: " + (-b/(2*a)));
            return;
        }
        System.out.print("Rozwiązaniami równania kwadratowego są: " + (-b+Math.sqrt(delta))/(2*a) + " oraz " + (-b-Math.sqrt(delta))/(2*a));
    }

    // Lab2 zad2
    public static double a(double x) {
        if (x > 0)
            return 2*x;
        if (x == 0)
            return 0;
        return 3*x;
    }
    public static double b(double x) {
        if (x >= 1)
            return x*x;
        return x;
    }
    public static double c(double x) {
        if (x > 2)
            return 2+x;
        if (x == 2)
            return 8;
        return x-4;
    }

    // Lab2 zad3
    public static void order(double x, double y, double z) {
        if (x > y) {
            double temp = x;
            x = y;
            y = temp;
        }
        if (y > z) {
            double temp = z;
            z = y;
            y = temp;
        }
        if (x > y) {
            double temp = x;
            x = y;
            y = temp;
        }
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }

    // Lab2 zad4
    public static void  rainAndBus() {
        boolean isRain = false;
        boolean isBus = false;

        System.out.println("Pada?");
        String answer = in.nextLine();
        if (answer.equals("tak"))
            isRain = true;

        System.out.println("Jest autobus?");
        answer = in.nextLine();
        if (answer.equals("tak"))
            isBus = true;

        if (isRain && isBus) {
            System.out.println("Weź parasol");
            System.out.println("Dostaniesz się na uczelnię");
        }
        if (isRain && !isBus) {
            System.out.println("Nie dostaniesz się na uczelnię");
        }
        if (!isRain && isBus) {
            System.out.println("Dostaniesz się na uczelnię");
            System.out.println("Miłego dnia i pięknej pogody");
        }
    }

    // Lab2 zad5
    public static void  bonusAndDiscount() {
        boolean isDiscount = false;
        boolean isBonus = false;

        System.out.println("Jest premia?");
        String answer = in.nextLine();
        if (answer.equals("tak"))
            isBonus = true;

        System.out.println("Jest zniżka na samochód?");
        answer = in.nextLine();
        if (answer.equals("tak"))
            isDiscount = true;

        if (!isDiscount || isBonus) {
            System.out.println("Możesz kupić samochód!");
            System.out.println("Zniżki na samochód nie ma");
        }
        if (!isDiscount || !isBonus) {
            System.out.println("Zakup samochód trzeba odłożyć na później...");
            System.out.println("Zniżki na samochód nie ma");
        }
        if (isDiscount || isBonus) {
            System.out.println("Możesz kupić samochód!");
        }
    }

    //Lab2 zad6
    public static void  calculator() {
        System.out.println("Podaj pierwszą liczbę: ");
        double a = in.nextDouble();
        System.out.println("Podaj drugą liczbę: ");
        double b = in.nextDouble();
        System.out.println("Podaj działanie (+, -, *, /, %): ");
        char op = '+';//in.next().charAt(0);
        if (op == '+')
            System.out.print(a+b);
        if (op == '-')
            System.out.print(a-b);
        if (op == '*')
            System.out.print(a*b);
        if (op == '/')
            System.out.print(a/b);
        if (op == '%')
            System.out.print(a/b);
    }
}