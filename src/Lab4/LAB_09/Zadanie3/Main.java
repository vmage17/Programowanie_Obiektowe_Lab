package Lab4.LAB_09.Zadanie3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> listOne = List.of(
                1, 2, 3, 4, 5, 6, 7, 8, 9
        );
        List<Object> listTwo = new ArrayList<>();

        ListIterator<Integer> iterator = listOne.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        while (iterator.hasPrevious()) {
            Integer previous = iterator.previous();
            listTwo.add(previous);
        }

        listTwo.forEach(System.out::println);
    }
}
