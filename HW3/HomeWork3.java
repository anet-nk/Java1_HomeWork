package Lesson03;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class HomeWork3 {
    public static Random random = new Random();

    public static void main (String[] args) {
// 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;
        System.out.println("Task 1:");
        int[] task1 = new int[7];
        fillRandomArray(task1, 2);
        System.out.println(Arrays.toString(task1));
        changeArray(task1);
        System.out.println(Arrays.toString(task1));
//2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        System.out.println("Task 2:");
        int[] task2 = new int[100];
        fillArray(task2);
        System.out.println(Arrays.toString(task2));


//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        System.out.println("Task 3:");
        int[] task3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(task3));
        doublingMin(task3, 6);
        System.out.println(Arrays.toString(task3));

//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
// если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
// индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        System.out.println("Task 4:");
        int size = 6;
        int[][] task4 = new int[size][size];
        diagonal(task4);
        readArray(task4);

//5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len,
// каждая ячейка которого равна initialValue;
        System.out.println("Task 5:");
        int[] task5Array = task5(7, 90);
        System.out.println(Arrays.toString(task5Array));

//6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы;
        System.out.println("Task 6:");
        int[] task6 = new int[10];
        fillRandomArray(task6, 10);
        System.out.println(Arrays.toString(task6));
        System.out.println("Max element = " + maxElement(task6));
        System.out.println("Min element = " + minElement(task6));




    }



// ДОП МЕТОДЫ
// 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void fillRandomArray(int[] inArray, int limit) {
        for (int i = 0; i < inArray.length; i++) {
            inArray[i] = random.nextInt(limit);
        }
    }

    public static void changeArray (int[] inArray) {
        for (int i = 0; i < inArray.length; i++) {
            if (inArray[i] == 0) {
                inArray[i] = 1;
            }
            else inArray[i] = 0;
        }
    }

    //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void fillArray (int[] inArray) {
        for (int i = 0; i < inArray.length; i++) {
            inArray[i] = i + 1;
        }
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void doublingMin (int[] inArray, int min) {
        for (int i = 0; i < inArray.length; i++) {
            if (inArray[i] < min) {
                inArray[i] = inArray[i] * 2;
            }
        }
    }

    public static void readArray(int[][] inArray) {
        for (int i = 0; i < inArray.length; i++) {
            for (int j = 0; j < inArray[i].length; j++) {
                System.out.print(inArray[i][j] + " ");
            }
            System.out.println();
        }
    }

//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
// если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
// индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

    public static void diagonal(int[][] inArray) {
        for (int i = 0; i < inArray.length; i++) {
            inArray[i][i] = 1;
            inArray[i][inArray.length - 1 - i] = 1;
        }
        }

//5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len,
// каждая ячейка которого равна initialValue;
    public static int[] task5(int len, int initialValue) {
        int[] task5Array = new int[len];
        for (int i = 0; i < task5Array.length; i++) {
            task5Array[i] = initialValue;
        }
        return task5Array;
    }

//6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы;
    public static int maxElement(int[] inArray) {
        int max = inArray[0];
        for (int i = 0; i < inArray.length; i++) {
            if (inArray[i] > max) {
                max = inArray[i];
            }
        }
        return max;
    }
    public static int minElement(int[] inArray) {
        int min = inArray[0];
        for (int i = 0; i < inArray.length; i++) {
            if (inArray[i] < min) {
                min = inArray[i];
            }
        }
        return min;
    }

}
