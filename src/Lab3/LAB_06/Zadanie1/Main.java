package Lab3.LAB_06.Zadanie1;

public class Main {
    public static void main(String[] args) {
        Punkt punkt1 = new Punkt(2.0, 3.0);
        Punkt punkt2 = new Punkt(5.0, 2.0);
        Punkt punkt3 = new Punkt(1.0, 1.0);

        punkt1.opis();
        punkt1.przesun(3, 2);
        punkt1.opis();
        punkt1.zeruj();
        punkt1.opis();

        Figura figura = new Figura();
        Prostokat prostokat = new Prostokat(2.0, 7.0);
        Trojkat trojkat = new Trojkat(5.0, 3.0);
        System.out.println("Kolor figury: " + figura.kolor + ", punkt poczatkowy: " + figura.punkt);
        System.out.println("Pole prostokata: " + prostokat.getPowierzchnia());
        System.out.println("Wysokosc trojkata: " + trojkat.wys + ", podstawa trojkata: " + trojkat.podst);

        Okrag okrag = new Okrag(new Punkt(0.0, 0.0), 2.0);
        okrag.wSrodku(new Punkt(0.0, 0.0));
        okrag.wSrodku(new Punkt(3.0, 3.0));

        prostokat.przesun(3.0, 5.0);
        System.out.println(prostokat.punkt.x + " " + prostokat.punkt.y);

        Kwadrat kwadrat = new Kwadrat("czarny", 5.0);
        System.out.println(prostokat.opis());
        System.out.println(trojkat.opis());
        System.out.println(okrag.opis());
        System.out.println(kwadrat.opis());
    }
}
