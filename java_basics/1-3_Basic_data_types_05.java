/*
ВАЛЛ-И хочет по электронным часам, показывающим часы и минуты,  узнать сколько времени в минутах прошло от начала суток.

Входные данные:
два числа: часы (0 <= h < 24) и минуты (0 <= m < 60)

Выходные данные:
время от начала суток в минутах
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int m = sc.nextInt();
    System.out.println( ( 60 * h)  + m ); 
    }
}
