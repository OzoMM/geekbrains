package kz.ozom.lesson11;

import java.util.ArrayList;

public class Box {
    private Object object;
    private String fruitType;
    private float fruitWeight;

    public Box(String fruitType, float fruitWeight) {
        this.fruitType = fruitType;
        this.fruitWeight = fruitWeight;
    }

    public String getFruitType() {
        return fruitType;
    }

    public Box(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public float getFruitWeight() {
        return fruitWeight;
    }

    public void setObject(Object object) {
        this.object = object;
    }

}
