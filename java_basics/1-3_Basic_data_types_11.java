/*
ВАЛЛ-И собирается съездить на уборку в соседний город и хочет рассчитать время на дорогу. По карте он определил расстояние s в километрах и настроил свою скорость равной v км/ч. Составьте программу, которая поможет ВАЛЛ-И определять время, проводимое в пути.

Входные данные:
s - расстояние
v - скорость
Выходные данные:
выведите ответ на задачу
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float s = sc.nextInt();
    int v = sc.nextInt();    
    float time = s / v;
    System.out.println( time ); 
    }
}
