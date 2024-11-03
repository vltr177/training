/*
Робот ВАЛЛ-И любит играть в такую игру: он называет натуральное число, а ЕВА берет последнюю цифру этого числа и увеличивает на n. Какое число получила ЕВА?

Входные данные:
программа получает на вход два натуральных числа:
x - число, которое загадывает ВАЛЛ-И
n - на сколько увеличивается последняя цифра
Выходные данные:
выведите ответ на задачу
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();
    int number = (x % 10) + n;
    System.out.println( number ); 
    }
}
