package kz.ozom.lesson2;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Random;

public class secondLesson {
    public static void main(String[] args){
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
        taskFive();
        taskSix();
        taskSeven();
    }

    public static void printArray(int arrayVar[]){
        for (int i = 0; i < arrayVar.length; i++) {
            System.out.print(arrayVar[i]+" ");
        }
        System.out.println();
    }

    public static void taskOne(){
        int[] intArray = {0, 1, 0, 1, 0};
        Random randomInt = new Random();

        System.out.println("Задание 1. Исходный массив");
        printArray(intArray);

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 0){
                intArray[i] = 1;
            }
            else{
                intArray[i] = 0;
            }
        }
        System.out.println("Измененный массив");
        printArray(intArray);
    }

    public static void taskTwo(){
        int intArray[] = new int[8];
        for (int i = 0; i < 8; i++) {
            intArray[i] = i * 3;
        }
        System.out.println();
        System.out.println("Задание 2");
        printArray(intArray);
    }

    public static void taskThree(){
        int intArray[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println();
        System.out.println("Задание 3. Исходный массив");
        printArray(intArray);
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < 6){
                intArray[i] = intArray[i] * 2;
            }
        }
        System.out.println("Измененный массив");
        printArray(intArray);
    }

    public static void taskFour(){
        int arraySize = 7;
        int intArray[][] = new int[arraySize][arraySize];
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                if (i == j){
                    intArray[i][j] = 1;
                }
                else {
                    intArray[i][j] = 0;
                }
            }
            intArray[i][arraySize-i-1] = 1;
        }

        // Вывод
        System.out.println();
        System.out.println("Задание 4.");
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void taskFive(){
        int arraySize = 10;
        int intArray[] = new int[arraySize];
        Random randInt = new Random();
        for (int i = 0; i < arraySize; i++) {
            intArray[i] = randInt.nextInt(100);
        }

        int max = intArray[0], min = intArray[0];
        for (int i = 1; i < arraySize; i++) {
            if (max < intArray[i]){
                max = intArray[i];
            }
            if (min > intArray[i]){
                min = intArray[i];
            }
        }
        System.out.println();
        System.out.println("Задание 5. Исходный массив");
        printArray(intArray);
        System.out.println("Максимальный элемент в массиве = " + max);
        System.out.println("Минимальный элемент в массиве = " + min);
    }

    public static void taskSix(){ // Массив не передаю, буду генерировать случайный
        int arraySize = 10;
        int intArray[] = new int[arraySize];
        Random randInt = new Random();
        for (int i = 0; i < arraySize; i++) {
            intArray[i] = randInt.nextInt(3); // Для проверки лучше использовать массив из случайных чисел в диапазоне 0-1
        }
        System.out.println();
        System.out.println("Задание 6. Исходный массив");
        printArray(intArray);
        System.out.println();

        int arraySum = 0, currentSum = 0;
        for (int i = 0; i < arraySize; i++) {
            arraySum = arraySum + intArray[i];
        }

        for (int i = 0; i < arraySize; i++) {
            currentSum = currentSum + intArray[i];
            System.out.print(intArray[i] + " ");
            if (currentSum == (arraySum - currentSum)){
                System.out.print("|| ");
            }
        }
        System.out.println();
    }

    public static void taskSeven(){
        int arraySize = 5;
        int intArray[] = new int[arraySize];
        Random randInt = new Random();
        for (int i = 0; i < arraySize; i++) {
            intArray[i] = randInt.nextInt(100);
        }
        System.out.println();
        System.out.println("Задание 7. Исходный массив");
        printArray(intArray);

        int shift = randInt.nextInt(arraySize*2-1) - arraySize;
        if (shift < 0 ){
            System.out.println("Количество шагов для сдвига влево " + shift * -1);
            int left;
            for (int i = 1; i <= (shift * -1); i++) {
                left = intArray[0];
                for (int j = 1; j < intArray.length; j++) {
                    intArray[j - 1] = intArray[j];
                }
                intArray[intArray.length - 1] = left;
            }
        }
        else{
            System.out.println("Количество шагов для сдвига вправо " + shift);
            int right;
            for (int i = 1; i <= shift; i++) {
                right = intArray[intArray.length - 1];
                for (int j = intArray.length - 2; j >= 0; j--) {
                    intArray[j + 1] = intArray[j];
                }
                intArray[0] = right;
            }
        }



        printArray(intArray);
    }
}