package Lesson06;

public class Dog extends Animal {
    public static int createdDog = 0;

    Dog(String name) {
        super("Dog", name, 500, 10);
        ++createdDog;
    }
}
