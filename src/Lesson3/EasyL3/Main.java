package Lesson3.EasyL3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Arithmetic arif = new Arithmetic();

        Scanner sc = new Scanner(System.in);

        arif.setX(sc.nextInt());
        arif.setY(sc.nextInt());
    }
}
