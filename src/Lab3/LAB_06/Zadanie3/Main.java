package Lab3.LAB_06.Zadanie3;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ksiegarnia ksiegarnia = new Ksiegarnia();

        Klient klient1 = new Klient("Adam", "Nowak", LocalDate.of(1992, 6, 30), "92063093816");
        Klient klient2 = new Klient("Mateusz", "Kowalski", LocalDate.of(1999, 3, 4), "99030443292");
        Klient klient3 = new Klient("John", "Doe", LocalDate.of(2000, 9, 3), "00090382938");
        ksiegarnia.dodajKlientow(List.of(klient1, klient2, klient3));

        Ksiazka ksiazka1 = new Ksiazka("1", "Effective Java", "Joshua Bloch", 2010, 2);
        Ksiazka ksiazka2 = new Powiesc("2", "Shine", "Stephen King", 1995, 3, "Horror");
        Ksiazka ksiazka3 = new Podrecznik("3", "Java Puzzlers", "Neal Gaffer", 2005, 4, "Informatyka");
        ksiegarnia.dodajKsiazki(List.of(ksiazka2, ksiazka1, ksiazka3));
        System.out.println("Ksiazki dostepne w ksiegarni: " + ksiegarnia.getKsiazki());

        ksiegarnia.wypozyczKsiazke(klient1, "Stephen King", "Shine");
        ksiegarnia.wypozyczKsiazke(klient1, "Neal Gaffer", "Java Puzzlers");
        System.out.println("Ksiazki klienta " + klient1.getImie() + " " + klient1.getNazwisko() + ": " + ksiegarnia.pokazKsiazkiKlienta(klient1));
        System.out.println("Ilosc dostepnych egzemplarzow ksiazki o numerze ISBN=" + ksiazka3.getIsbn() + " wynosi: " + ksiazka3.getIlosc());

        ksiegarnia.zwrocKsiazke(klient1, ksiazka3);
        System.out.println("Ksiazki klienta " + klient1.getImie() + " " + klient1.getNazwisko() + ": " + ksiegarnia.pokazKsiazkiKlienta(klient1));
        System.out.println("Ilosc dostepnych egzemplarzow ksiazki o numerze ISBN=" + ksiazka3.getIsbn() + " wynosi: " + ksiazka3.getIlosc());
    }
}
