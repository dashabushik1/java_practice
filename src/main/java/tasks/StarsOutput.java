/**
 * Нербходимо написать программу, которая вывела бы в консоль звездочки вот так образом, как на картинке ниже.
 * * * * * *
 * * * * * *
 * * * * * *
 */
package tasks;

public class StarsOutput {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
