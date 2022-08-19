/**
 * Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
 * Не используйте дополнительный массив для хранения результатов.
 */
package tasks;

public class ElementsOfArrayInOppositeOrder {

    public static void main(String[] args) {
        String[] letters = {"A", "B", "C", "D", "E", "F", "G"};
        printArray(letters);
    }

    private static String[] printArray(String[] letters) {
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i] + " ");
        }
        return letters;
    }
}
