package Lab3.LAB_05;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Building {
    private String name;
    private LocalDate yearOfConstruction;
    private int floors;

    public Building(String name, LocalDate yearOfConstruction, int floors) {
        this.name = name;
        this.yearOfConstruction = yearOfConstruction;
        this.floors = floors;
    }

    public long getBuildingAge() {
        return ChronoUnit.YEARS.between(yearOfConstruction, LocalDate.now());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(LocalDate yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return yearOfConstruction == building.yearOfConstruction && floors == building.floors && Objects.equals(name, building.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfConstruction, floors);
    }

    @Override
    public String toString() {
        return "Building{" +
                "name='" + name + '\'' +
                ", yearOfConstruction=" + yearOfConstruction.getYear() +
                ", floors=" + floors +
                '}';
    }
}
