package lambda;

/**
 * @author Marcin Ogorzalek
 */
public class Student {
    private String name;
    private String sex;
    private int age;
    private String lastName;

    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Student(String name, String sex, int age, String lastName) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
