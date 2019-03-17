package zadanko4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author krzysztof.kramarz
 */
class Main
{

   static Function<String, String> mapowanie = nazwisko -> nazwisko.toUpperCase();

   public static void main(String[] args)
   {

      List<Person> people = new ArrayList<>();
     createPersonLit(people);

//Wyświetl wszystkie szczyty jako Set<String>

      List<Set<String>> szczyty = people.stream()
            .map(Person::getZdobyteSzczyty)
            .collect(Collectors.toList());

      szczyty.forEach(System.out::println);

     //wyświetl wszystkie zdobyte szczyty wszystkich osób jako płaską, posortowaną listę
      System.out.println("\nflatMap");

      List<String> szczytyFlatMap = people.stream()
            .map(Person::getZdobyteSzczyty)
            .flatMap(Collection::stream)
            .sorted()
            .collect(Collectors.toList());

      szczytyFlatMap.forEach(System.out::println);

   }

   private static void createPersonLit(List<Person> people)
   {

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
