package kz.ozom.lesson10;

import java.util.*;

public class LessonTen {
    public static void main(String[] args){
        //task1();
        task2();
    }

    private static void task2(){
        PhoneList phoneList = new PhoneList();
        phoneList.setPhoneList("John", new ArrayList(List.of("3333")));
        phoneList.setPhoneList("John", new ArrayList(List.of("333")));
        phoneList.setPhoneList("John", new ArrayList(List.of("555")));
        phoneList.setPhoneList("John", new ArrayList(List.of("666")));

        System.out.println(phoneList.getPhoneList("John"));
    }

    private static void task1() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("Four");
        arrayList.add("One");
        arrayList.add("Four");
        arrayList.add("Five");
        arrayList.add("Six");
        arrayList.add("Seven");
        arrayList.add("Seven");
        arrayList.add("Seven");
        arrayList.add("Eight");
        arrayList.add("Nine");
        arrayList.add("Four");
        arrayList.add("Ten");

        int i = 0;
        while (arrayList.size() > i){
            int j = i + 1;
            int k = 1;
            while (arrayList.size() > j){
                if (arrayList.get(i).equals(arrayList.get(j))){
                    k++;
                    arrayList.remove(j);
                }
                else {
                    j++;
                }
            }
            System.out.println("Уникальное слово " + arrayList.get(i) + " встречается " + k + " раз");
            i++;
        }
    }
}
