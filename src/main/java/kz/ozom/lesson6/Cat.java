package kz.ozom.lesson6;

public class Cat extends Animal{

    private int runDistance;
    private int swimDistance;

    public int getRunDistance() {
        return runDistance;
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = Math.min(runDistance, 200);
    }

    public int getSwimDistance() {
        return swimDistance;
    }

    public void setSwimDistance(int swinDistance) {
        this.swimDistance = Math.min(swinDistance, 0);
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void swim(int distance) {
        System.out.println(super.getName()+" не умеет плавать");
    }
}
