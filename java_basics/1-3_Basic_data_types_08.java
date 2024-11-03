/*
ВАЛЛ-И встретил n детей и хочет разделить между ними k яблок так, чтобы каждому досталось поровну. Не делящийся остаток он собирается отнести ЕВЕ. Сколько яблок достанется каждому ребенку? Сколько яблок получит ЕВА?

Результат выведите в одной строке через пробел в указанном порядке.

Входные данные:

два натуральных числа: 

n - количество детей
k - количество яблок
Выходные данные:

выведите ответ на задачу
/*

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int childrens = k / n;
    int eva = k - (childrens * n);
    System.out.println( childrens + " " + eva ); 
    }
}
