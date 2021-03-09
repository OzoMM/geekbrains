package kz.ozom.lesson11;

public class Fruit {
    private float appleWeight = 1.0f;
    private float orangeWeight = 1.5f;

    public float getAppleWeight(int count) {
        return appleWeight * count;
    }

    public float getOrangeWeight(int count) {
        return orangeWeight * count;
    }
}
