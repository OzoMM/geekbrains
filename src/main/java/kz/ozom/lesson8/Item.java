package kz.ozom.lesson8;

public enum Item implements Running, Jumping{
    HUMAN("человек", 50, 5),
    ROBOT("робот", 100, 10),
    CAT("кот", 50, 20);

    private String name;
    private int runLength;
    private int jumpHeight;

    Item(String name, int runLength, int jumpHeight) {
        this.name = name;
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }

    public void run(int runLength){
        if (this.runLength >= runLength){
            System.out.println("Я " + this.name +" и я бегу");
        }
        else{
            System.out.println("Я " + this.name +" и дистанция слишком большая для меня");
        }
    }

    public void jump(int jumpHeight){
        if (this.jumpHeight >= jumpHeight){
            System.out.println("Я " + this.name +" и я прыгаю");
        }
        else{
            System.out.println("Я " + this.name +" и высота слишком большая для меня");
        }
    }
}
