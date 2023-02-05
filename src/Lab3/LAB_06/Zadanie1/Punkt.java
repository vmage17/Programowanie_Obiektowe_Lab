package Lab3.LAB_06.Zadanie1;

public class Punkt {
    public double x;
    public double y;

    public Punkt() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void zeruj() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public void opis() {
        System.out.println("Punkt: x=" + x + ", y=" + y);
    }

    public void przesun(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
