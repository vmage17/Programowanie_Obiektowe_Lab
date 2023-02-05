package Lab3.LAB_06.Zadanie3;

import java.util.Objects;

public class Ksiazka {
    private final String isbn;
    private final String autor;
    private final String tytul;
    private final int rok;
    private int ilosc;

    public Ksiazka(String isbn, String tytul, String autor, int rok, int ilosc) {
        this.isbn = isbn;
        this.tytul = tytul;
        this.autor = autor;
        this.rok = rok;
        this.ilosc = ilosc;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public String getTytul() {
        return tytul;
    }

    public int getRok() {
        return rok;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public void zwiekszIlosc() {
        this.ilosc++;
    }

    public void zmniejszIlosc() {
        this.ilosc--;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ksiazka ksiazka = (Ksiazka) o;
        return isbn.equals(ksiazka.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                ", tytul='" + tytul + '\'' +
                ", rok='" + rok + '\'' +
                '}';
    }
}
