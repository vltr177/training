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


/*Исключающее ИЛИ
Напишите функцию xor реализующую функцию "Исключающее ИЛИ" двух логических переменных x и y. Функция Xor должна возвращать true, если ровно один из ее аргументов x или y, но не оба одновременно равны true.
Входные данные
Вводится 2 числа - x и y (x и y равны 0 или 1, 0 соответствует значению false, 1 соответствует значению true).
Выходные данные
Необходимо вывести false или true - значение функции от x и y.
Содержание функции main менять запрещено. */
import java.util.Scanner;
class Programm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean f = sc.nextInt() != 0;
        boolean s = sc.nextInt() != 0;
        System.out.println(xor(f, s));
    }
    static boolean xor (boolean f, boolean s){
        if ((f||s) & (f!=s))
            return true;
        else
            return false;
    }
}

/*Голосование
Напишите "функцию голосования" election,  возвращающую то значение (true или false), которое среди значений ее аргументов x, y, z встречается чаще.
Входные данные
Вводится 3 числа - x, y и z (x, y и z равны 0 или 1, 0 соответствует значению false, 1 соответствует значению true).
Выходные данные
Необходимо вывести  значение функции от x, y и z.
Содержание функции main менять запрещено.*/
import java.util.Scanner;
class Programm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean f = sc.nextInt() == 1 ? true : false;
        boolean s = sc.nextInt() == 1 ? true : false;
        boolean t = sc.nextInt() == 1 ? true : false;
        System.out.println(election(f, s, t));
    }
    static boolean election(boolean f, boolean s, boolean t) {
        if ( (f||s) & (s||t) & (t||f) )
            return true;
        else
            return false;
    }
}

/*Сколько цифр
Дана строка, содержащая цифры и английские буквы (большие и маленькие). Напишите функцию digit_count, которая найдёт количество цифр в этой строке.
Входные данные
Вводится строка ненулевой длины. Известно также, что длина строки не превышает 1000 знаков.
Выходные данные
Выведите количество цифр, которые присутствуют в строке.
Содержание функции main менять запрещено.*/
