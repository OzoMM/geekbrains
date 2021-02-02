package kz.ozom.lesson6;

public class Dog extends Animal{
    private int runDistance;
    private int swimDistance;

    public int getRunDistance() {
        return runDistance;
    }

    public int getSwimDistance() {
        return swimDistance;
    }

    public void setSwimDistance(int swimDistance) {
        this.swimDistance = Math.min(swimDistance, 10);
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = Math.min(runDistance, 500);
    }

    public Dog(String name) {
        super(name);
    }


}
