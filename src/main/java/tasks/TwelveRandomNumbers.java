/**
 * Создайте массив из 12 случайных чисел из отрезка [-15; 15].
 * Определите, какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
 */
package tasks;

public class TwelveRandomNumbers {

    public static void main(String[] args) {

        int[] randomNumbers = new int[12];
        int maxIndex = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) ((Math.random() * 30) - 15);
            System.out.print(randomNumbers[i] + " ");
        }

        System.out.println(" ");
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] >= randomNumbers[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }
}
