/**
 * Создайте массив из 8 случайных чисел из отрезка [1; 10]. Выведите массив на экран в строку.
 * Замените каждый элемент с нечетным индексом на 0. Снова выведите массив на экран на отдельной строке.
 */
package tasks;

public class AddZeroToOddIndex {

    private static final int SIZE = 8;

    public static void main(String[] args) {

        int[] randomNumbers = new int[SIZE];

        fillArrayByRandomNumbers(randomNumbers);
        print(randomNumbers);
        System.out.println("");
        replaceElementsWithOddIndexes(randomNumbers);
        print(randomNumbers);
    }

    public static void fillArrayByRandomNumbers(int[] array) {  // метод заполняет массив случайными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
        }
    }

    public static void replaceElementsWithOddIndexes(int[] array) {  // метод находит элементы с нечетным индексом
        for (int i = 0; i < array.length; i++) {                      // и меняет значения на 0
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
    }

    public static void print(int[] array) {  // метод выводит массив
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

