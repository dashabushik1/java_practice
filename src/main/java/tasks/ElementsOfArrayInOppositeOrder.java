/**
 * Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
 * Не используйте дополнительный массив для хранения результатов.
 */
package tasks;

public class ElementsOfArrayInOppositeOrder {

    public static void main(String[] args) {

        String[] letters = {"A", "B", "C", "D", "E", "F", "G"};

        print(letters);
        reverse(letters);
        System.out.println("");
        print(letters);
    }

    public static void print(String[] array) {  // метод выводит массив
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void reverse(String[] array) {  // метод меняет местами элементы массива в обратном порядке
        int arrayLength = array.length;
        int iterations = arrayLength / 2;
        for (int i = 0; i < iterations; i++) {
            String reverse = array[i];
            array[i] = array[arrayLength - 1 - i];
            array[arrayLength - 1 - i] = reverse;
        }
    }
}
