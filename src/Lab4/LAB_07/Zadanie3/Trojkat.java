package Lab4.LAB_07.Zadanie3;

class Trojkat extends Figura implements Figury {
    int wys = 0;
    int podst = 0;

    Trojkat(int wys, int podst, String kolor) {
        this.wys = wys;
        this.podst = podst;
        super.kolor = kolor;
    }

    public String opis() {
        return "Trojkat o wymiarach: " + wys + "  " + podst;
    }

    @Override
    void skaluj(float skala) {
        this.wys *= skala;
        this.podst *= skala;
    }

    @Override
    public float getPowierzchnia() {
        return (float) (wys * podst / 2.0);
    }

    @Override
    public boolean wPolu(Punkt p) {
        return false;
    }
}