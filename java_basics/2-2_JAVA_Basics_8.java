// Дано произвольное положительное натуральное число. Найдите его последнюю цифру.

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println(a % 10);
    }
} 
