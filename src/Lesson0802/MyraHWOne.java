package Lesson0802;

import java.util.Scanner;

public class MyraHWOne {
    public static void main(String[] args) {

//  Задание Easy. Спящий бот

//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        System.out.println("Бот отвечает: Я сплю");

//  Задание Normal.

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Введите своё имя");
//        String name = sc.nextLine();
//
//        System.out.println("Введите число соответствующее вашему полу: 0 - Женщина ; 1 - Мужчина");
//        String gender = sc.nextLine();
//
//        if (gender.equals("0")){
//            System.out.println("Привет, дорогая " + name + ". Рад знакомству!");
//        } else if (gender.equals("1")){
//            System.out.println("Привет, дорогой " + name + ". Рад знакомству!");
//        } else {
//            System.out.println("Ой, что-то пошло не так. Перезапустите программу и попробуйте снова");

//  Задание Hard. Наибольшее и наименьшее число из трех введенных в консоль.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три числа");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c){
            System.out.println("Число " + a + " наибольшее из введёных.");
        } else if ((a < b) && (a < c)) {
            System.out.println("Число " + a + " наименьшее из введёных.");
        }
        if ((b > a) && (b > c)){
            System.out.println("Число " + b + " наибольшее из введёных.");
        } else if ((b < a) && (b < c)) {
            System.out.println("Число " + b + " наименьшее из введёных.");
        }
        if ((c > a) && (c > b)){
            System.out.println("Число " + c + " наибольшее из введёных.");
        } else if ((c < a) && (c < b)) {
            System.out.println("Число " + c + " наименьшее из введёных.");
        }
    }
}
