package zadanko1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Book> library = new ArrayList<>();
        initializeLibrary(library);

        // 1. Wykorzystujac zrodlo, ktorym jest biblioteka (library ArrayList) wypisz tytuly ksiazek, ktore sa jednowyrazowe.
        library.stream()
               .map(Book::getTitle)
               .filter(title -> !title.contains(" "))
               .forEach(System.out::println);

        // 2. Wykorzystujac zroldo, ktorym jest biblioteka (library ArrayList) zapisz nazwiska autorow, ktorzy maja wiecej niz 50 lat do nowej listy.
        List<String> authors = library.stream()
                                      .map(Book::getAuthor)
                                      .filter(author -> author.getAge() > 50)
                                      .map(Author::getSurname)
                                      .map(String::toUpperCase)
                                      .distinct()
                                      .collect(Collectors.toList());
        System.out.println(authors);
        // 3. Wykorzystujac zrodlo, ktorym jest biblioteka (library ArrayList) zwroc sume wieku wszystkich autorow.
        int authorsAge = library.stream()
                                .map(Book::getAuthor)
                                .map(Author::getAge)
                                .reduce(0, Integer::sum);
        System.out.println("Suma lat: " + authorsAge);
    }

    private static void initializeLibrary(List<Book> library) {
        Author jAnderman = new Author("Janusz", "Anderman", 70);
        Author zKadlubek = new Author("Zbigniew", "Kadlubek", 49);
        Author jGrzedowicz = new Author("Jaroslaw", "Grzedowicz", 54);
        Author aKajtochowa = new Author("Anna", "Kajtochowa", 83);
        Book book1 = new Book("Pan Lodowego Ogrodu", jGrzedowicz);
        Book book2 = new Book("Azyl", jGrzedowicz);
        Book book3 = new Book("Tymczasem ", jAnderman);
        Book book4 = new Book("Fotografie", jAnderman);
        Book book5 = new Book("Listy z Rzymu", zKadlubek);
        Book book6 = new Book("Ajschylos", zKadlubek);
        Book book7 = new Book("Uroda tarniny", aKajtochowa);
        Book book8 = new Book("Ogród ostow", aKajtochowa);

        library.addAll(Arrays.asList(book1, book2, book3, book4, book5, book5, book6, book7, book8));
    }
}
