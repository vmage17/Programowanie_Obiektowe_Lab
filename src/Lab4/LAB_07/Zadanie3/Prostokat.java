package Lab4.LAB_07.Zadanie3;

class Prostokat extends Figura implements Figury {
    int wys = 0;
    int szer = 0;

    Prostokat(int wys, int szer, String kolor) {
        this.wys = wys;
        this.szer = szer;
        super.kolor = kolor;
    }

    public String opis() {
        return "Prostokat o wymiarach: " + szer + " x " + wys;
    }

    @Override
    void skaluj(float skala) {
        this.wys *= skala;
        this.szer *= skala;
    }

    @Override
    public float getPowierzchnia() {
        return szer * wys;
    }

    @Override
    public boolean wPolu(Punkt p) {
        return false;
    }
}