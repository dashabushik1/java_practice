/**
 * Создайте массив из 4 случайных целых чисел из отрезка [10; 99]. Выведите его на экран в строку.
 * Далее определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.
 */
package tasks;

public class StrictlyIncreasingSequence {

    private static final int SIZE = 4;
    private static final int SEQUENCE_MAX = 90;

    public static void main(String[] args) {

        int[] randomNumbers = new int[SIZE];

        fillArrayOfRandomNumbers(randomNumbers);
        print(randomNumbers);
        checkSequence(randomNumbers);
    }

    public static void fillArrayOfRandomNumbers(int[] array) {  // метод заполняет массив случайными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * SEQUENCE_MAX) + 10);
        }
    }

    public static void print(int[] array) {  // метод выводит массив в строку
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static void checkSequence(int[] array) {  // метод проверяет числа и выводит сообщения
        boolean isIncreasingSequence = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                isIncreasingSequence = false;
                break;
            }
        }
        if (isIncreasingSequence) {
            System.out.println("The array is a strictly increasing sequence.");
        } else {
            System.out.println("The array is not a strictly increasing sequence.");
        }
    }
}

