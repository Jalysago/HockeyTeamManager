import java.util.Scanner;
public class Person {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }


    public int getJerseyNumber() {
        return -1;
    }

}
