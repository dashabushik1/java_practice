/**
 * Создайте массив из 12 случайных чисел из отрезка [-15; 15].
 * Определите, какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
 */
package tasks;

public class TwelveRandomNumbers {

    private static final int SIZE = 12;

    public static void main(String[] args) {

        int[] randomNumbers = new int[SIZE];

        fillArrayOfRandomNumbers(randomNumbers);
        print(randomNumbers);
        findIndex(randomNumbers);
    }

    public static void fillArrayOfRandomNumbers(int[] array) { // метод заполняет массив случайными числами
        for (int i = 0; i < array.length; i++) {
            int number = (int) (Math.random() * 15);
            int mark = Math.random() > 0.5 ? 1 : -1;
            array[i] = number * mark;
        }
    }

    public static void print(int[] array) { // метод выводит массив
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void findIndex(int[] array) { // метод ищет и выводит индекс максимального элемента в массиве
        int maxElementIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= array[maxElementIndex]) {
                maxElementIndex = i;
            }
        }
        System.out.println("");
        System.out.println(maxElementIndex);
    }
}