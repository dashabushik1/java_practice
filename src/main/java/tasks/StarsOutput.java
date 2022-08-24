/**
 * Необходимо написать программу, которая вывела бы в консоль звездочки вот так образом, как на картинке ниже.
 * * * * * *
 * * * * * *
 * * * * * *
 */
package tasks;

public class StarsOutput {

    private static final int ROWS = 3;
    private static final int COLUMNS = 5;

    public static void main(String[] args) {

        String[][] starsArray = new String[ROWS][COLUMNS];

        fill(starsArray);
        print(starsArray);
    }

    public static void fill(String[][] array) {   // метод заполняет двумерный массив звездочками
        String star = "*";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = star;
            }
        }
    }

    public static void print(String[][] array) {  // метод выводит двумерный массив со звездочками
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
