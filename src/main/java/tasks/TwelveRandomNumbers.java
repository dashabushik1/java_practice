/**
 * Создайте массив из 12 случайных чисел из отрезка [-15; 15].
 * Определите, какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
 */
package tasks;

public class TwelveRandomNumbers {

    public static void main(String[] args) {

        final int SIZE = 12;
        int[] randomNumbers = new int[SIZE];

        fillArrayOfRandomNumbers(randomNumbers);
        printArrayOfRandomNumbers(randomNumbers);
        printIndexOfMaxElementInArray(randomNumbers);
    }

    public static int[] fillArrayOfRandomNumbers(int[] randomNumbers) { // метод заполняет массив случайными числами
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) ((Math.random() * 31) - 15);
        }
        return randomNumbers;
    }

    public static int[] printArrayOfRandomNumbers(int[] randomNumbers) { // метод выводит рандомные числа
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
        return randomNumbers;
    }

    public static int[] printIndexOfMaxElementInArray(int[] randomNumbers) { // метод ищет и выводит индекс
        int maxIndex = 0;                // максимального элемента в массиве
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] >= randomNumbers[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("");
        System.out.println(maxIndex);
        return randomNumbers;
    }
}