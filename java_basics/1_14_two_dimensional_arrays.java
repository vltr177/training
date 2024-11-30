// Сумма массивов
// Вводится число n. Затем вводится 2 раза по n действительных чисел - два массива. Вывести на экран их сумму.

import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] array1 = new float[n];
        float[] array2 = new float[n];
        for (int i = 0; i < n; i++)
            array1[i] = sc.nextFloat();
        for (int i = 0; i < n; i++)
            array2[i] = sc.nextFloat();
        for (int i = 0; i < n; i++)
            System.out.println(array1[i] + array2[i]);
    }
}

//Таблица умножения
//Вводятся 2 натуральных числа: n и m. Выведите на экран таблицу умножения размером n*m через пробел.  
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];

        for (int i = 0; i<n; i++)
            for (int j = 0; j<m; j++)
                array[i][j] = (i+1)*(j+1);
        
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++)
                System.out.print(array[i][j]+" ");
            System.out.println();
        }
    }
}

//Нормальный вид
//Вводятся 2 натуральных числа: n и m. Затем вводится через пробел n*m целых чисел. Сохраните их в табличном виде и выведите на экран (разделитель - пробел).
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];

        for (int i = 0; i<n; i++)
            for (int j = 0; j<m; j++)
                array[i][j] = sc.nextInt();
        
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++)
                System.out.print(array[i][j]+" ");
            System.out.println();
        }
    }
}

/*Главная диагональ
Главной диагональю в таблице (правильнее говорить матрице) называют диагональ, идущую из верхнего левого угла в нижний правый.
Вводится число n. Выведите на экран матрицу размером n на n, у которой:
все элементы главной диагонали равны 1
все элементы, которые лежат ниже главной диагонали равны 2
все элементы, которые лежат выше главной диагонали равны 0.
Внутри строки между элементами должен находится пробел.*/
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i<n; i++)
            for (int j = 0; j<n; j++){
                if (i<j)
                    array[i][j] = 0;
                if (i==j)
                    array[i][j] = 1;
                if (i>j)
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
        Boolean flag = true;

        for (int i = 0; i<n; i++)
            for (int j = 0; j<n; j++)
                array[i][j] = sc.nextInt();

        for (int i = 0; i<n; i++)
            for (int j = 0; j<n; j++)
                if (i != j)
                    if (array[i][j] != array[j][i]){
                        flag = false;
                        break;
                    }
        if (flag)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}

// Минимальный элемент
// Сначала вводятся два натуральных числа n и m - количество строки и столбцов в двумерном массиве. Затем вводится сами элементы массива. Определите индексы минимального элемента этого двумерного массива. Гарантируется, что такой элемент единственный. Выведите в качестве ответа два целых числа через пробел.
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];

        for (int i = 0; i<n; i++)
            for (int j = 0; j<m; j++)
                array[i][j] = sc.nextInt();
        
        int min = 9999;
        int min_x = 0;
        int min_y = 0;
        for (int i = 0; i<n; i++)
            for (int j = 0; j<m; j++)
                if (array[i][j] < min){
                    min = array[i][j];
                    min_x = i;
                    min_y = j;
                }
        System.out.print(min_x + " " + min_y);
    }
}

/*Максимальная сумма
Дан зубчатый двумерный массив. необходимо определить номер строки с максимальной суммой, максимальную сумму и саму строку, которая даёт эту сумму.
Входные данные:
Вводится число n - количество строк зубчатого массива. Затем информация вводится следующими блоками: число k - количество элементов в строке и потом k элементов.
Выходные данные:
Выведите на экран номер строки с максимальной суммой и сумму на разных строках. На следующей строчке выведите саму строку, которая даёт эту сумму.*/
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k;
        int[][] array = new int[n][];

        for (int i = 0; i<n; i++){
            k = sc.nextInt();
            array [i] = new int[k];
            for (int j = 0; j<k; j++)
                array[i][j] = sc.nextInt();
        }

        int sum = 0;
        int sum_max = Integer.MIN_VALUE;
        int sum_max_row = 0;

        for (int i = 0; i<n; i++){
            for (int j = 0; j<array[i].length; j++)
                sum += array[i][j];
            if (sum > sum_max){
                sum_max = sum;
                sum_max_row = i;
            }
            sum = 0;
        }
            
        System.out.println(sum_max_row+1);
        System.out.println(sum_max);
        for (int j = 0; j<array[sum_max_row].length; j++)
            System.out.print(array[sum_max_row][j] + " ");
    }
}

// Поворот на 90
// Вводятся 2 натуральных числа: n и m. Затем вводится двумерный массив размером n*m. Поверните его на 90 градусов по часовой стрелке и выведите на экран (через пробел).

import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];

        for (int i = 0; i<n; i++)
            for (int j = 0; j<m; j++)
                array[i][j] = sc.nextInt();

        int[][] array2 = new int[m][n];    
        for (int i = 0; i<m; i++)
            for (int j = 0; j<n; j++)
                array2[i][j] = array[n-j-1][i];
        
        for (int i = 0; i<m; i++){
            for (int j = 0; j<n; j++){
                System.out.print(array2[i][j] + " ");
            }
        System.out.println();
        }
    }
}

// Новый поворот
// Вводятся 2 натуральных числа:  n и m. Затем вводится двумерный массив размером n*m. Поверните его на 90 градусов против часовой стрелке и выведите на экран (через пробел).
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];

        for (int i = 0; i<n; i++)
            for (int j = 0; j<m; j++)
                array[i][j] = sc.nextInt();

        int[][] array2 = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array2[array[i].length - j - 1][i] = array[i][j];
            }
        }
        
        for (int i = 0; i<m; i++){
            for (int j = 0; j<n; j++){
                System.out.print(array2[i][j] + " ");
            }
        System.out.println();
        }
    }
}

// Что он нам несёт?
// Вводится натуральное число n. Затем вводится двумерный массив размером n*n. Отобразите его относительно главной диагонали (из левого верхнего угла до правого нижнего) и выведите на экран (через пробел).
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i<n; i++)
            for (int j = 0; j<n; j++)
                array[i][j] = sc.nextInt();

        int[][] array2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array2[i][j] = array[j][i];
            }
        }
        
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                System.out.print(array2[i][j] + " ");
            }
        System.out.println();
        }
    }
}

/* Магический квадрат
Напишите программу, которая проверяет, является ли квадратная матрица магическим квадратом?
Входные данные
Программа получает на вход число n < 11, являющееся числом строк и столбцов в массиве. Далее во входном потоке идет n строк по n чисел, являющихся элементами массива.
Выходные данные
Программа должна выводить слово YES для магического квадрата и слово NO для не магического.*/
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array [][] = new int[n][n];
        int ett = 0;
        int ett1 = 0;
        int ind = 0;
        int ind1 = 0;
        int k =0;
        int k1 =0;

        for (int i = 0; i<n ; i++){
            for (int j = 0; j<n ; j++){
                array[i][j] = sc.nextInt();
                ett = array[i][j]+ ett;
            }
            if (ett == k){
                ind = ind+1;
            }
            k = ett;
            ett = 0;
        }

        for (int i = 0; i<n ; i++){
            for (int j = 0; j<n ; j++){
                ett1 = array[j][i] + ett1;
                if (ett1 == k1){
                    ind1 = ind1+1;
                }
            }
            k1 = ett1;
            ett1 = 0;
        }
        
        if (ind == n-1 && ind1 == n-1 ){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
