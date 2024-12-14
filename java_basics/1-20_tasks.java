// Дискриминант
// С клавиатуры вводится 3 числа: a, b, c - коэффициенты квадратного уравнения a*x2 + b*x + c = 0 (a != 0). Вычислите дискриминант этого квадратного уравнения и выведите его на экран.
import java.util.Scanner;
import java.math.*;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((int)((Math.pow(b,2) - 4*a*c)));
    }
}

// Сколько корней?
// С клавиатуры вводится 3 числа: a, b, c - коэффициенты квадратного уравнения a*x2 + b*x + c = 0 (a != 0).  Определите, сколько корней будет у этого уравнения. Выведите на экран одно число - количество корней уравнения.
import java.util.Scanner;
import java.math.*;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = (int)((Math.pow(b,2) - 4*a*c));
        if (d>0)
            System.out.println("2");
        if (d==0)
            System.out.println("1");
        if (d<0)
            System.out.println("0");
    }
}

/* Кратные 3
Последовательность состоит из натуральных чисел и завершается числом 0. Определите максимальный элемент кратный 3. если такого элемента нет, то выведите на экран "404".
Числа, следующие за числом 0, считывать не нужно. */
import java.util.*;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> numbers = new HashSet<>();
        int max = 0;
        while (true){
            int n = sc.nextInt();
            if (n == 0)
                break;
            numbers.add(n);
        }
        for (Integer number : numbers)
            if ((number%3 == 0) & (number) > max)
                max = number;
        if (max == 0)
            System.out.println("404");
        else
            System.out.println(max);
    }
}

// Сумма чисел, заканчивающихся на 7 или 3
// С клавиатуры вводятся 2 числа: a и b соответственно. Необходимо найти сумму всех чисел от a до  b включительно, заканчивающихся на 3 или 7. 
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i<=b; i++)
            if ((i%10 == 3) || (i%10 == 7))
                sum += i;
        System.out.println(sum);
    }
}

// Max swap Min 
// С клавиатуры вводится число n (n >= 2) за ним вводится n действительных чисел. Ваша задача - поменять местами максимальный и минимальный элементы. после чего выведите на экран массив через пробел. Гарантируется, что максимальный и минимальный элементы содержатся в единственном экземпляре.
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp;
        int n = sc.nextInt();
        double[] numbers = new double[n];
        for (int i = 0; i<n; i++)
            numbers[i] = sc.nextDouble();
        double min = numbers[0];
        double max = numbers[0];
        int min_index = 0;
        int max_index = 0;
        for (int i = 1; i<n; i++){
            if (numbers[i]<min) {
                min = numbers[i];
                min_index = i;
            }
            if (numbers[i]>max) {
                max = numbers[i];
                max_index = i;
            }
        }

        temp = numbers[min_index];
        numbers[min_index] = numbers[max_index];
        numbers[max_index] = temp;

        for (int i=0; i<n; i++)
            System.out.print(numbers[i] + " ");
    }
}

// Строка и Столбец
// Вводятся 2 натуральных числа: n и m. Затем вводится двумерный массив размером n*m. Определите, есть в ней строка и столбец, произведение элементов которой равно 15. Выведите на экран два ответа "YES/NO" построчно.
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];
        boolean row_flag = false;
        boolean col_flag = false;
        int row_mult = 1;
        int col_mult = 1;
        
        for (int i = 0; i<n; i++)
            for (int j = 0; j<m; j++)
                array[i][j] = sc.nextInt();
        
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++)
                row_mult *= array[i][j];
            if (row_mult == 15){
                row_flag = true;
                break;
            }
            row_mult = 1;
        }

        for (int j = 0; j<m; j++){
            for (int i = 0; i<n; i++)
                col_mult *= array[i][j];
            if (col_mult == 15){
                col_flag = true;
                break;
            }
            col_mult = 1;
        }    

        if (row_flag)
            System.out.println("YES");
        else
            System.out.println("NO");            
        if (col_flag)
            System.out.println("YES");
        else
            System.out.println("NO");        
    }
}

// Люблю букву А!
// Вводится строка. Определите, сколько слов в ней начинается с маленькой или большой буквы а (только русской). Словом считается любая последовательность символов, не содержащая пробелов.
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String[] words = sc.nextLine().toLowerCase().split(" ");
        for (String word : words){
            if (word.indexOf('а') == 0)
                count++;
        }
        System.out.println(count);
    }
}
