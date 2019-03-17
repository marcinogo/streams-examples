package zadanko1;

public class Author {


    private String name;
    private String surname;
    private int age;

    Author(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    int getAge() {
        return age;
    }
}
