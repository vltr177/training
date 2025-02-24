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
