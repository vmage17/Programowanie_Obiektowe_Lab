package Lab3.LAB_06.Zadanie1;

public class Okrag extends Figura {
    private Punkt punktSrodkowy;
    private double promien;

    public Okrag() {
        this.punktSrodkowy = new Punkt(0.0,0.0);
        this.promien = 0.0;
    }

    public Okrag(Punkt punktSrodkowy, double promien) {
        this.punktSrodkowy = punktSrodkowy;
        this.promien = promien;
    }

    public double getPowierzchnia() {
        return Math.PI * Math.pow(promien, 2d);
    }

    public double getSrednica() {
        return promien * 2;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double p) {
        this.promien = p;
    }

    public void wSrodku(Punkt punkt) {
        double powerOfRadius = Math.pow(promien, 2d);
        double equation = Math.pow(punktSrodkowy.x - punkt.x, 2d) + Math.pow(punktSrodkowy.y - punkt.y, 2d);
        if (equation <= powerOfRadius) {
            System.out.println("Punkt (" + punkt.x + ", " + punkt.y + ") znajduje sie w srodku okregu");
        } else {
            System.out.println("Punkt (" + punkt.x + ", " + punkt.y + ") lezy poza okregiem");
        }
    }

    @Override
    String opis() {
        return "Klasa Okrag. Kolor obiektu: " + kolor;
    }
}
