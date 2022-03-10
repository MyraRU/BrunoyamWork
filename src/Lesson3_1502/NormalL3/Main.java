package Lesson3_1502.NormalL3;

public class Main {
    public static void main(String[] args) {

        Person perOne = new Person();
        perOne.FirstMiddleLastName = "Иван Иванович Иванов";
        perOne.post = "Программист Java";
        perOne.email = "ivan.ivanovich.ivanov@mail.ru";
        perOne.phoneNumber = 88005553535L;
        perOne.payCheck = 80000;
        perOne.age = 30;

        Person perTwo = new Person();
        perTwo.FirstMiddleLastName = "Петр Петрович Петров";
        perTwo.post = "Уборщик офиса Java";
        perTwo.email = "venik2000@mail.ru";
        perTwo.phoneNumber = 7742739L;
        perTwo.payCheck = 22000;
        perTwo.age = 50;

        Person perThree = new Person();
        perThree.FirstMiddleLastName = "Василий Васильевич Васянский";
        perThree.post = "Тракторист";
        perThree.email = "tractor@mail.ru";
        perThree.phoneNumber = 89207856655L;
        perThree.payCheck = 55000;
        perThree.age = 60;

        Person[] persArray = new Person[3];
        persArray[0] = perOne;
        persArray[1] = perTwo;
        persArray[2] = perThree;

        for (int i = 0; i < persArray.length ; i++) {
            if (persArray[i].age >= 40) {
                persArray[i].info();
            }
        }


    }
}
