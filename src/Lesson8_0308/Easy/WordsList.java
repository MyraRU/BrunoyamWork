package Lesson8_0308.Easy;

import java.util.*;

public class WordsList {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

//        words.add("may");
//        words.add("august");
//        words.add("june");
//        words.add("may");
//        words.add("may");
//        words.add("july");
//        words.add("may");
//        words.add("august");
//        words.add("august");
//        System.out.println(SearchDuplicate.duplicate(words));

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arrStr = str.split(" ");

        List<String> pupa = Arrays.asList(arrStr);

        System.out.println(SearchDuplicate.duplicate(pupa));
    }

}
