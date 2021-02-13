package kz.ozom.lesson7;

public class Cat {

    private final String name;
    private final int appetite;
    private boolean fullness;

    public String getName() {
        return name;
    }

    public boolean isFullness() {
        return fullness;
    }

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    public void eat(Plate plate){
        if (plate.checkFullness(this.appetite)) {
            plate.decrease(this.appetite);
            this.fullness = true;
        }
    }
}
