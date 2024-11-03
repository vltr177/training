/*
ВАЛЛ-И случайно забрел на ферму, где увидел лошадей и гусей. Лошадей он насчитал h штук, гусей - g штук. Составьте программу, которая бы помогла ВАЛЛ-И узнать количество ног обитателей фермы.

Входные данные:

h - количество лошадей
g - количество гусей
Выходные данные:

выведите ответ на задачу
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int g = sc.nextInt();
    System.out.println( (2 * g) + (4 * h) ); 
    }
}
