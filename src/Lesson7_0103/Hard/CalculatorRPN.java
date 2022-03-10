package Lesson7_0103.Hard;

import java.util.Scanner;
import java.util.Stack;

public class CalculatorRPN {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите сначала числа через пробел! А после введите операций");
        System.out.println("Пример ввода: 1 2 3 * - ");

        String str = scan.nextLine();

        String[] strings = str.split(" ");              // создаём массив строк типа String, заполняем его с консоли и разделяем каждый элемент пробелом ("пробел")

        Stack<Double> stack = new Stack<Double>();            // создаём стэк типа Double

        for (int i = 0; i < strings.length; i++) {
            if (isNumber(strings[i])) {                       // ЕСЛИ isNumber (проверка, можно ли преобразовать элемент массива в число)
                stack.push(Double.parseDouble(strings[i]));   // push - запихнуть в stack и преобразовать в число типа double
            } else {                                          // ИНАЧЕ
                double tmp1 = stack.pop();                    // удаляем последний элемент stack и записываем его в переменную типа double tmp1
                double tmp2 = stack.pop();                    // удаляем (ПРЕД) последний элемент stack и записываем его в переменную типа double tmp1

                switch (strings[i]) {                         // в зависимости от текущего элемента массива, выполняем определённый кейс
                    case "+":
                        stack.push(tmp1 + tmp2);         // если + то запихиваем и складываем переменные tmp1 и tmp2 и результат запихиваем обратно в stack
                        break;                                // выход из switch/case

                    case "-":
                        stack.push(tmp2 - tmp1);
                        break;

                    case "*":
                        stack.push(tmp1 * tmp2);
                        break;

                    case "/":
                        stack.push(tmp1 / tmp2);
                        break;
                }
            }
        }


        if (!stack.empty()) {                                  // Проверка на пустоту stack'a. ЕСЛИ(stack не(!) пустой)
            System.out.println(stack.pop());                   // выведи и удали последний элемент stack
        } else {
            System.out.println("Ошибка! Stack пуст");
        }
    }


    private static boolean isNumber(String str) {               // Создаём метод isNumber. Можно ли преобразовать элемент массива в число
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
