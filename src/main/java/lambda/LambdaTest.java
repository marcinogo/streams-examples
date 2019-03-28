package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Marcin Ogorzalek
 */
public class LambdaTest {
    public static void main(String[] args) {
        BetterString bS1 = (s1, s2) -> s1.length() >= s2.length()? s1 : s2;
        BetterString bS2 = (s1, s2) -> s1.length() < s2.length()? s1 : s2;
        BetterString bS3 = (s1, s2) -> s1.split("\\s+").length >= s2.split("\\s+").length? s1 : s2;
        BetterString bS4 = (s1, s2) -> s1.compareTo(s2) < 0? s1 : s2;

        System.out.println(bS1.checkBetterString("Ona testujemy Tomka test", "Ola jest fajna !"));
        System.out.println(bS2.checkBetterString("Ona testujemy Tomka test", "Ola jest fajna !"));
        System.out.println(bS3.checkBetterString("Ona testujemy Tomka test", "Ola jest fajna !"));
        System.out.println(bS4.checkBetterString("Ona testujemy Tomka test", "Ola jest fajna !"));

        Detective d1 = (s) -> s.getAge() > 18;
        Detective d2 = (s) -> s.getSex().equalsIgnoreCase("women");
        Detective d3 = (s) -> s.getName().startsWith("A");

        System.out.println(d1.checkStudent(new Student("Wojtek", "male", 12)));
        System.out.println(d1.checkStudent(new Student("Marcin", "male", 27)));
        System.out.println(d2.checkStudent(new Student("Karolina", "women", 18)));
        System.out.println(d2.checkStudent(new Student("Marcin", "male", 27)));
        System.out.println(d3.checkStudent(new Student("Agnieszka", "women", 24)));
        System.out.println(d3.checkStudent(new Student("Marcin", "male", 27)));

        List<Student> students = new ArrayList<>();
        students.add(new Student("Wojtek", "male", 12, "Makieła"));
        students.add(new Student("Marcin", "male", 27, "Grzegorczyk"));
        students.add(new Student("Karolina", "women", 18, "Zbych"));
        students.add(new Student("Marcin", "male", 27, "Borek"));
        students.add(new Student("Agnieszka", "women", 24, "Testonwa"));
        students.add(new Student("Marcin", "male", 27, "Ogorzałek"));
        students.add(new Student("Ciamil", "male", 27, "Test"));

        Consumer<List<Student>> c1 = (lts) -> {
            for (Student s: lts) {
                System.out.println(s);
            }
        };

        Consumer<List<Student>> c2 = (lts) -> {
            for (Student s: lts) {
                if(s.getName().startsWith("C")) System.out.println(s);
            }
        };

        Consumer<List<Student>> c3 = (lts) -> {
            for (Student s: lts) {
                if(s.getAge() > 20) System.out.println(s);
            }
        };
// TODO comparator
//        Consumer<List<Student>> c4 = (lts) -> {
//            Collections.sort(lts, Comparator::compare);
//        };

        c1.accept(students);
        c2.accept(students);
        c3.accept(students);
//        c4.accept(students);
    }
}
