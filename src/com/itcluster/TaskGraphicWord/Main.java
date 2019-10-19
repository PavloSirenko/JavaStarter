package com.itcluster.TaskGraphicWord;
/* УМОВА ЗАДАЧІ
    Напишіть програму, що виводить в консоль
    слово, що будо введене із консолі.
     */
import java.util.Scanner;

public class Main {
    private static final int LIMIT_LETTER = 12;

    public static void main(String[] args) {
        PrintGraphicLetter obj = new PrintGraphicLetter();

        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Stipulation! Enter ONLY the word latin letters!");
        System.out.print("Please enter the word >> ");

        String word = inputDevice.next();

        for (; word.length() > LIMIT_LETTER; ) {
            System.out.print(String.format("Please enter the word max from %d latin letters >> ", LIMIT_LETTER));
            word = inputDevice.next();

        }
        obj.printWord(word.toLowerCase());
    }
}
