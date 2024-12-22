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

// Число секунд
// Напишите функцию second_count, которая принимает как целочисленные аргументы количество дней, часов, минут и секунд, которые прошли со времён какого - либо момента. Ваша функция должна вернуть одно целое число - количество секунд, которое прошло с того момента.  Содержание функции main менять запрещено.
import java.util.Scanner;
class Programm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        System.out.println("Секунд прошло: " + second_count(d, h, m, s));
    }
    static int second_count(int d, int h, int m, int s){
        return d*24*60*60 + h*60*60 + m*60 + s;
    }
}

// Первая строка, сумма которой кратна 7?
// Напишите функцию find_line7, которая принимает на вход двумерный массив целых чисел и возвращает в ответ индекс первой строчки, сумма элементов которой кратна 7. Если такой строки нет, то возвращает значение -1. Содержание функции main менять запрещено.
import java.util.Scanner;
class Programm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] mas = new int[n][];
        for (int i = 0; i < n; i++){
            String line = sc.nextLine();
            String[] numbers = line.split(" ");
            int[] a = new int[numbers.length];
            for (int j = 0; j < numbers.length; j++)
                a[j] = Integer.parseInt(numbers[j]);
            mas[i] = a;
        }
        int ans = find_line7(mas);
        if (ans != -1)
            System.out.println("Сумма строки под номером " + (ans + 1) + " кратна 7");
        else
            System.out.println("Таких строк нет");
    }
    static int find_line7 (int [][] mas){
        for (int i = 0; i < mas.length; i++) {
            int sum = 0;
            for (int j = 0; j < mas[i].length; j++) {
                sum += mas[i][j];
            }
            if (sum % 7 == 0)
                return i;
        }
        return -1;
    }
}

/* Король
Требуется определить, бьет ли король, стоящий на клетке с указанными координатами (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке. Напишите функцию king_step, которая принимает 4 целых числа  - сначала координаты клетки, в которой стоит король, а потом координаты клетки, в которой стоит фигура, которую он хочет побить. Ваша функция должна вывести на экран:
1, если координаты короля некорректны;
2, если координаты фигуры некорректны;
3, если координаты совпадают;
"YES"/"NO" - ответ на задачу, если всё в порядке.
Содержание функции main менять запрещено. */
import java.util.Scanner;
class Programm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        king_step(x1, y1, x2, y2);
    }
    static void king_step(int x1, int y1, int x2, int y2) {
        if (x1 < 1 || x1 > 8 || y1 < 1 || y1 > 8){
            System.out.println(1);
            return;
        }
        if (x2 < 1 || x2 > 8 || y2 < 1 || y2 > 8){
            System.out.println(2);
            return;
        }
        if (x1 == x2 & y1 == y2){
            System.out.println(3);
            return;
        }
        if ( Math.abs(x2-x1)<=1 & Math.abs(y2-y1)<=1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

/* Функция Аккермана
В теории вычислимости важную роль играет функция Аккермана A(m, n), определенная следующим образом:
Напишите рекурсивную функцию akkerman, которая принимает как аргумент два неотрицательных целых числа и возвращает значение этой функции.  Содержание функции main менять запрещено. */
import java.util.Scanner;

class Programm{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(akkerman(m, n));
    }
    static int akkerman(int m, int n) {
        if (m == 0)
            return n + 1;
        if (m > 0 & n == 0)
            return akkerman(m - 1, 1);
        return akkerman(m - 1, akkerman(m, n - 1));
    }
}

// Выпуклый многоугольник
// Вводится число n (n >= 3), затем даются координаты n точек построчно. Найдите периметр этого многоугольника и его площадь. Выведите ответ построчно. Округлите ваш ответ до сотых.
import java.util.Scanner;
class Programm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] mas = new int [n+1][2];
            for (int i = 0; i < n; i++) {
                mas[i][0] = sc.nextInt();
                mas[i][1] = sc.nextInt();
            }
        mas[n][0] = mas[0][0];
        mas[n][1] = mas[0][1];
        geometry (mas);
    }
    static void geometry (int [][] mas){
        double p = 0;
        double s = 0;
        double area1 = 0;
        double area2 = 0;
        for (int i=1; i < mas.length; i++){
            p += Math.sqrt( Math.pow(mas[i][0] - mas[i-1][0],2) + Math.pow(mas[i][1] - mas[i-1][1],2) );
            area1 += mas[i-1][0] * mas[i][1];
            area2 += mas[i-1][1] * mas[i][0];
        }
        s = Math.abs((area1-area2)/2);
        System.out.println(Math.round(p*100)/100.0);
        System.out.println(Math.round(s*100)/100.0);
    }
}

// На вершине лесенки, содержащей N ступенек, находится мячик, который начинает прыгать по ним вниз, к основанию. Мячик может прыгнуть на следующую ступеньку, на ступеньку через одну или через 2. 
//(То есть, если мячик лежит на 8-ой ступеньке, то он может переместиться на 5-ую, 6-ую или 7-ую.) Определить число всевозможных "маршрутов" мячика с вершины на землю.

Подсказка: Если ваша программа работает слишком долго, то может использовать кеш?
