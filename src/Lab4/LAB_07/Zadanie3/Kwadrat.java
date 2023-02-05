package Lab4.LAB_07.Zadanie3;

class Kwadrat extends Prostokat implements Figury {
    Kwadrat(int bok, String kolor) {
        super(bok, bok, kolor);
    }

    @Override
    public String opis() {
        return "Kwadrat o wymiarach: " + szer + " x " + wys;
    }
}