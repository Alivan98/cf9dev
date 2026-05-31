package gr.aueb.cf.cf9.homework.ch14;

public class Animal {
    protected String name;
    protected int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("I am an animal");
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + "}";
    }
}
