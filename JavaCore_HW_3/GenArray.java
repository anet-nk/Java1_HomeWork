package Lesson3;

import Lesson2.MyArraySizeException;

import java.sql.SQLOutput;

public class GenArray<T> {
    private T[] array;

    public GenArray(T... array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public void showArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public T[] swapArrayElements(int firstElement, int secondElement) {
        if (firstElement > array.length || secondElement > array.length)
            throw new MyArraySizeException("Elements outside the array");
        T element1 = array[firstElement - 1];
        array[firstElement - 1] = array[secondElement - 1];
        array[secondElement - 1] = element1;
        return array;
    }

/* методы по выводу в консоль для удобства самопроверки, если вам мешают, скажите, в следующий раз буду их удалять перед отправкой на проверку*/
    public static void main(String[] args) {
    GenArray<String> arrayString = new GenArray("String1", "String2", "String3", "String4");
        arrayString.showArray();
        System.out.println("===============");
    arrayString.swapArrayElements(2, 4);
        arrayString.showArray();
    }

}
