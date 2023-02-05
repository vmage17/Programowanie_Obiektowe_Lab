package Lab3.LAB_06.Zadanie3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ksiegarnia {
    private final List<Ksiazka> ksiazki = new ArrayList<>();
    private final List<Klient> klienci = new ArrayList<>();
    private final Map<Klient, List<Ksiazka>> klientKsiazki = new HashMap<>();

    public void wypozyczKsiazke(Klient klient, String autor, String tytul) {
        Ksiazka ksiazka = ksiazki.stream()
                .filter(rekord -> rekord.getAutor().equals(autor) && rekord.getTytul().equals(tytul))
                .findFirst()
                .map(book -> {
                    book.zmniejszIlosc();
                    if (book.getIlosc() < 0) {
                        book.setIlosc(0);
                        throw new RuntimeException("Brak dostepnych egzemplarzy tej ksiazki!");
                    }
                    return book;
                })
                .orElseThrow(() -> new RuntimeException("Brak ksiazki w zbiorach!"));
        List<Ksiazka> ksiazkiKlienta = klientKsiazki.getOrDefault(klient, new ArrayList<>());
        ksiazkiKlienta.add(ksiazka);
        klientKsiazki.put(klient, ksiazkiKlienta);
    }

    public void zwrocKsiazke(Klient klient, Ksiazka ksiazka) {
        Ksiazka ksiazkaWZbiorze = ksiazki.stream()
                .filter(rekord -> rekord.equals(ksiazka))
                .findFirst()
                .map(book -> {
                    book.zwiekszIlosc();
                    return book;
                })
                .orElseThrow(() -> new RuntimeException("Brak ksiazki w zbiorach!"));
        List<Ksiazka> ksiazkiKlienta = klientKsiazki.get(klient);
        ksiazkiKlienta.remove(ksiazkaWZbiorze);
        klientKsiazki.put(klient, ksiazkiKlienta);
    }

    public void dodajKlientow(Collection<Klient> nowiKlienci) {
        klienci.addAll(nowiKlienci);
    }

    public void dodajKsiazki(Collection<? extends Ksiazka> kolekcjaKsiazek) {
        ksiazki.addAll(kolekcjaKsiazek);
    }

    public List<Ksiazka> getKsiazki() {
        return ksiazki;
    }

    public List<Klient> getKlienci() {
        return klienci;
    }

    public List<Ksiazka> pokazKsiazkiKlienta(Klient klient) {
        return klientKsiazki.get(klient);
    }
}

