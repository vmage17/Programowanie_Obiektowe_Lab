package Lab4.LAB_08.Zadanie3;

public class Main {
    public static void main(String[] args) throws NieprawidlowyAdresException {
        try {
            Adres adres = new Adres("Warszawska", 1, "", "");
        } catch (NieprawidlowyAdresException e) {
            System.out.println("Blad adresu: " + e.getMessage());
        }
    }
}
