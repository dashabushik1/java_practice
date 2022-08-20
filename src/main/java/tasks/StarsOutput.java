/**
 * Необходимо написать программу, которая вывела бы в консоль звездочки вот так образом, как на картинке ниже.
 *   * * * * *
 *   * * * * *
 *   * * * * *
 */
package tasks;

public class StarsOutput {

    public static void main(String[] args) {

        final int rows = 3;
        final int columns = 5;
        String[][] starsArray = new String[rows][columns];

        fillStarsArray(starsArray);
        printArrayOfStars(starsArray);
    }

    public static String[][] fillStarsArray(String[][] starsArray) {   // метод заполняет двумерный массив звездочками
        String star = "*";
        for (int i = 0; i < starsArray.length; i++) {
            for (int j = 0; j < starsArray[i].length; j++) {
                starsArray[i][j] = star;
            }
        }
        return starsArray;
    }

    public static String[][] printArrayOfStars(String[][] starsArray) {  // метод выводит двумерный массив со звездочками
        for (int i = 0; i < starsArray.length; i++) {
            for (int j = 0; j < starsArray[i].length; j++) {
                System.out.print(starsArray[i][j] + " ");
            }
            System.out.println("");
        }
        return starsArray;
    }
}
