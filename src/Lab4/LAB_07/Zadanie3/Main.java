package Lab4.LAB_07.Zadanie3;

class Main {
    public static void main(String[] arg) {
        Prostokat prostokat = new Prostokat(3, 6, "czerwony");
        Trojkat trojakt = new Trojkat(7, 4, "bialy");
        Kwadrat kwadrat = new Kwadrat(2, "czarny");
        Punkt punkt = new Punkt(2, 3);

        System.out.println(trojakt.opis());
        System.out.println("Kolor prostokata: " + prostokat.getKolor());


        Figura[] tablicaFigur = new Figura[10];
        for (int i = 0; i < tablicaFigur.length; i++) {
            if (i % 3 == 0)
                tablicaFigur[i] = prostokat;
            else if (i % 3 == 1)
                tablicaFigur[i] = kwadrat;
            else
                tablicaFigur[i] = trojakt;
        }
        for (Figura figura : tablicaFigur) {
            System.out.println(figura.opis());
        }

        Figury[] figury = new Figury[6];
        for (int i = 0; i < figury.length; i++) {
            if (i % 3 == 0)
                figury[i] = prostokat;
            else if (i % 3 == 1)
                figury[i] = kwadrat;
            else
                figury[i] = trojakt;
        }
        for (Figury figura : figury) {
            System.out.println(figura.getPowierzchnia());
            System.out.println(figura.wPolu(new Punkt(0,0)));
        }


        Okrag okrag = new Okrag(punkt, 4.0);
        okrag.przesun(2,2);
        System.out.println("Srodek okregu po przesunieciu: [" + okrag.punkt.x +", " + okrag.punkt.y + "]");
    }
}