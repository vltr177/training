/*
ВАЛЛ-И очень любит читать. В его книге n страниц и каждый день он читает по s страниц. Составьте программу, которая считает, сколько страниц останется ВАЛЛ-И прочитать через d дней.

Входные данные:
Вводятся три целых неотрицательных числа:

n - количество страниц в книге
s  - количество страниц, которые прочитывает ВАЛЛ-И каждый день
d - количество дней
Выходные данные:
выведите на экран ответ на задачу: сколько страниц останется прочитать ВАЛЛ-И через d дней.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int s = sc.nextInt();
    int d = sc.nextInt();
    int read = d * s;
    System.out.println( n - read ); 
    }
}
