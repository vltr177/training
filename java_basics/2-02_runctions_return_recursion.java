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
