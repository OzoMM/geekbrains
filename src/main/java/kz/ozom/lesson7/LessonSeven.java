package kz.ozom.lesson7;

public class LessonSeven {
    public static void main(String[] args){
        Plate plate = new Plate(70);
        Cat[] cats = new Cat[5];

        System.out.println("Еды в миске " + plate.getQuantity());

        cats[0] = new Cat("Барсик", 5, false);
        cats[1] = new Cat("Рыжик", 15, false);
        cats[2] = new Cat("Кузя", 25, false);
        cats[3] = new Cat("Мурзик", 9, false);
        cats[4] = new Cat("Багира", 20, false);

        for (int i = 0; i < 5; i++) {
            cats[i].eat(plate);
            System.out.println(cats[i].getName() + " " + (cats[i].isFullness() ? "сыт" : "не сыт (не хватило еды)"));
        }

        System.out.println("Осталось еды в миске " + plate.getQuantity());
    }
}
