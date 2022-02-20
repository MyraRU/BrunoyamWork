package Lesson1002;

public class MyraHWTwo {
    public static void main(String[] args) {

        // Задача 1. Калькулятор факториала
//        Scanner sc = new Scanner(System.in);
////        System.out.println("Введите факториал");
////        int n = sc.nextInt();
////        int b = 1;
////        for (int a = 1; a <= n; a++) {
////            b = b * a;
////        }
////        System.out.println("Факториал числа " + n + "! = " + b);

        // Задача 2. Фибоначчи
        int[] array = new int[100];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++){
            array[i] = array[i - 1] + array[i - 2];
            System.out.println(array[i]);
        }

        // Задача 3. Определение регистра и латиницы <-- Не работает.
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//
//        String[] arr = {"a", "b", "s", "d"};
//
//        for (int i = 0; i < arr.length; i++) {
//            if (str.equals(arr[i]))
//                System.out.println("da");
//        }
    }
}
