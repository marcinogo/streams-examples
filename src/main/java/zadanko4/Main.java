package zadanko4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author krzysztof.kramarz
 */
class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        createPersonLit(people);

        //Wyświetl elementy kolekcji zawierajace szczyty bez uzywania flatMap i sprobuj postortowac. Co zaobserwujesz?
        people.forEach(person -> person.getZdobyteSzczyty().stream().sorted().forEach(System.out::println));

        //wyświetl wszystkie zdobyte szczyty wszystkich osób jako płaską, posortowaną listę (flatMap) i zaobserwuj roznice w wyniku
        people.stream()
                .map(Person::getZdobyteSzczyty)
                .flatMap(Collection::stream)
                .sorted()
                .forEach(System.out::println);
    }

    private static void createPersonLit(List<Person> people) {

        Person tadek = new Person("Tadek", 1L);
        tadek.setSzczyt("Giewont");
        tadek.setSzczyt("Krupówki");
        tadek.setSzczyt("Gubałówka");
        Person marek = new Person("Marek", 2L);
        marek.setSzczyt("Luboń");
        marek.setSzczyt("Turbacz");
        Person ania = new Person("Ania", 3L);
        ania.setSzczyt("Śnieżnica");
        ania.setSzczyt("Ćwilin");
        ania.setSzczyt("Smrek");
        Person tosia = new Person("Tosia", 4L);
        tosia.setSzczyt("Szczyt wszystkiego");

        people.add(tadek);
        people.add(marek);
        people.add(ania);
        people.add(tosia);

    }
}