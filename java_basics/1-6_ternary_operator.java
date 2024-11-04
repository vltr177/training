// Вам есть 21?
// Вася приехал в Америку и он оооооочень любит кофе. В Америке приобрести этот напиток можно лишь лицам достигшим  возраста 21 год. Напишите программу, которая считает возраст Васи и выведет ответ ("Да"/"Нет") на вопрос: попьёт ли Вася сегодня кофе? 

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String coffe = a > 20 ? "Да" : "Нет";
        System.out.println(coffe);
    }
}

// Гипотенуза
// Вводится два целых числа - длины катетов прямоугольного треугольника. Найдите гипотенузу этого треугольника. Если вы не знаете, как это сделать, то вот вам полезная ссылка

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = Math.sqrt( Math.pow (a,2) + Math.pow (b,2));
        System.out.println(c);
    }
}

// Треугольник
// Вводятся три целых числа. Необходимо определить, существует ли треугольник с такими сторонами. В ответ выведите "Yes"/"No".

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Boolean test_a = a < b+c;
        Boolean test_b = b < a+c;
        Boolean test_c = c < b+a;
        System.out.println( test_a && test_b && test_c ? "Yes" : "No");
    }
}

/* Координатные четверти
Даны координаты двух точек на плоскости, требуется определить, лежат ли они в одной координатной четверти или нет (все координаты отличны от нуля).
Входные данные
Вводятся 4 числа: координаты первой точки (x1, y1) и координаты второй точки (x2, y2).
Выходные данные
Программа должна вывести слово YES, если точки находятся в одной координатной четверти, в противном случае вывести слово NO.
*/

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double x1 = sc.nextDouble();
        Double y1 = sc.nextDouble();
        Double x2 = sc.nextDouble();
        Double y2 = sc.nextDouble();
        if ((Math.signum(x1) == Math.signum(x2)) && (Math.signum(y1) == Math.signum(y2))){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}

/* Ладья
Требуется определить, бьет ли ладья, стоящая на клетке с указанными координатами (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке.
Входные данные
Вводятся четыре числа: координаты ладьи (два числа) и координаты другой фигуры (два числа), каждое число вводится в отдельной строке. Координаты - целые числа в интервале от 1 до 8.
Выходные данные
Требуется вывести слово YES, если ладья сможет побить фигуру за 1 ход и NO - в противном случае.
*/

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println( x1 == x2 || y1 == y2 ? "YES" : "NO");
    }
}

/* Слон
Требуется определить, бьет ли слон, стоящий на клетке с указанными координатами (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке.
Входные данные
Вводятся четыре числа: координаты слон (два числа) и координаты другой фигуры (два числа), каждое число вводится в отдельной строке. Координаты - целые числа в интервале от 1 до 8.
Выходные данные
Требуется вывести слово YES, если слон сможет побить фигуру за 1 ход и NO - в противном случае.
*/

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println( Math.abs(x2 - x1) == Math.abs(y2 - y1) ? "YES" : "NO");
    }
}

/*Конь
Требуется определить, бьет ли конь, стоящий на клетке с указанными координатами (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке.
Входные данные
Вводятся четыре числа: координаты коня (два числа) и координаты другой фигуры (два числа), каждое число вводится в отдельной строке. Координаты - целые числа в интервале от 1 до 8.
Выходные данные
Требуется вывести слово YES, если конь сможет побить фигуру за 1 ход и NO - в противном случае.
*/

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int ch_x = Math.abs(x2 - x1);
        int ch_y = Math.abs(y2 - y1);
        System.out.println( ( ch_x == 2 && ch_y == 1 ) || ( ch_x == 1 && ch_y == 2 ) ? "YES" : "NO");
    }
}

/* Ферзь
Требуется определить, бьет ли ферзь, стоящий на клетке с указанными координатами (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке.
Входные данные
Вводятся четыре числа: координаты ферзь (два числа) и координаты другой фигуры (два числа), каждое число вводится в отдельной строке. Координаты - целые числа в интервале от 1 до 8.
Выходные данные
Требуется вывести слово YES, если слон сможет побить фигуру за 1 ход и NO - в противном случае.

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        Boolean check1 = (x1 == x2) || (y1 == y2);
        Boolean check2 = Math.abs(x2 - x1) == Math.abs(y2 - y1);
        System.out.println( check1 || check2 ? "YES" : "NO");
    }
}

