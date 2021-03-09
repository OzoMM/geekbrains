package kz.ozom.lesson11;

import java.util.ArrayList;

public class LessonEleven {
    public static void main(String[] args) {
        String[] array = new String[]{"Apple", "Orange", "Orange", "Apple", "Orange", "Apple", "Orange", "Orange", "Apple", "Orange"};

        int firstIndex = 0;
        int secondIndex = 1;
        ArrayList arrayList;

        arrayElementsChange(array, firstIndex, secondIndex);
        arrayList = arrayToArraylist(array);

        ArrayList<String> arrayListApple = new ArrayList<>();
        ArrayList<String> arrayListOrange = new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == "Apple"){
                arrayListApple.add("Apple");
            }

            if (arrayList.get(i) == "Orange"){
                arrayListOrange.add("Orange");
            }
        }

        Box box1 = new Box("Apple", 1.0f);
        Box box2 = new Box("Orange", 1.5f);

        box1.setObject(arrayListApple);
        box2.setObject(arrayListOrange);

        ArrayList arrayListBox1 = (ArrayList) box1.getObject();
        ArrayList arrayListBox2 = (ArrayList) box2.getObject();

        System.out.println(arrayListBox1);
        System.out.println(getWeight(arrayListBox1.size(), box1.getFruitWeight()));

        System.out.println(arrayListBox2);
        System.out.println(getWeight(arrayListBox2.size(), box2.getFruitWeight()));

        System.out.println(box1.compare(box1));
    }

    private static float getWeight(int count, float fruitWeight) {
        return fruitWeight * count;
    }

    public static ArrayList arrayToArraylist(String[] array){
        ArrayList<String> arrayList = new ArrayList<>();
        for (String item : array) {
            arrayList.add(item);
        }
        return arrayList;
    }

    public static void arrayElementsChange(String[] array, int firstIndex, int secondIndex){
        String temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
