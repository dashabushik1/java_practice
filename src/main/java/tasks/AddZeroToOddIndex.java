/**
 * Создайте массив из 8 случайных чисел из отрезка [1; 10]. Выведите массив на экран в строку.
 * Замените каждый элемент с нечетным индексом на 0. Снова выведите массив на экран на отдельной строке.
 */
package tasks;

public class AddZeroToOddIndex {

    public static void main(String[] args) {

        final int SIZE = 8;
        int[] randomNumbers = new int[SIZE];

        fillArray(randomNumbers);
        printArray(randomNumbers);
        System.out.println("");
        replaceElementsWithOddIndexes(randomNumbers);
        printArray(randomNumbers);
    }

    private static int[] fillArray(int[] randomNumbers) {
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 10) + 1;
        }
        return randomNumbers;
    }

    private static int[] replaceElementsWithOddIndexes(int[] randomNumbers) {
        for (int i = 0; i < randomNumbers.length; i++) {
            if (i % 2 != 0) {
                randomNumbers[i] = 0;
            }
        }
        return randomNumbers;
    }

    private static int[] printArray(int[] randomNumbers) {
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
        return randomNumbers;
    }
}

