/**
 * Напишите программу, которая определяет, сколько слов в сроке (ввод с консоли).
 */
package tasks;

public class WordsInTheLine {

    public static void main(String[] args) {

        String sentence = "She served a big table in the dining room.";

        countWords(sentence);
    }

    public static void countWords(String string) {
        String[] arr = string.split(" ");
        int count = 0;
        for (String str : arr) {
            count++;
        }
        System.out.println(count);
    }
}
