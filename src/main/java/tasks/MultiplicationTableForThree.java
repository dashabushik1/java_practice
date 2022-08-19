/**
 * Необходимо вывести на экран таблицу умножения на 3.
 */
package tasks;

public class MultiplicationTableForThree {

    public static void main(String[] args) {

        final int number = 3;
        countMultiplicationTable(number);

//        for (int i = 3; i <= 3 ; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.println(i + " * " + j + " = " + (i*j));
//            }
//        }
    }

    public static void countMultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + n + " = " + (i * n));
        }
    }
    // метод вывода?
}
