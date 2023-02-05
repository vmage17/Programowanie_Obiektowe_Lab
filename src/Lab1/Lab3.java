package Lab1;

import java.util.Scanner;
import java.util.Random;

public class Lab3 {

    static Scanner in = new Scanner (System.in);

    public static void main(String[] args) {
        mean();
        sumOfPositiveAndNegative();
        int[] arr = {10, -3, 5, 234, 0, -78};
        sumOfEvens(arr);
        sumOfEvenRandomNumbers(15);
        isPalindrome();
    }

    // Lab3 zad1
    public static void mean() {
        System.out.print("Podaj liczbę studentów: ");
        int n = in.nextInt();
        int sum = 0;
        int i = 0;
        while(i < n) {
            sum += in.nextInt();
            i++;
        }
        System.out.println((double)sum/(double)n);
    }

    // Lab3 zad2
    public static void sumOfPositiveAndNegative() {
        int numOfPos = 0;
        int numOfNeg = 0;
        int sumOfPos = 0;
        int sumOfNeg = 0;
        for(int i = 0; i < 10; i++) {
            int cur = in.nextInt();
            if (cur > 0) {
                numOfPos++;
                sumOfPos += cur;
            }
            else if (cur < 0){
                numOfNeg++;
                sumOfNeg += cur;
            }
        }
        System.out.println("Ilość liczb dodatnich: " + numOfPos);
        System.out.println("Suma liczb dodatnich: " + sumOfPos);
        System.out.println("Ilość liczb ujemnych: " + numOfNeg);
        System.out.println("Suma liczb ujemnych: " + sumOfNeg);
    }

    // Lab1 zad3
    public static void sumOfEvens(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 ==0)
                sum += num;
        }
        System.out.println("Suma liczb parzystych w ciągu: " + sum);
    }

    // Lab1 zad4
    public static void sumOfEvenRandomNumbers(int n) {
        Random rand = new Random();
        int x = -10;
        int y = 45;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = rand.nextInt(y-x+1)+x;
            if (num % 2 == 0)
                sum += num;
        }
        System.out.println("Suma liczb parzystych wylosowanych z przedziału [" + x + ", " + y + "] wynosi: " + sum);

    }

    // Lab1 zad5
    public static void isPalindrome() {
        System.out.print("Podaj słowo: ");
        String word = in.nextLine();
        boolean isPalindrome = true;
        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1))
                isPalindrome = false;
        }
        if (isPalindrome)
            System.out.printf(word + " jest palindromem!");
        else
            System.out.printf(word + " nie jest palindromem!");
    }
}