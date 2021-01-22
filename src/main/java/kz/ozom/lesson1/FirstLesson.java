package kz.ozom.lesson1;

import java.util.Random;

public class FirstLesson {

    public static void main(String[] args){
        System.out.println("Good job!");

        byte byteVar = 1;
        int intVar = 11;
        long longVar = 111L;
        float floatVar = 111f;
        double doubleVar = 1.1;
        char charVar = 'd';
        boolean booleanVar = true;

        final String stringVar = "Hi !";

        char charVarA, charVarB, charVarC;
        charVarA = charVarB = charVarC = 'C';

        int intA = 10, intB = 12;

        System.out.println(abcd(0.1f, 2.5f, 3.3f, 1.1f)); // Должно получится 0,55
        System.out.println(between(4, 12));
        positive(5);
        System.out.println(positiveB(-1));
        helloName("Азамат");

        Random yearR = new Random();

        for (int i = 0; i < 9; i++) {
            int year = 1900 + yearR.nextInt(121);
            leapYear(year);
        }
    }

    public static float abcd(float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    public static boolean between(int a, int b){
        int summ = a + b;
        if (summ >=10 && summ<=20){
            return true;
        }
        else{
            return false;
        }
    }

    public static void positive(int a){
        if (a >= 0){
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean positiveB(int a){
        if (a >= 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static void helloName(String name){
        System.out.println("Привет, " + name + "!");
    }

    public static void leapYear(int year){
        if(year % 4 != 0 || year % 100 == 0 && year % 400 != 0){
            System.out.println(year + " год не високосный");
        }
        else {
            System.out.println(year + " год високосный");
        }

    }
}
