package Lab3.LAB_05;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Rectangle rectangle1 = new Rectangle(2.5, 3.5);
        Rectangle rectangle2 = new Rectangle(5.5, 7.5);

        System.out.println(rectangle1);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Circumference: " + rectangle1.getCircumference());

        System.out.println(rectangle2);
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Circumference: " + rectangle2.getCircumference());

        System.out.println("==================");

        Building bloc = new Building("Bloc", LocalDate.of(1991,1,15), 4);
        Building house = new Building("House", LocalDate.of(2015,6,10), 1);
        System.out.println(bloc);
        System.out.println("Block age in years: " + bloc.getBuildingAge());
        System.out.println(house);
        System.out.println("House age in years: " + house.getBuildingAge());

        System.out.println("==================");

        Species species = new Species("Ssaki", "Orzel przedni", 10, 4, "Gatunek zagrozony wyginieciem!");
        System.out.println(species);
        System.out.println("Liczba chromosomow N: " + species.getNumberOfChromosomesN());
        Species clone = species.clone();
        System.out.println(clone);
    }
}