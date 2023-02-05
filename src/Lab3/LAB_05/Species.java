package Lab3.LAB_05;

import java.util.Objects;

public class Species implements Cloneable {
    private String type;
    private String name;
    private int numberOfChromosomes2N;
    private int numberOfChromosomesX;
    private String description;

    public Species(String type, String name, int numberOfChromosomes2N, int numberOfChromosomesX, String description) {
        this.type = type;
        this.name = name;
        this.numberOfChromosomes2N = numberOfChromosomes2N;
        this.numberOfChromosomesX = numberOfChromosomesX;
        this.description = description;
    }

    public String getFullName() {
        return type + " " + name;
    }

    public int getNumberOfChromosomesN() {
        return numberOfChromosomes2N / 2;
    }

    public Species clone() throws CloneNotSupportedException {
        return (Species) super.clone();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfChromosomes2N() {
        return numberOfChromosomes2N;
    }

    public void setNumberOfChromosomes2N(int numberOfChromosomes2N) {
        this.numberOfChromosomes2N = numberOfChromosomes2N;
    }

    public int getNumberOfChromosomesX() {
        return numberOfChromosomesX;
    }

    public void setNumberOfChromosomesX(int numberOfChromosomesX) {
        this.numberOfChromosomesX = numberOfChromosomesX;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Species species = (Species) o;
        return numberOfChromosomes2N == species.numberOfChromosomes2N && numberOfChromosomesX == species.numberOfChromosomesX && Objects.equals(type, species.type) && Objects.equals(name, species.name) && Objects.equals(description, species.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, numberOfChromosomes2N, numberOfChromosomesX, description);
    }

    @Override
    public String toString() {
        return "Species{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", numberOfChromosomes2N=" + numberOfChromosomes2N +
                ", numberOfChromosomesX=" + numberOfChromosomesX +
                ", description='" + description + '\'' +
                '}';
    }
}
