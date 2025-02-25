/* Считать 6 строк и заполнить ими массив strings.
Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null"). */

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        strings = new String[6];
        String[] copy = new String[6];
        for (int i = 0; i < 6; i++) {
            strings[i] = console.nextLine();
            copy[i] = strings[i];
        }
        for (int i = 0; i < copy.length; i++) {
            for (int j = i + 1; j < copy.length; j++) {
                if (copy[i].equals(copy[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}

//Создай треугольный массив, где значение каждого элемента — это сумма его индексов.
/* 
Треугольный массив
*/

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        for (int i = 0; i < result.length; i++)
            result [i] = new int[i+1];
        for (int i = 0; i < result.length; i++){
            for (int j = 0; j < result[i].length; j++){
                result[i][j] = i + j;
            }
        }
        for (int i = 0; i < result.length; i++){
            for (int j = 0; j < result[i].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/* Двумерный массив — это массив массивов, то есть в каждой его ячейке находится ссылка на некий массив.
Но гораздо проще его представить в виде таблицы, у которой задано количество строк (первое измерение) и количество столбцов (второе измерение). В этой задаче мы будем создавать такой массив.*/
import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        multiArray = new int[n][];
        for (int i = 0; i < multiArray.length; i++)
            multiArray[i] = new int[console.nextInt()];
    }
}

// В методе main(String[]) выведи на экран все числа из трехмерного массива multiArray.
/* 
Создаем мультимассив
*/

public class Solution {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        for (int a = 0; a < multiArray.length; a++){
            for (int b = 0; b < multiArray[a].length; b++){
                for (int c = 0; c < multiArray[a][b].length; c++){
                    System.out.print(multiArray[a][b][c] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

/*Pеализуй статический метод main(String[]), который заполняет массив array значениями valueStart и valueEnd.
Если длина массива четная, его первую половину нужно заполнить значениями valueStart, а вторую — valueEnd. Если длина массива нечётная, то первую большую часть заполнить значениями valueStart, вторую меньшую — valueEnd. Для заполнения массива используй метод Arrays.fill(int[], int, int, int).*/

import java.util.Arrays;

/* 
Заполняем массив
*/

public class Solution {

    public static int[] array = new int[21];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        int n = array.length / 2;
        int m = array.length % 2;
        int len = array.length;
        if (m == 0){
            Arrays.fill(array, 0, n, valueStart);
            Arrays.fill(array, n, len, valueEnd);
        }
        else {
            Arrays.fill(array, 0, n+1, valueStart);
            Arrays.fill(array, n+1, len, valueEnd);
        }
        System.out.println(Arrays.toString(array));
    }
}

/* Реализуй метод main(String[]), который делит массив array на два подмассива и заполняет ими двумерный массив result. Если длина массива нечетная, то большую часть нужно скопировать в первый подмести. Для разделения массива используй метод Arrays.copyOfRange(int[], int, int). Порядок элементов не меняй.*/

import java.util.Arrays;

/* 
Делим массив
*/

public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        int n = array.length / 2;
        int m = array.length % 2;
        int len = array.length;
        if (m == 0){
            result[0] = Arrays.copyOfRange(array, 0, n);
            result[1] = Arrays.copyOfRange(array, n, len);
        }
        else {
            result[0] = Arrays.copyOfRange(array, 0, n+1);
            result[1] = Arrays.copyOfRange(array, n+1, len); 
        }
        System.out.println(Arrays.deepToString(result));
    }
}