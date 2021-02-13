package kz.ozom.lesson7;

public class Plate {
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public Plate(int quantity) {
        this.quantity = quantity;
    }

    public boolean checkFullness(int appetite){
        return (this.quantity - appetite) >= 0;
    }

    public void decrease(int appetite){
        this.quantity -= appetite;
    }

    public void increase(int count){
        this.quantity += count;
    }
}
