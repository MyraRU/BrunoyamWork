package Lesson1702.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book firstBook = new Book(12, "23");
        Book secondBook = new Book();
        Book thirdBook = new Book();
        Book fourBook = new Book();

        firstBook.setYearOfPublic(sc.nextInt());

        System.out.println(firstBook);
        System.out.println(secondBook);
        System.out.println(thirdBook);
        System.out.println(fourBook);

    }
}
