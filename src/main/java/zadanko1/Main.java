package zadanko1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Book> library = new ArrayList<>();
        initializeLibrary(library);

        // 1. Wykorzystujac zrodlo, ktorym jest biblioteka (library ArrayList) wypisz tytuly ksiazek, ktore sa jednowyrazowe.


        // 2. Wykorzystujac zroldo, ktorym jest biblioteka (library ArrayList) zapisz nazwiska autorow, ktorzy maja wiecej niz 50 lat do nowej listy. Nazwiska nie powinny sie powielac.

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
