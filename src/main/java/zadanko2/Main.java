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

        // 2. Wykorzystujac liste slow z pliku (listOfWords LinkedList) wypisz najdluzsze slowo, ktore ma w sobie ciag znakow "ONA"

        // 3. Wykorzystujac liste slow z pliku (listOfWords LinkedList) znajdz 15 pierwszych slow o dlugosci 3 znaki i wiecej

    }


}
