package Lesson7_0103.Normal;

public class MishaLanguage {
    public static boolean CheckLanguage(String[] arrLanguage, String searchLanguage) {

        int firstIndex = 0, lastIndex = arrLanguage.length - 1;
        while (firstIndex <= lastIndex) {
            int midlIndex = firstIndex + (lastIndex - 1) / 2;

            int res = searchLanguage.compareTo(arrLanguage[midlIndex]);

            if (res == 0)
                return true;
            // для правой (положительной) половины
            if (res > 0)
                firstIndex = midlIndex + 1;
            // для левой (отрицательной) половины
            else
                lastIndex = midlIndex - 1;
        }
        return false;
    }
}
