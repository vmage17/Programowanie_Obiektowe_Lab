package Lab4.LAB_09.Zadanie1;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Participant> participants = List.of(
                new Participant(1, "John", 20),
                new Participant(2, "Mike", 12),
                new Participant(3, "Ann", 24),
                new Participant(4, "Duke", 16),
                new Participant(5, "Caroline", 21)
        );

        List<Participant> participantsUnderage = filterUnderageParticipants(participants);
        participantsUnderage.forEach(System.out::println);
    }

    private static List<Participant> filterUnderageParticipants(List<Participant> participants) {
        return participants.stream()
                .filter(participant -> participant.getAge() < 18)
                .collect(Collectors.toList());
    }
}
