/*
ВАЛЛ-И называет натуральное число, а ЕВА записывает 3 последовательных числа, следующих после него. Напишите программу, которая выводит числа  ЕВЫ через черточку.
Входные данные:
натуральное число
Выходные данные:
выведите ответ на задачу
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    System.out.println( (x+1) + "-" + (x+2) + "-" + (x+3) ); 
    }
}
