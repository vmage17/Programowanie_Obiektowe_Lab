package Lab3.LAB_06.Zadanie1;

class Prostokat extends Figura {
    double wys = 0, szer = 0;

    Prostokat(double wys, double szer) {
        this.wys = wys;
        this.szer = szer;
    }

    Prostokat(String kolor, double wys, double szer) {
        super(kolor);
        this.wys = wys;
        this.szer = szer;
    }

    double getPowierzchnia() {
        return (szer * wys);
    }

    void przesun(double x, double y) {
        punkt.x += x;
        punkt.y += y;
    }

    @Override
    String opis() {
        return "Klasa Prostokat. Kolor obiektu: " + kolor;
    }
}