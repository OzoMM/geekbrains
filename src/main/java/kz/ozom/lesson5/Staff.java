package kz.ozom.lesson5;

public class Staff {
    private String fio = "";
    private String position = "";
    private String email = "";
    private String phone = "";
    private int salary;
    private int age;

    public Staff(String fio, String position, String email, String phone, int salary, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void showInfo(){
        System.out.println("ФИО: "+fio);
        System.out.println("Должность: "+position);
        System.out.println("Емайл: "+email);
        System.out.println("Телефон: "+phone);
        System.out.println("Зарплата: "+salary);
        System.out.println("Возраст: "+age);
    }
}
