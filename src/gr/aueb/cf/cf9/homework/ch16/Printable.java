package gr.aueb.cf.cf9.homework.ch16;

public interface Printable {
    default void print() {
        System.out.println("Default printing...");
    }
}
