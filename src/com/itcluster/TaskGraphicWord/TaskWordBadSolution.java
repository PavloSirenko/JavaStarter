package com.itcluster.TaskGraphicWord;

import java.util.Scanner;
    /* УМОВА ЗАДАЧІ
    Напишіть програму, що виводить в консоль
    слово, що будо введене із консолі.
    Підказка: в консолі потрібно ввести тільки одне слово java
     */

    /*Підказка як отримати літеру
    String word;
    Scanner inputDevice = new Scanner(System.in);
    System.out.print("Input word >> ");
    word = inputDevice.next();
    char letter = word.charAt(0);
    System.out.println(letter);
     */

public class TaskWordBadSolution {

    public static void main(String[] args) {

        TaskWordBadSolution.scan();
    }

    public static void scan() {
        String word;

        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please enter the word >> ");

        for ( ; !inputDevice.hasNext("java"); ) {

            word = inputDevice.next();
            for (; word.length() != 4; ) {
                System.out.print("Please enter the word from 4 letters >> ");
                word = inputDevice.next();

            }
            System.out.print("Please enter the word \"java\" >> ");
        }
        TaskWordBadSolution.print();
    }

    public static void print() {
        System.out.println("         J      A     V       V    A ");
        System.out.println("         J     A A     V     V    A A ");
        System.out.println("         J    A   A     V   V    A   A ");
        System.out.println(" J       J   AAAAAAA     V V    AAAAAAA ");
        System.out.println("  JJJJJJJ   A       A     V    A       A ");
    }
}
