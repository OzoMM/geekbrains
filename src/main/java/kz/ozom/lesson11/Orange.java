package kz.ozom.lesson11;

public class Orange extends Fruit{
    private int orangeCount = 0;

    public int getOrangeCount() {
        return orangeCount;
    }

    public void orangeInc() {
        this.orangeCount++;
    }

    public float getWeight(){
        return getOrangeWeight(orangeCount);
    }
}
