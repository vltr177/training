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

/*Побочная диагональ
Дано число n (n < 10). Создайте массив n×n и заполните его по следующему правилу:
- числа на диагонали, идущей из правого верхнего в левый нижний угол, равны 1;
- числа, стоящие выше этой диагонали, равны 0;
- числа, стоящие ниже этой диагонали, равны 2.
Входные данные
Программа получает на вход число n (1 < n).
Выходные данные
Необходимо вывести  полученный массив. Числа разделяйте одним пробелом.*/

import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i<n; i++)
            for (int j = 0; j<n; j++){
                if  (i + j < n - 1)
                    array[i][j] = 0;
                if  (i + j == n - 1)
                    array[i][j] = 1;
                if  (i + j > n - 1)
                    array[i][j] = 2;
            }
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++)
                System.out.print(array[i][j]+" ");
            System.out.println();
        }
    }
}

/*Симметричная ли матрица?
Проверьте, является ли двумерный массив симметричным относительно главной диагонали. Главная диагональ — та, которая идёт из левого верхнего угла двумерного массива в правый нижний.
Входные данные
Программа получает на вход число n < 100, являющееся числом строк и столбцов в массиве. Далее во входном потоке идет n строк по n чисел, являющихся элементами массива.
Выходные данные
Программа должна выводить слово YES для симметричного массива и слово NO для несимметричного.*/
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        boolean flag = true;
        for (int i = 0; i<n; i++)
            for (int j = 0; j<n; j++){
                array[i][j] = sc.nextInt();
            }
        for (int i = 0; i<n; i++)
            for (int j = 0; j<n; j++)
                if ((i != j) & (array[i][j] != array[j][i])){
                    flag = false;
                    break;
                }
        if (flag)
            System.out.print("YES");
        else
            System.out.print("NO");            
    }
}

/*Магический квадрат
Напишите программу, которая проверяет, является ли квадратная матрица магическим квадратом?
Входные данные
Программа получает на вход число n < 11, являющееся числом строк и столбцов в массиве. Далее во входном потоке идет n строк по n чисел, являющихся элементами массива.
Выходные данные
Программа должна выводить слово YES для магического квадрата и слово NO для не магического.*/
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        int sum1 = 0, sum2 = 0, sum3 = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                array[i][j] = sc.nextInt();
                if(i < 1) sum1 += array[i][j];
                if(j < 1) sum2 += array[i][j];
            }
            sum3 += array[i][i];
        }
        sc.close();
        System.out.println((sum1 == sum2 && sum2 == sum3) ? "YES" : "NO");
    }
}

/* Метание молота
В метании молота состязается n спортcменов. Каждый из них сделал m бросков. Победителем соревнований объявляется тот спортсмен, у которого максимален наилучший результат по всем броскам.
Таким образом, программа должна найти значение максимального элемента в данном массиве, а также его индексы (то есть номер спортсмена и номер попытки).
Входные данные
Программа получает на вход два числа n и m, являющиеся числом строк и столбцов в массиве. Далее во входном потоке идет n строк по m чисел, являющихся элементами массива.
Выходные данные
Программа выводит значение максимального элемента, затем номер строки и номер столбца, в котором он встречается. Если в массиве несколько максимальных элементов, то нужно вывести минимальный номер строки, в которой встречается такой элемент,
а если в этой строке таких элементов несколько, то нужно вывести минимальный номер столбца. Не забудьте, что все строки и столбцы нумеруются с 0. */
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];
        int max = 0, max_row = 0, max_col = 0;
        
        for (int i = 0; i<n; i++)
            for (int j = 0; j<m; j++)
                array[i][j] = sc.nextInt();

        for (int i = 0; i<n; i++)
            for (int j = 0; j<m; j++)
                if (array[i][j] > max){
                    max = array[i][j];
                    max_row = i;
                    max_col = j;
                }

        System.out.println(max);
        System.out.print(max_row + " " + max_col);
    }
}

