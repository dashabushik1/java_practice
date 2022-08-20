/**
 * Создайте массив из 8 случайных чисел из отрезка [1; 10]. Выведите массив на экран в строку.
 * Замените каждый элемент с нечетным индексом на 0. Снова выведите массив на экран на отдельной строке.
 */
package tasks;

public class AddZeroToOddIndex {

    public static void main(String[] args) {

        final int SIZE = 8;
        int[] randomNumbers = new int[SIZE];

        fillArrayOfRandomNumbers(randomNumbers);
        printArray(randomNumbers);
        System.out.println("");
        replaceElementsWithOddIndexes(randomNumbers);
        printArray(randomNumbers);
    }

    public static int[] fillArrayOfRandomNumbers(int[] randomNumbers) {  // метод заполняет массив случайными числами
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 10) + 1;
        }
        return randomNumbers;
    }

    public static int[] replaceElementsWithOddIndexes(int[] randomNumbers) {  // метод находит элементы с нечетным индексом
        for (int i = 0; i < randomNumbers.length; i++) {                      // и меняет значения на 0
            if (i % 2 != 0) {
                randomNumbers[i] = 0;
            }
        }
        return randomNumbers;
    }

    public static int[] printArray(int[] randomNumbers) {  // метод выводит массив
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
        return randomNumbers;
    }
}

