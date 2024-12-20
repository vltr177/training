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
