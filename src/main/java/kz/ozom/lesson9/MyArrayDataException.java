package kz.ozom.lesson9;

public class MyArrayDataException extends Exception {
    private int i;
    private int j;

    public MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public void showErrorMessage(){
        System.out.println("Элемент массива [" + i + "][" + j + "] не соответствует типу Integer");
    }
}
