package kz.ozom.lesson8;

public class LessonEight {
    public static void main(String[] args){
        Running runHuman = Item.HUMAN;
        Jumping jumpHuman = Item.HUMAN;

        Running runRobot = Item.ROBOT;
        Jumping jumpRobot = Item.ROBOT;

        Running runCat = Item.CAT;
        Jumping jumpCat = Item.CAT;

        Treadmill treadmill = new Treadmill(44);
        Wall wall = new Wall(6);

        runCat.run(treadmill.getRunLength());
        runHuman.run(treadmill.getRunLength());
        runRobot.run(treadmill.getRunLength());

        jumpCat.jump(wall.getWallHeight());
        jumpHuman.jump(wall.getWallHeight());
        jumpRobot.jump(wall.getWallHeight());
    }
}