/**
 * Необходимо, чтобы программа выводила на экран вот такую последовательность:
 * 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
 */
package tasks;

public class NumbersFromSeven {

    private static final int MAGIC_NUMBER = 7;
    private static final int MAX_NUMBER = 100;

    public static void main(String[] args) {

        for (int i = MAGIC_NUMBER; i < MAX_NUMBER; i = i + MAGIC_NUMBER) {
            System.out.print(i + " ");
        }
    }
}
