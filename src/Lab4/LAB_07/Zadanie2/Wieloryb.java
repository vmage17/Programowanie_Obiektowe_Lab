package Lab4.LAB_07.Zadanie2;

public class Wieloryb extends Ryba{
    @Override
    public void plyn() {
        System.out.println("Wieloryb plynie...");
    }

    @Override
    public void wynurz() {
        System.out.println("Wieloryb wynurza sie...");
    }

    @Override
    public void zanurz() {
        System.out.println("Wieloryb zanurza sie...");
    }

    @Override
    public void jedz() {
        System.out.println("Wieloryb je...");
    }

    @Override
    public void wydalaj() {
        System.out.println("Wieloryb wydala...");
    }
}
