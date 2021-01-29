package kz.ozom.lesson4;

import java.util.Random;
import java.util.Scanner;

public class LessonFour {
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;
    public static char[][] map = new char[SIZE][SIZE];

    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static Scanner scrn = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args){
        initMap();
        showMap();

        humanTurn();
        showMap();
        aiTurn();
        showMap();
    }

    private static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координату X");
            x = scrn.nextInt() - 1;
            System.out.println("Введите координату Y");
            y = scrn.nextInt() - 1;
        } while(!isTurnValid(x, y));
        map[x][y] = DOT_X;
    }

    private static void aiTurn() {
        int x, y;
        do {
            System.out.println("Введите координату X");
            x = rand.nextInt(SIZE);
            System.out.println("Введите координату Y");
            y = rand.nextInt(SIZE);
        } while(!isTurnValid(x, y));
        map[x][y] = DOT_O;
        System.out.println("Соперник поставил О в точке " + (x + 1) + " " + (y + 1));
    }

    private static boolean isTurnValid(int x, int y) {
        return x < SIZE && y < SIZE && map[x][y] == '•';
    }

    public static void initMap(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void showMap(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

}
