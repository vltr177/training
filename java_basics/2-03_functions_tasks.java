/*Минимум из 4 чисел
Напишите функцию int min (int a, int b, int c, int d) , находящую наименьшее из четырех данных чисел и возвращающую ответ.
Входные данные
Вводится четыре числа.
Выходные данные
Необходимо вывести  наименьшее из 4-х данных чисел.
Содержание функции main менять запрещено.*/
import java.util.Scanner;

class Programm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(min(a, b, c, d));
    }
    static int min(int a, int b, int c, int d){
        int min = a;
        int [] mas = {b, c, d};
        for (int x: mas){
            if (x < min)
                min = x;
        }
        return min;
    }
}
