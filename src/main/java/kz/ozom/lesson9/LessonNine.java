package kz.ozom.lesson9;

public class LessonNine {

    public static void main(String[] args){

        String[][] myArray = {{"1","2","3","4"}, {"1","2","3","4"}, {"1","2","3","4"}, {"1","2","3","4"}}; // "Правильный массив"
        String[][] myArray2 = {{"1","2","3","A"}, {"1","2","3","4"}, {"1","2","3","4"}, {"1","2","3","4"}}; // "Не правильный массив"
        String[][] myArray3 = {{"1","2","3","4"}, {"1","2","3","4"}, {"1","2","3","4"}, {"1","2","3","4"}, {"1","2","3","4"}}; // "Не правильный массив 2"

        try {
            getArraySum(myArray2); // передаем любой массив приведенный выше
        } catch (MyArraySizeException e) {
            System.out.println("Массив не соответствует размеру 4х4");
        } catch (MyArrayDataException e) {
            e.showErrorMessage();
        }

    }

    public static void getArraySum(String myArr[][]) throws MyArraySizeException, MyArrayDataException{

        if (myArr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
        int summ = 0;
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                try {
                    int a = Integer.parseInt(myArr[i][j]);
                    summ += a;
                } catch (NumberFormatException e) { // не понял как проверить является ли преобразованный элемент массива числом
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        System.out.println("Все прошло успешно. Сумма элементов массива равна " + summ);
    }
}
