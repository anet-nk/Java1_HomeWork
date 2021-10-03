package Lesson3;

import java.util.ArrayList;

public class Box<E extends Fruit> {
    private ArrayList<E> box;

    public Box(ArrayList<E> box) {
        this.box = box;
    }

    public ArrayList<E> getBox() {
        return box;
    }

    public ArrayList<E> fillBoxFruit(E fruit, int fruitNumber) {
        for (int i = 0; i < fruitNumber; i++) {
        box.add(fruit);
        }
        return box;
    }

    public float getWeight() {
        if (box.size() == 0) {
        return 0;
        }
        return box.size() * box.get(0).getWeight();
    }

    public boolean compare(Box<?> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.00001;
    }

    public ArrayList<E> pourIntoBox(Box<E> box) {
        this.box.addAll(box.getBox());
        return this.box;
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        Box<Apple> boxApple1 = new Box(new ArrayList());
        Box<Apple> boxApple2 = new Box(new ArrayList());
        Box<Orange> boxOrange3 = new Box(new ArrayList());

        boxApple1.fillBoxFruit(apple, 6);
        boxApple2.fillBoxFruit(apple, 5);
        boxOrange3.fillBoxFruit(orange, 4);

        System.out.println(boxApple1.box); //проверяем, правильно ли работает метод заполнения коробки яблоками
        System.out.println(boxOrange3.box); //проверяем, правильно ли работает метод заполнения коробки апельсинами

        System.out.println(boxApple1.getWeight()); //смотрим вес коробки
        System.out.println(boxApple2.getWeight()); //смотрим вес коробки
        System.out.println(boxOrange3.getWeight()); //смотрим вес коробки

        System.out.println(boxApple1.compare(boxApple2)); //сравниваем вес коробок с яблоками
        System.out.println(boxApple1.compare(boxOrange3)); //сравниваем вес коробки с яблоками и коробки с апельсинами
        System.out.println(boxApple1.pourIntoBox(boxApple2)); //пересыпаем яблоки из коробки 2 в коробку 1 и проверяем что получилось
    }
}
