package Lab3.LAB_06.Zadanie3;

public class Podrecznik extends Ksiazka {
    private final String przedmiot;

    public Podrecznik(String isbn, String tytul, String autor, int rok, int ilosc, String przedmiot) {
        super(isbn, tytul, autor, rok, ilosc);
        this.przedmiot = przedmiot;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    @Override
    public String toString() {
        return "Podrecznik{" +
                "isbn='" + getIsbn() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", tytul='" + getTytul() + '\'' +
                ", rok='" + getRok() + '\'' +
                ", przedmiot='" + przedmiot + '\'' +
                '}';
    }
}
