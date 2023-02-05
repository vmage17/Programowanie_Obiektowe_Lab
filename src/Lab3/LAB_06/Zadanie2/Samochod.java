package Lab3.LAB_06.Zadanie2;

import java.util.Scanner;

public class Samochod {
    protected String marka;
    protected String model;
    protected String nadwozie;
    protected int przebieg;
    protected String kolor;
    protected int rokProdukcji;

    public Samochod(Scanner scanner) {
        System.out.println("Podaj marke auta:");
        this.marka = scanner.nextLine();
        System.out.println("Podaj model auta:");
        this.model = scanner.nextLine();
        System.out.println("Podaj typ nadwozia:");
        this.nadwozie = scanner.nextLine();
        System.out.println("Podaj kolor auta:");
        this.kolor = scanner.nextLine();
        System.out.println("Podaj rok produkcji:");
        this.rokProdukcji = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj przebieg auta:");
        while (true) {
            this.przebieg = Integer.parseInt(scanner.nextLine());
            if (this.przebieg > 0)
                break;
            System.out.println("Przebieg ujemny! Podaj poprawny przenieg auta:");
        }
    }

    public Samochod(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNadwozie() {
        return nadwozie;
    }

    public void setNadwozie(String nadwozie) {
        this.nadwozie = nadwozie;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public void opis() {
        System.out.println("Samochod{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", nadwozie='" + nadwozie + '\'' +
                ", przebieg=" + przebieg +
                ", kolor='" + kolor + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                '}');
    }
}
