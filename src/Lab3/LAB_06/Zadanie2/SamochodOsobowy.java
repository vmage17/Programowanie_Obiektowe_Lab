package Lab3.LAB_06.Zadanie2;

import java.util.Scanner;

public class SamochodOsobowy extends Samochod {

    private double waga;
    private double pojemnoscSilnika;
    private int liczbaPasazerow;

    public SamochodOsobowy(Scanner scanner) {
        super(scanner);
        System.out.println("Podaj wage auta:");
        while (true) {
            this.waga = Double.parseDouble(scanner.nextLine());
            if (this.waga > 2.0 && this.waga < 4.5)
                break;
            System.out.println("Waga powinna byc z przedzialu 2 - 4.5. Podaj poprawna wage auta:");
        }
        System.out.println("Podaj pojemnosc silnika:");
        while (true) {
            this.pojemnoscSilnika = Double.parseDouble(scanner.nextLine());
            if (this.pojemnoscSilnika > 0.8 && this.pojemnoscSilnika < 3.0)
                break;
            System.out.println("Pojemnosc silnika powinna byc z przedzialu 0.8 - 3.0. Podaj poprawna pojemnosc silnika:");
        }
        System.out.println("Podaj liczbe pasazerow:");
        this.liczbaPasazerow = Integer.parseInt(scanner.nextLine());
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(double pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public int getLiczbaPasazerow() {
        return liczbaPasazerow;
    }

    public void setLiczbaPasazerow(int liczbaPasazerow) {
        this.liczbaPasazerow = liczbaPasazerow;
    }

    @Override
    public void opis() {
        System.out.println("SamochodOsobowy{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", nadwozie='" + nadwozie + '\'' +
                ", kolor='" + kolor + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                ", przebieg=" + przebieg +
                ", waga=" + waga +
                ", pojemnoscSilnika=" + pojemnoscSilnika +
                ", liczbaPasazerow=" + liczbaPasazerow +
                '}');
    }
}
