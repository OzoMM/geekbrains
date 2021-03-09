package kz.ozom.lesson11;

public class Apple extends Fruit {
    private int appleCount = 0;

    public int getAppleCount() {
        return appleCount;
    }

    public void appleInc() {
        this.appleCount++;
    }

    public float getWeight(){
        return getAppleWeight(appleCount);
    }
}
