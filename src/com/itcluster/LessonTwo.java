package com.itcluster;

import java.util.Scanner;

public class LessonTwo {

    final static double PI = 3.14;
    public static double MILESCOEF = 1.6;
    public LessonTwo() {
        System.out.println("Кінець програми");
    }

    public static void main(String[] args) {
        LessonTwo.lessonType();
        LessonTwo.lessonMod();
        LessonTwo.lessonScan();
        LessonTwo.lessonTypeConversion();
        LessonTwo.lessonStatic(8.5);
        new LessonTwo();
    }

    public static void lessonType() {
        String str = new String("Hello float ");
        float fl = 5.5F;
        double db = 6.6;

        System.out.println("Lesson Type\n" + str + fl + ", double\t" + db + ",\tconstant " + PI);

        byte bt = 2;
        short st = 20;
        int in = 200;
        long ln = 2000L;

        char ch = 'C'; //not "C"
        System.out.println("String are:\t" + bt + st + in + ln + ch);

        int x = 42;
        int y = ++x;
        System.out.println("y = " + y + " x = " + x);  // !!!!!

        x = 42;
        y = x++;
        System.out.println("y = " + y + " x = " + x); // !!!!!

        int c = 19;
        c %= 6;
        System.out.println("c = " + c);

    }

    public static void lessonMod() {
        System.out.println("Lesson Mod\n40.4 mod 10 \t" + 40.4 % 10);
        System.out.println("55 mod 10 \t" + 55 % 10);
    }

    public static void lessonScan() {
        String name;
        int age;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Lesson Scan\nInput Name >> ");
        name = inputDevice.nextLine();
        System.out.print("Input Age >> ");
        age = inputDevice.nextInt();
        System.out.println("Your name " + name + " and your age " + age + " years old!");
    }

    public static void lessonTypeConversion() {
        double d = 1.6;
        byte b = (byte) d; // b = 1
        int i = new Double("23.4").intValue();
        System.out.println("Lesson Type Conversion\ni = " + i);
        String s = i + b + String.valueOf(d);
        System.out.println("s = " + s);
        String s1 = "12";
        int pin = Integer.parseInt(s1);
        pin += Double.parseDouble(s);
        System.out.println("pin = " + pin);
    }

    public static void lessonStatic(double km) {
        System.out.format("Lesson Static Metod\nMiles %.2f%n", km * MILESCOEF);
    }
}
