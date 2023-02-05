package Lab4.LAB_08.Zadanie3;

public class Adres {
    private String ulica;
    private int numerDomu;
    private String kodPocztowy;
    private String miasto;

    public Adres(String ulica, int numerDomu, String kodPocztowy, String miasto) throws NieprawidlowyAdresException {
        StringBuilder stringBuilder = new StringBuilder();

        if (ulica.isBlank()) {
            stringBuilder.append("Ulica nie moze byc pusta! ");
        }
        if (numerDomu <= 0) {
            stringBuilder.append("Numer domu nie moze byc mniejszy od 1! ");
        }
        if (kodPocztowy.isBlank()) {
            stringBuilder.append("Kod pocztowy nie moze byc pusty! ");
        }
        if (miasto.isBlank()) {
            stringBuilder.append("Miasto nie moze byc puste!");
        }

        if (!stringBuilder.isEmpty()) {
            throw new NieprawidlowyAdresException(stringBuilder.toString());
        }

        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "ulica='" + ulica + '\'' +
                ", numerDomu=" + numerDomu +
                ", kodPocztowy='" + kodPocztowy + '\'' +
                ", miasto='" + miasto + '\'' +
                '}';
    }
}