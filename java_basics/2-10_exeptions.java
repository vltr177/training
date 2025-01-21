/*Простой калькулятор
Пользователь вводит одну строку, в которой должно быть записано простое арифметическое выражение вида "a <операция> b", где a и b - какие-то действительные числа, а операция - один из символов "+", "-", "*", "/". Ваша задача - выполнить вычисление, если это возможно. Гарантируется, что в введённой строке ровно 2 пробела (значение пробел значение пробел значение) В результате работы могут произойти различные ошибки. Их нужно обработать следующим образом: 

Если одно из чисел не является числом, то вывести на экран "Error! Not number"
Если вместо знака операции было введено любое другое значение, то выведите "Operation Error!"  
Если произошла попытка деления на ноль, то выведите на экран "Error! Division by zero"
Обрабатывать исключения необходимо в указанном выше порядке.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        double a = 0, b = 0;
        boolean flag = true;
        try {
            a = Double.parseDouble(s[0]);
            b = Double.parseDouble(s[2]);
        } catch (NumberFormatException ex) {
            System.out.println("Error! Not number");
            flag = false;
            return;
        }
        if ("+-*/".contains(s[1]) && flag) {
            switch (s[1]) {
                case "+": {
                    System.out.println(a + b);
                    break;
                }
                case "-": {
                    System.out.println(a - b);
                    break;
                }
                case "*": {
                    System.out.println(a * b);
                    break;
                }
                case "/": {
                    try {
                        if(b == 0.0)
                            System.out.println("Error! Division by zero");
                        else
                            System.out.println(a / b);
                    } catch (ArithmeticException ex) {
                        System.out.println("Error! Division by zero");
                    }
                    break;
                }
            }
        } else
            System.out.println("Operation Error!");
    }
}
