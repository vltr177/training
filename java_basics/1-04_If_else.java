// Напишите программу, которая по введённым времени и скорости найдёт пройденный путь. Сначала вводится время движения, затем скорость.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int v = sc.nextInt();
    System.out.println( v * t ); 
    }
}

// С клавиатуры вводятся два числа. Выведите на экран большее из них.

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if (a > b) {
        System.out.println(a);
    }else{
        if (a <= b) {
            System.out.println(b);
        }
    }
    }
}

// С клавиатуры построчно вводятся три строки. Необходимо определить, все ли он равны. Если да, то вывести "Yes", в противном случае - "No".

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    String b = sc.nextLine();
    String c = sc.nextLine();
    boolean ab = a.equals(b);
    boolean bc = b.equals(c);
    if (ab && bc) {
        System.out.println("Yes");
    }else{
            System.out.println("No");
         }
    }
}

// Напишите программу, которая считывает 2 действительных числа и выводит их частное. Если это невозможно, то выводит слово "Error"


import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double a = sc.nextInt();
    double b = sc.nextInt();
    if (b != 0) {
        System.out.println(a/b);
    }else{
            System.out.println("Error");
        }
    }
}

/*
Красная Шапочка часто навещает свою бабушку. Но она очень боится, что рано или поздно ее бабушку опять навестит волк. Поэтому она решила договориться с Лесничим об охране бабушки. Лесничий согласился охранять бабушку за 10 пирожков.

Узнав об этом, волк сказал Красной Шапочке, что ей совершенно незачем тратить пирожки на Лесничего. За половину тех пирожков, которые Красная Шапочка несет бабушке, Волк пообещал не трогать ее.
Сегодня (26 ноября) в России отмечается день матери. Мама испекла несколько пирожков, и попросила Красную Шапочку отнести их бабушке. Требуется определить, сколько пирожков Красная Шапочка сможет донести до бабушки.
Входные данные
Вводится одно четное число - количество пирожков, которые испекла мама.
Выходные данные
Программа должна вывести  одно число - количество пирожков, которые Красная Шапочка сможет донести до бабушки.
*/

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Boolean x = n/2 < 10;
    if (x) {
        System.out.println(n/2);
    }else{
            System.out.println(n - 10);
        }
    }
}

/*
У Пети очень странные часы. Они считают время не так, как остальные - они отсчитывают количество секунд от начала суток.

Как-то раз Петя уснул, будильник, не сработал, но взглянув на часы, Петя не смог понять, успел ли он на уроки, или опоздал. Если Петя проснулся ровно в ту секунду, когда должен был, или раньше, то он успевает на учёбу.
Входные данные
На вход даётся 3 целых числа: h, m - время, в которое Пете надо было проснуться, и x - время, которое показывают его часы.
Выходные данные
Выведите слово "Успел", если Петя не проспал, или "Опоздал", если Петя не смог проснуться вовремя.
*/

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int m = sc.nextInt();
    int x = sc.nextInt();
    int time = (m * 60) + (h * 3600);
        
    Boolean alarm = x <= time;
        
    if (alarm) {
        System.out.println("Успел");
    }else{
            System.out.println("Опоздал");
        }
    }
}

//Вводится 3 целых числа, выведите большее из них

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    Boolean max_a = (a>b) && (a>c);
    Boolean max_b = (b>a) && (b>c);

if (max_a) {
    System.out.println(a);
}else{
    if (max_b) {
        System.out.println(b);
    }else{
        System.out.println(c);
        }
    }
}
}

//По данному году определите, является ли он високосным. Если забыли, какой год называют високосным, то вот вам ссылка: високосный год
// Если год Високосный, то выведите "Yes", если же нет, то выведете "No"

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    Boolean test1 = (a%4 == 0) && (a%100 !=0);
    Boolean test2 = (a%400 == 0);


if (test1 || test2) {
    System.out.println("Yes");
}else{
    System.out.println("No");
     }
}
}

// Две равные строки
// С клавиатуры построчно вводятся три строки. Если среди них есть ровно две равные строки то вывести "Yes", в противном случае - "No".

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    String b = sc.nextLine();
    String c = sc.nextLine();
    boolean ab = a.equals(b);
    boolean bc = b.equals(c);
    boolean ac = a.equals(c);
    boolean two = ab || bc || ac;
    boolean all = ab && bc;
        
    if ( two && !all ) {
        System.out.println("Yes");
    }else{
            System.out.println("No");
         }
    }
}

/* Шоколадка
Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек, если разрешается сделать один разлом по прямой между дольками (то есть разломить шоколадку на два прямоугольника).
Входные данные
Вводятся 3 числа: n, m и k; k не равно n × m. Гарантируется, что количество долек в шоколадке не превосходит 30000.
Выходные данные
Программа должна вывести слово YES, если возможно отломить указанное число долек, в противном случае вывести слово NO.
*/

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int s = n * m;
        Boolean piece = (k % n == 0) || (k % m == 0);
        Boolean part = (s - k >= m) || (s - k >= n);
        if (piece && part){
            System.out.println("YES");
            }
        else{
            System.out.println("NO");
            }
        }
    }
