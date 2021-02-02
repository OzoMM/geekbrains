package kz.ozom.lesson6;

public class LessonSix {
    public static void main(String[] args){
        Dog dog = new Dog("Барсик");
        dog.setRunDistance(60);
        dog.setSwimDistance(9);
        dog.run(dog.getRunDistance());
        dog.swim(dog.getSwimDistance());

        System.out.println();

        Cat cat = new Cat("Мурзик");
        cat.setRunDistance(60);
        cat.setSwimDistance(9);
        cat.run(cat.getRunDistance());
        cat.swim(cat.getSwimDistance());
    }
}
