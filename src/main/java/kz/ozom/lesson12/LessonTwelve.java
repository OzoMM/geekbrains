package kz.ozom.lesson12;

import java.util.Arrays;

public class LessonTwelve {
    public static void main(String[] args){
        final int SIZE = 10000;
        final int HALF = SIZE / 2;
        float[] arr = new float[SIZE];
        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];

        Arrays.fill(arr, 1);
        firstMethod(SIZE, arr);

        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr, HALF, arr2, 0, HALF);

        new Thread(() -> secondMethod(HALF, arr1)).start();
        new Thread(() -> secondMethod(HALF, arr2)).start();

        System.arraycopy(arr1, 0, arr, 0, HALF);
        System.arraycopy(arr2, 0, arr, HALF, HALF);
    }

    private static void firstMethod(int SIZE, float[] arr) {
        long a = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        a = System.currentTimeMillis() - a;

        System.out.println(a);
    }

    private static float[] secondMethod(int SIZE, float[] arr) {
        long a = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        a = System.currentTimeMillis() - a;

        System.out.println(a);

        return arr;
    }
}
