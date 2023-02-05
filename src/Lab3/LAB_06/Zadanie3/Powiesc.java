package Lab3.LAB_06.Zadanie3;

public class Powiesc extends Ksiazka {
    private final String gatunek;

    public Powiesc(String isbn, String tytul, String autor, int rok, int ilosc, String gatunek) {
        super(isbn, tytul, autor, rok, ilosc);
        this.gatunek = gatunek;
    }

    public String getGatunek() {
        return gatunek;
    }

    @Override
    public String toString() {
        return "Powiesc{" +
                "isbn='" + getIsbn() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", tytul='" + getTytul() + '\'' +
                ", rok='" + getRok() + '\'' +
                ", gatunek='" + gatunek + '\'' +
                '}';
    }
}
