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

/*Вывести четные элементы
Дан массив, состоящий из целых чисел. Напишите программу, которая выводит те элементы массива, которые являются чётными числами.
Входные данные
Сначала задано число N — количество элементов в массиве (1 ≤ N ≤ 100). Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.
Выходные данные
Необходимо вывести все четные элементы массива (то есть те элементы, которые являются четными числами).*/
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++)
            array[i] = sc.nextInt();
        for (int i = 0; i < array.length; i++)
            if (array[i]%2 == 0)
                System.out.print(array[i] + " ");
    }
}

/*Соседи одного знака
Дан массив, состоящий из целых чисел. Напишите программу, которая определяет, есть ли в массиве пара соседних элементов с одинаковыми знаками.
Входные данные
Сначала задано число N — количество элементов в массиве (2 ≤ N ≤ 10000). Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.
Выходные данные
Необходимо вывести слово YES, если существует пара соседних элементов с одинаковыми знаками. В противном случае следует вывести слово NO.*/
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean flag = false;
        int[] array = new int[N];
        for (int i = 0; i < N; i++)
            array[i] = sc.nextInt();
        for (int i = 1; i < array.length; i++)
            if (Math.signum(array[i-1]) == Math.signum(array[i])){
                flag = true;
                break;
            }
        if (flag)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}

/*Больше соседей
Дан массив, состоящий из целых чисел. Напишите программу, которая в данном массиве определит количество элементов, у которых есть два соседних и, при этом, оба соседних элемента меньше данного.
Входные данные
Сначала задано число N — количество элементов в массиве (3 ≤ N ≤ 100). Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.
Выходные данные
Необходимо вывести количество элементов массива, у которых есть два соседа и которые при этом строго больше обоих своих соседей.*/
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int[] array = new int[N];
        for (int i = 0; i < N; i++)
            array[i] = sc.nextInt();
        for (int i = 1; i < array.length - 1; i++)
            if ((array[i] > array[i-1]) & (array[i] > array[i+1]))
                count +=1;
        System.out.print(count);
    }
}

/*Сортировка массива
Дан массив, состоящий из целых чисел. Напишите программу, которая отсортирует его по возрастанию.
Входные данные
Сначала задано число N — количество элементов в массиве (1 ≤ N ≤ 100). Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.
Выходные данные
Необходимо вывести отсортированный по возрастанию массив.
Комментарий
Существует ооооочень большое количество различных сортировок. Самая простая из них - сортировка "пузырьком".*/
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++)
            array[i] = sc.nextInt();
        for (int i = 1; i < N; i++){
            boolean issorted = true;
            for (int j = 0; j < N-i; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    issorted = false;
                }
            }
        if (issorted)
            break;
        }
        for (int i = 0; i < N; i++)
            System.out.print(array[i] + " ");
    }
}

