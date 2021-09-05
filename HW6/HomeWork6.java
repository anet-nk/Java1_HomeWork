package Lesson06;

import java.sql.SQLOutput;

public class HomeWork6 {

    public static void main(String[] args) {
        Cat mary = new Cat("Mary");
        Dog ray = new Dog("Ray");
        int swimDistance = 15;
        int runDistance = 600;


        System.out.println(mary.fullAnimalInfo() + mary.swimDistance(swimDistance) + mary.runDistance(runDistance));
        System.out.println(ray.fullAnimalInfo() + ray.swimDistance(swimDistance) + ray.runDistance(runDistance));
        System.out.println("Was created " + Animal.createdAnimals + " animals, " + Cat.createdCat + " cat(s) and " + Dog.createdDog + " dog(s). ");

    }
}
