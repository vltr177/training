// Площадь поверхности параллелепипеда
// Напишите функцию area, которая принимает на вход 3 натуральных числа - ширину, высоту и длину прямоугольного параллелепипеда, а находит и выводит на экран площадь его поверхности. Содержание функции main менять запрещено.
import java.util.Scanner;

class Programm{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        area(a, b, c);
    }

}

// Площадь поверхности параллелепипеда
// Напишите функцию area, которая принимает на вход 3 натуральных числа - ширину, высоту и длину прямоугольного параллелепипеда, а находит и выводит на экран площадь его поверхности. Содержание функции main менять запрещено.
import java.util.Scanner;
class Programm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        area(a, b, c);
    }
    static void area(int a, int b, int c){
        System.out.println(2*(a*b + b*c + c*a));
    }
}
// Сила Архимеда
// Напишите функцию arhimed, которая принимает на вход 2 натуральных числа: плотность жидкости (кг/м^3), в которую погружают тело и объём тела (м^3). Функция должна именно вернуть значение силы Архимеда. Считать g = 10 H/кг. Содержание функции main менять запрещено.

import java.util.Scanner;
class Programm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ro = sc.nextInt();
        int V = sc.nextInt();
        int F = arhimed(ro, V);
        System.out.println("F = " + F +"H");
    }
    static int arhimed(int ro, int V){
        int g = 10;
        return g * ro * V;
    }
}

// Есть ли 0?
// Напишите функцию find_0, которая принимает на вход двумерный массив целых чисел и возвращает в ответ индекс первой строчки, на которой встретился 0. Если такой строки нет, то возвращает значение -1. Содержание функции main менять запрещено.
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];

        for (int i = 0; i<n; i++)
            for (int j = 0; j<m; j++)
                array[i][j] = sc.nextInt();

        int[][] array2 = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array2[array[i].length - j - 1][i] = array[i][j];
            }
        }
        
        for (int i = 0; i<m; i++){
            for (int j = 0; j<n; j++){
                System.out.print(array2[i][j] + " ");
            }
        System.out.println();
        }
    }
}

/* Отформатировать российский номер телефона
Напишите функцию format_number, которая  будет принимать в качестве аргумента строку, которая должна содержать телефонный номер. И выводить его по образцу: 8 (987) 654-32-10.
Телефонный номер должен состоять ровно из 11 цифр. Если в введённой строке больше или меньше символов, то функция должна вывести на экран "Неверное число символов".
Если в номере встретится хотя бы один символ, который не является цифрой, то функция должна вывести на экран "Не все символы являются цифрами"
Российские номера начинаются только с 8 (для простоты задачи). Если номер начинается не с 8, то функция должна вывести на экран "Это не российский номер телефона"
Если с номером всё в порядке, то функция должна вывести на экран номер телефона по указанному выше образцу.
Содержание функции main менять запрещено.
Примечание: проверка условий должна выполняться в том же порядке, что и перечисленные выше условия. То есть, если в строке и не 11 символов и присутствует буква, то программа должна вывести: "Неверное число символов". */
import java.util.Scanner;

class Programm{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        format_number(number);
    }
    static void format_number(String number){
        if (number.length() != 11){
            System.out.println("Неверное число символов");
            return;
        }
        char[] symbols = number.toCharArray();
        for (char symbol : symbols)
            if (Character.isLetter(symbol)){
                System.out.println("Не все символы являются цифрами");
                return;
            }
        if (symbols[0] != '8') {
            System.out.println("Это не российский номер телефона");
            return;
        }
        System.out.println(symbols[0] + " (" + number.substring(1,4) + ") " + number.substring(4,7) + "-" + number.substring(7,9) + "-" + number.substring(9,11));
    }
}

// Факториал
// Напишите рекурсивную функцию factorial, которая принимает как аргумент одно неотрицательное целое число и возвращает его значение. Напоминаю, что 0! = 1.  Содержание функции main менять запрещено.
import java.util.Scanner;

class Programm{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
    static int factorial(int n){
        if (n==0)
            return 1;
        return factorial(n-1) * n;
    }
}
