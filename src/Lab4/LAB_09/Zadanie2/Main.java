package Lab4.LAB_09.Zadanie2;

import Lab4.LAB_09.Zadanie1.Participant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Participant(1, "John", 20),
                new Participant(2, "Mike", 12),
                new Participant(3, "Ann", 24),
                new Participant(4, "Duke", 16),
                new Participant(5, "Caroline", 21)
        };

        List<Participant> participantList = new ArrayList<>(Arrays.asList(participants));
        List<Participant> subList = participantList.subList(2, 3);

        participantList.removeAll(subList);

        participantList.forEach(System.out::println);
    }
}
