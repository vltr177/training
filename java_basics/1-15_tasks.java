/*Чётные индексы
Дан массив, состоящий из целых чисел. Нумерация элементов начинается с 0. Напишите программу, которая выведет элементы массива, номера которых четны (0, 2, 4...).
Входные данные
Сначала задано число N — количество элементов в массиве (1 ≤ N ≤ 100). Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.
Выходные данные
Необходимо вывести все элементы массива с чётными номерами.*/
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++)
            array[i] = sc.nextInt();
        for (int i = 0; i < array.length; i++)
            if (i%2 == 0)
                System.out.print(array[i] + " ");
    }
}
