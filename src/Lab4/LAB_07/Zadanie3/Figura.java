package Lab4.LAB_07.Zadanie3;

abstract class Figura {
    Punkt punkt;
    String kolor = "bialy";

    Figura() {
        punkt = new Punkt(0, 0);
    }

    Figura(String kolor) {
        this.kolor = kolor;
    }

    Figura(Punkt punkt) {
        this.punkt = punkt;
    }

    String getKolor() {
        return kolor;
    }

    abstract String opis();

    abstract void skaluj(float skala);
}
