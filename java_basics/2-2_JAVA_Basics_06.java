// Дано целое число n. Выведите следующее за ним четное число. При решении этой задачи нельзя использовать условную инструкцию if и циклы. Подсказка: Подумайте, что будет оставаться в остатке при делении на 2 у чётных и у нечётных чисел.

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println(a + 2 - a%2);     
    }
} 
