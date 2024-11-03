/*

ВАЛЛ-И и ЕВА решили встретиться и выехали навстречу друг другу. Скорость ВАЛЛ-И составляет x км/ч, а ЕВЫ - y км/ч. Когда они встретились, то ВАЛЛ-И сообщил, что был в пути t часов, а ЕВА сказала, что потратила на дорогу m часов. Составьте программу, которая бы вычислила, какое расстояние было между ВАЛЛ-И и ЕВОЙ в момент их отправления.

Входные данные:
x - скорость ВАЛЛ-И
y - скорость ЕВЫ
t - время ВАЛЛ-И
m - время ЕВЫ
Выходные данные:
выведите ответ на задачу
*/



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int t = sc.nextInt();
    int m = sc.nextInt();
    int s1 = x * t;
    int s2 = y * m;
    System.out.println( s1 + s2 ); 
    }
}
