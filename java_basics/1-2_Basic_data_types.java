// Создайте две переменные: целого типа a и действительного b, равные 5 и 0.4 соответственно. Выведите построчно на экран их сумму, разность, произведение и частное.

class MyProgram{
    public static void main(String[] args){
    int a = 5;
    float b = 0.4f;
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(a/b);
    }
}

// Напишите программу, которая считывает три целых числа и выводит их произведение. 

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a * b * c);
    }
}

/*
Напишите программу, которая считывает целое число и выводит текст, аналогичный приведенному в примере. Пробелы, знаки препинания, заглавные и строчные буквы важны!
Вводится целое число, по модулю не превосходящее 10000.
Выведите сначала фразу "The next number for the number ", затем введенное число, затем слово " is ", окруженное пробелами, затем формулу для следующего за введенным числа, наконец, знак точки без пробела. Аналогично в следующей строке для предыдущего числа.
*/

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println("The next number for the number " + a + " is " + (a+1) + ".");
    System.out.println("The previous number for the number " + a + " is " + (a-1) + ".");
    }
}

// На одной строчке через пробел записаны два целых числа: длина и ширина прямоугольника. Вычислите его площадь и периметр (именно в таком порядке). Результат выведите на разных строках.

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(a * b);
    System.out.println(2 * (a + b));
        
    }
}

// Дано целое число n. Выведите следующее за ним четное число. При решении этой задачи нельзя использовать условную инструкцию if и циклы. Подсказка: Подумайте, что будет оставаться в остатке при делении на 2 у чётных и у нечётных чисел.

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println(a + 2 - a%2);     
    }
} 

/* Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить за n пирожков.
Программа получает на вход три числа: a, b, n.
Программа должна вывести два числа: стоимость покупки в рублях и копейках.
*/

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int n = sc.nextInt();
    System.out.print( (n*(a*100 + b) / 100) + " ");
    System.out.println(n*(a*100 + b) % 100);
    }
} 

// Дано произвольное положительное натуральное число. Найдите его последнюю цифру.

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println(a % 10);
    }
} 

// Дано трехзначное число. Найдите сумму его цифр.

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println( (a%10) + (a%100/10) + (a%1000/100) );
    }
} 

/* Улитка ползёт по вертикальному шесту высотой h метров, поднимаясь за день на a метров, а за ночь спускаясь на b метров. На какой день улитка доползёт до вершины шеста?
Программа получает на вход натуральные числа h, a, b. Гарантируется, что a>b.
*/ Программа должна вывести одно натуральное число.

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int v = a - b;
    int g = h - b;
    System.out.println((g + v - 1) / v);   
    }
}
