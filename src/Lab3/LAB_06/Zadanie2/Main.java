package Lab3.LAB_06.Zadanie2;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Samochod samochod1 = new Samochod(scanner);
        Samochod samochod2 = new Samochod(
                "Audi",
                "A6",
                "Sedan",
                "Czarny",
                2015,
                190000);
        SamochodOsobowy samochodOsobowy = new SamochodOsobowy(scanner);
        samochod1.opis();
        samochod2.opis();
        samochodOsobowy.opis();
    }
}
