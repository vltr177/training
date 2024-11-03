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
