/**
 * Необходимо вывести на экран таблицу умножения на 3.
 */
package tasks;

public class MultiplicationTableForThree {

    public static void main(String[] args) {
        for (int i = 3; i <= 3 ; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i*j));
            }
        }
    }
}
