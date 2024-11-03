/*
ВАЛЛ-И за 1 день выучивает n иностранных слов. Составьте программу, которая рассчитает, сколько иностранных слов выучит робот за d дней.

Входные данные:

n - количество слов
d - количество дней
Выходные данные:

выведите ответ на задачу
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    System.out.println( n * d ); 
    }
}
