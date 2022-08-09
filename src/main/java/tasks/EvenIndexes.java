/**
 * Создать второй массив из четных элементов первого массива.
 */
package tasks;

public class EvenIndexes {

    public static void main(String[] args) {

        int[] firstArray = {1, 2, 3, 4, 5, 6};
        int count = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 == 0) {
                count++;
            }
        }

        int[] secondArray = new int[count];
        int j = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 == 0) {
                secondArray[j] = firstArray[i];
                j++;
            }
        }

        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");
        }
    }
}