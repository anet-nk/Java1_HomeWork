package Lesson06;

public class Cat extends Animal{
    public static int createdCat = 0;

    Cat(String name) {
        super("Cat", name, 200, 0);
        ++createdCat;
    }

}
