package zadanko4;

import java.util.HashSet;
import java.util.Set;

/**
 * @author krzysztof.kramarz
 */
public class Person {
    private String name;
    private Long id;
    private Set<String> zdobyteSzczyty = new HashSet<>();

    public Person(String name, Long id) {
        this.name = name;
        this.id = id;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", zdobyteSzczyty=" + zdobyteSzczyty +
                '}';
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public Set<String> getZdobyteSzczyty() {
        return zdobyteSzczyty;
    }

    public void setSzczyt(String szczyt) {

        if(zdobyteSzczyty == null) {
            zdobyteSzczyty = new HashSet<>();
        }
        zdobyteSzczyty.add(szczyt);
    }
}