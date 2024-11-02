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
