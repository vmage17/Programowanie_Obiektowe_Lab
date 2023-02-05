package Lab3.LAB_06.Zadanie1;

public class Kwadrat extends Prostokat {
    Kwadrat(double bok) {
        super(bok, bok);
    }

    public Kwadrat(String kolor, double bok) {
        super(kolor, bok, bok);
    }

    @Override
    String opis() {
        return "Klasa Kwadrat. Kolor obiektu: " + kolor;
    }
}
