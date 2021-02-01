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
        int odd = rand.nextInt(2);
        while (true){
            odd++;
            if (odd % 2 == 0) {
                humanTurn();
                if (isWin(DOT_X)){
                    showMap();
                    System.out.println("Выиграл человек");
                    break;
                }
            }
            else {
                aiTurn();
                if (isWin(DOT_O)){
                    showMap();
                    System.out.println("Выиграл компьтер");
                    break;
                }
            }
            showMap();
            if (isMapFull()){
                System.out.println("Ничья!");
            }
        }
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isWin(char dot) {
        // Проверка вертикали и горизонтали
        for (int i = 0; i < SIZE; i++) {
            int winI = 0;
            int winJ = 0;
            for (int j = 0; j < SIZE; j++) {
                winI += map[i][j] == dot ? 1 : winI == 0 ? 0 : -1;
                winJ += map[j][i] == dot ? 1 : winJ == 0 ? 0 : -1;
                if ((winI == DOTS_TO_WIN) || (winJ == DOTS_TO_WIN)){
                    return true;
                }
            }
        }

        // Проверка главных диагоналей
        int winI = 0;
        int winJ = 0;
        for (int i = 0; i < SIZE; i++) {
            winI += map[i][i] == dot ? 1 : winI == 0 ? 0 : -1;
            winJ += map[i][SIZE-(i+1)] == dot ? 1 : winJ == 0 ? 0 : -1;
            if ((winI == DOTS_TO_WIN) || (winJ == DOTS_TO_WIN)){
                return true;
            }
        }

        // Проверка побочных диагоналей
        winI = 0;
        winJ = 0;
        int winK = 0;
        int winL = 0;
        for (int i = 0; i < SIZE - 1; i++) {
            winI += map[i][i+1] == dot ? 1 : winI == 0 ? 0 : -1;
            winJ += map[i+1][i] == dot ? 1 : winJ == 0 ? 0 : -1;
            winK += map[i][SIZE - 2 - i] == dot ? 1 : winK == 0 ? 0 : -1;
            winL += map[i+1][SIZE - 1 - i] == dot ? 1 : winL == 0 ? 0 : -1;

            if ((winI == DOTS_TO_WIN) || (winJ == DOTS_TO_WIN) || (winK == DOTS_TO_WIN) || (winL == DOTS_TO_WIN)){
                return true;
            }
        }

        return false;
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
            x = rand.nextInt(SIZE);
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
