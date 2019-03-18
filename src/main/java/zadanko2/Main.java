package zadanko2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File file = new File("strumyki.txt");
        List<String> listOfWords = new LinkedList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                listOfWords.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // 1. Wykorzystujac liste slow z pliku (listOfWords LinkedList) wypisz wyrazy, ktore zaczyaja sie na litere A
        System.out.println("ZADANIE 1: ");
        listOfWords.stream()
                   .filter(s -> s.startsWith("A"))
                   .forEach(System.out::println);

        System.out.println("\nZADANIE 2: ");
        // 2. Wykorzystujac liste slow z pliku (listOfWords LinkedList) wypisz najdluzsze slowo, ktore ma w sobie ciag znakow "ONA"
        listOfWords.stream()
                   .sorted((x, y) -> y.length() - x.length())
                   .filter(s -> s.contains("ONA"))
                   .limit(1)
                   .forEach(System.out::println);
        System.out.println("\nZADANIE 3: ");
        // 3. Wykorzystujac liste slow z pliku (listOfWords LinkedList) znajdz 15 pierwszych slow o dlugosci 3 znaki i wiecej
        listOfWords.stream()
                   .filter(s -> s.length() >= 3)
                   .limit(15)
                   .forEach(System.out::println);

    }


}
