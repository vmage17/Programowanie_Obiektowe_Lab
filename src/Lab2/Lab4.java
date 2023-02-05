package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Lab4 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // Zad1
        //sumAndMean(3, 5, 5);

        // Zad2
        //displayArrays();

        // Zad3
        //stringArrayToUpper();

        // Zad4
        //reverseSentence();

        // Zad5
        //bubbleSort();

        // Zad6
        //fiveFactorials();

        // Zad 7
        //System.out.println(areTwoSentencesSame());
    }

    // Zad1
    public static double randomNumber(int min, int max) {
        return Math.random()*(double)(max - min) + (double)min;
    }
    public static void sumAndMean(int min, int max, int size) {
        double[] arr = new double[size];
        for (int i = 0; i < arr.length; i++)
            arr[i] = randomNumber(min, max);
        double sum = 0.0;
        for (var number : arr)
            sum += number;
        System.out.println(Arrays.toString(arr));
        System.out.println("Suma: " + sum);
        System.out.println("Średnia: " + sum/(double)size);
    }

    //Zad2
    public static void displayArrays() {
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++)
            arr1[i] = (int)randomNumber(0, 11);
        int[] arr2 = new int[11];
        for (int i = 0; i < arr2.length; i++)
            arr2[i] = (int)randomNumber(0, 11);
        System.out.println("Pierwsza tablica: " + Arrays.toString(arr1));
        System.out.println("Druga tablica: " + Arrays.toString(arr2));

        for (int i = 0; i < arr1.length; i += 2)
            System.out.print(arr1[i] + ", ");
        System.out.println();
        for (int i = 0; i < arr2.length; i += 2)
            System.out.print(arr2[i] + ", ");
    }

    // Zad3
    public static void stringArrayToUpper() {
        String[] strArray = new String[] {"Ala", "ma", "dwa", "puszyste", "koty"};
        for (String string : strArray) {
            System.out.print(string.toUpperCase() + " ");
        }
    }

    // Zad4
    public static void reverseSentence() {
        String[] strArray = new String[5];
        for (int i = 0; i < strArray.length; i++)
            strArray[i] = in.nextLine();
        System.out.println(Arrays.toString(strArray));
        for (int i = strArray.length - 1; i >= 0; i--) {
            for (int j = strArray[i].length() - 1; j >= 0; j--)
                System.out.print(strArray[i].charAt(j));
            System.out.print(" ");
        }
    }

    // Zad5
    public static void bubbleSort() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++)
            arr[i] = in.nextInt();
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Posortowana tablica: " + Arrays.toString(arr));
    }

    // Zad6
    public static int factorial(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++)
            res *= i;
        return res;
    }
    public static void fiveFactorials() {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++)
            arr[i] = in.nextInt();
        for (int num : arr)
            System.out.print(factorial(num) + " ");
    }

    // Zad7
    public static boolean areTwoSentencesSame() {
        String[] strArray1 = new String[] {"Ala", "ma", "dwa", "puszyste", "koty"};
        String[] strArray2 = new String[] {"Ala", "ma", "dwa", "puszyste", "koty"};
        if (strArray1.length != strArray2.length)
            return false;
        for (int i = 0; i < strArray1.length; i++) {
            if (!strArray1[i].equals(strArray2[i]))
                return false;
        }
        return true;
    }
}