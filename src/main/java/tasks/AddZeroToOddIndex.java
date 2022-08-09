/**
 * Создайте массив из 8 случайных чисел из отрезка [1; 10]. Выведите массив на экран в строку.
 * Замените каждый элемент с нечетным индексом на 0. Снова выведите массив на экран на отдельной строке.
 */
package tasks;

public class AddZeroToOddIndex {

    public static void main(String[] args) {
        int[] randomNumbers = new int[8];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 10) + 1;
            System.out.print(randomNumbers[i] + " ");
        }

        System.out.println(" ");
        for (int i = 0; i < randomNumbers.length; i++) {
            if (i % 2 == 1) {
                randomNumbers[i] = 0;
            }
            System.out.print(randomNumbers[i] + " ");
        }
    }
}
