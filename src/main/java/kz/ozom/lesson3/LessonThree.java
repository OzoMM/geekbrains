package kz.ozom.lesson3;

import java.util.Random;
import java.util.Scanner;

public class LessonThree {
    public static void main(String[] args){
//        taskOne();
        taskTwo();
    }

    private static void taskTwo() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String word = words[new Random().nextInt(words.length)];
        System.out.println(word);
        Scanner scnr = new Scanner(System.in);
        String answerWord;
        System.out.println("Угадайте слово. Введите свой вариант.");
        do {
            answerWord = scnr.next();
            String template = "";
            for (int i = 0; i < 14; i++) {
                if (answerWord.length() > i && word.length() > i && word.charAt(i) == answerWord.charAt(i)){
                    template += word.charAt(i);
                }
                else{
                    template += "#";
                }
            }
            if (!word.equals(answerWord)){
                System.out.println(template);
            }

        } while (!word.equals(answerWord));

        System.out.println("Ура! Вы угадали!");
    }

    private static void taskOne() {
        int randNumber = new Random().nextInt(10);
        Scanner scnr = new Scanner(System.in);
        int inputInt;
        int answer = 0;
        int i = 0;
        System.out.println(randNumber);
        do {
            i++;
            System.out.println("Угадайте число от 0 до 9");
            inputInt = scnr.nextInt();
            if (randNumber == inputInt){
                System.out.println("Совершенно верно! Вы угадали.");
            }
            if (randNumber > inputInt){
                System.out.println("Введенное число меньше чем загаданное.");
            }
            if (randNumber < inputInt) {
                System.out.println("Введенное число больше чем загаданное.");
            }
            if (i < 3) {
                System.out.println("Повторить игру еще раз? 1 - ДА / 0 - НЕТ");
                answer = scnr.nextInt();
            }
            else {
                System.out.println("Попытки закончились. Вы проиграли.");
            }
        } while(randNumber != inputInt && answer != 0 && i < 3);
    }
}
