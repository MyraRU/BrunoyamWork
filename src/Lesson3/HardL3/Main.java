package Lesson3.HardL3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] income = {
                {104, 32, -20, 143, 5, 77, 100},
                {5, 4, 5, 50, 10, 300, -50},
                {-10, 5, 400, -25, 8, 10, 75,}
        };

        int sumOne = 0;
        int sumTwo = 0;
        int sumThree = 0;

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 7; j++) {
                sumOne = income[0][j] + sumOne;
                sumTwo = income[1][j] + sumTwo;
                sumThree = income[2][j] + sumThree;
            }
        }
        int sumIncome = Math.max(Math.max(sumOne,sumTwo), sumThree);

       System.out.println("Компания №1 - " + sumOne + "$, Компания №2 - " + sumTwo + "$, Компания №3 - " + sumThree + "$");

        System.out.print("Ответ: " + sumIncome + "$");
    }
}
