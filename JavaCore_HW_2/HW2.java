package Lesson2;

public class HW2 {
    public static void main(String[] args) {
        String[][] array1 = {{"4", "*", "4", "4"}, {"4", "4", "4", "4"}, {"4", "4", "4", "4"}, {"4", "4", "4", "4"}};
        System.out.println("Size of array is " + array1.length + "x" + array1[0].length);
        System.out.println("Sum = " + convertingInt(array1)); // преобразование и вывод на экран суммы


    }


    public static int convertingInt(String[][] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray.length != 4 || stringArray[i].length != 4)
                throw new MyArraySizeException("Array isn't 4x4!");
        }
        int[][] intArray = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (isDigit(stringArray[i][j]))
                intArray[i][j] = Integer.parseInt(stringArray[i][j]);
                else {
                    intArray[i][j] = 0;
                    System.out.println("Ячейка " + i + "x" + j + " содержит не число" );}
            }
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               sum += intArray[i][j];
            }
        }
        return sum;
    }

    public static void printArray(int[][] intArray) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(intArray[i][j]);
            } System.out.println("");
        }
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
