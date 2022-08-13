/**
 * Создайте массив из 4 случайных целых чисел из отрезка [10; 99]. Выведите его на экран в строку.
 * Далее определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.
 */
package tasks;

public class StrictlyIncreasingSequence {

    public static void main(String[] args) {

        int[] randomNumbers = new int[4];
        for (int i = 0; i < 4; i++) {
            randomNumbers[i] = (int) ((Math.random() * 89) + 10);
            System.out.print(randomNumbers[i] + " ");
        }

        System.out.println("");
        boolean isIncreasingSequence = true;
        for (int i = 1; i < randomNumbers.length; i++) {
            if (randomNumbers[i] <= randomNumbers[i - 1]) {
                isIncreasingSequence = false;
            }
        }
        if (isIncreasingSequence) {
            System.out.println("The array is a strictly increasing sequence.");
        } else {
            System.out.println("The array is not a strictly increasing sequence.");
        }
    }
}

