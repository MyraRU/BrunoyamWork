package Lesson0103.Normal;

public class Test {
    public static void main(String[] args) {
        String[] languagesList = {"ADA", "ALGOL", "B", "BASIC", "C", "C++"};

        MishaLanguage mishaLanguage = new MishaLanguage();

        System.out.println(mishaLanguage.CheckLanguage(languagesList, "C"));


    }
}
