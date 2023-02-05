package Lab4.LAB_07.Zadanie3;

public class Okrag extends Figura implements RuchFigury {
    private double promien;

    public Okrag(Punkt punkt, double promien) {
        super(punkt);
        this.promien = promien;
    }

    @Override
    String opis() {
        return "Okrag o promieniu: " + promien + " i srodku w punkcie: " + punkt;
    }

    @Override
    void skaluj(float skala) {
        this.promien *= promien;
    }

    @Override
    public void przesun(int x, int y) {
        punkt.x += x;
        punkt.y += y;
    }
}
