/**
 * Необходимо, чтобы программа выводила на экран вот такую последовательность:
 * 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
 */
package tasks;

public class NumbersFromSeven {

    public static void main(String[] args) {

        int maxNumber = 100;
        for (int i = 7; i < maxNumber; i = i + 7) {
            System.out.print(i + " ");
        }
    }
}
