package kz.ozom.lesson5;

public class LessonFive  extends Staff{

    public LessonFive(String fio, String position, String email, String phone, int salary, int age) {
        super(fio, position, email, phone, salary, age);
    }

    public static void main(String[] args){

        Staff[] personals = new Staff[5];
        personals[0] = new Staff("Иванов И. И.", "Кассир", "ivanov@mail.ru", "3957744", 100000, 20);
        personals[1] = new Staff("Гудков Г. А.", "Бригадир", "gudkov@mail.ru", "3958855", 120000, 35);
        personals[2] = new Staff("Жидков Е. В.", "Повар", "zhidkov@mail.ru", "3956251", 100000, 55);
        personals[3] = new Staff("Пупкин А. В.", "Директор", "pupkin@mail.ru", "3955421", 150000, 41);
        personals[4] = new Staff("Жданов М. И.", "Бухгалтер", "zhdanov@mail.ru", "3956357", 130000, 33);

        for (int i = 0; i < personals.length; i++) {
            if (personals[i].getAge() > 40){
                personals[i].showInfo();
                System.out.println();
            }
        }
    }
}
