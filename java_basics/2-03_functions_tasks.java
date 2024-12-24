/*Минимум из 4 чисел
Напишите функцию int min (int a, int b, int c, int d) , находящую наименьшее из четырех данных чисел и возвращающую ответ.
Входные данные
Вводится четыре числа.
Выходные данные
Необходимо вывести  наименьшее из 4-х данных чисел.
Содержание функции main менять запрещено.*/
import java.util.Scanner;

class Programm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(min(a, b, c, d));
    }
    static int min(int a, int b, int c, int d){
        int min = a;
        int [] mas = {b, c, d};
        for (int x: mas){
            if (x < min)
                min = x;
        }
        return min;
    }
}


/*Исключающее ИЛИ
Напишите функцию xor реализующую функцию "Исключающее ИЛИ" двух логических переменных x и y. Функция Xor должна возвращать true, если ровно один из ее аргументов x или y, но не оба одновременно равны true.
Входные данные
Вводится 2 числа - x и y (x и y равны 0 или 1, 0 соответствует значению false, 1 соответствует значению true).
Выходные данные
Необходимо вывести false или true - значение функции от x и y.
Содержание функции main менять запрещено. */
import java.util.Scanner;
class Programm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean f = sc.nextInt() != 0;
        boolean s = sc.nextInt() != 0;
        System.out.println(xor(f, s));
    }
    static boolean xor (boolean f, boolean s){
        if ((f||s) & (f!=s))
            return true;
        else
            return false;
    }
}

/*Голосование
Напишите "функцию голосования" election,  возвращающую то значение (true или false), которое среди значений ее аргументов x, y, z встречается чаще.
Входные данные
Вводится 3 числа - x, y и z (x, y и z равны 0 или 1, 0 соответствует значению false, 1 соответствует значению true).
Выходные данные
Необходимо вывести  значение функции от x, y и z.
Содержание функции main менять запрещено.*/
import java.util.Scanner;
class Programm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean f = sc.nextInt() == 1 ? true : false;
        boolean s = sc.nextInt() == 1 ? true : false;
        boolean t = sc.nextInt() == 1 ? true : false;
        System.out.println(election(f, s, t));
    }
    static boolean election(boolean f, boolean s, boolean t) {
        if ( (f||s) & (s||t) & (t||f) )
            return true;
        else
            return false;
    }
}

/*Сколько цифр
Дана строка, содержащая цифры и английские буквы (большие и маленькие). Напишите функцию digit_count, которая найдёт количество цифр в этой строке.
Входные данные
Вводится строка ненулевой длины. Известно также, что длина строки не превышает 1000 знаков.
Выходные данные
Выведите количество цифр, которые присутствуют в строке.
Содержание функции main менять запрещено.*/
import java.util.Scanner;
class Programm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(digit_count(s));
    }
    static int digit_count(String s){
        int count = 0;
        char[] symbols = s.toCharArray();
        for (char symbol: symbols){
            if (Character.isDigit(symbol))
                count++;
        }
        return count;
    }
}

// Сортировка массива
// Дан массив, вам необходимо написать функцию, которая ничего не возвращает, но меняет сам массив, а именно: сортирует его по убыванию. Содержание функции main менять запрещено.
import java.util.Scanner;
class Programm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++)
            mas[i] = sc.nextInt();
        sort(mas);
        for(int i: mas)
            System.out.print(i + " ");
    }
    static void sort(int [] a){
        for (int i = 1; i < a.length; i++){
            boolean issorted = true;
            for (int j = 0; j < a.length-i; j++){
                if (a[j] < a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    issorted = false;
                }
            }
            if (issorted)
                break;
        }
    }
}

/*Возведение в степень
Напишите функцию возведения числа в степень pow. 
Входные данные
Вводится 2 числа - a (вещественное) и n (целое неотрицательное).
Выходные данные
Необходимо вывести  значение an.
Пользоваться функцией pow из библиотеки Math запрещено. Содержание функции main менять запрещено.*/
import java.util.Scanner;
class Programm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(pow(a, n));
    }
    static double pow(double a, int n){
        if (n == 0)
            return 1;
        double res = a;
        for (int i = 1; i<n; i++)
            res *= a;
        return res;
    }
}

/*Быстрое возведение в степень (рекурсия)
Напишите функцию быстрого возведения в степень pow. Количество действий должно быть пропорционально двоичному логарифму n.
Входные данные
Вводится 2 числа - a (вещественное) и n (целое неотрицательное).
Выходные данные
Необходимо вывести  значение an.
Решите эту задачу используя рекурсию.
Пользоваться функцией pow из библиотеки Math запрещено. Содержание функции main менять запрещено.*/
import java.util.Scanner;
class Programm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(pow(a, n));
    }
    static double pow(double a, int n){
        double c = 1;
        if (n == 0)
            return 1;
        if (n%2 == 0)
            return pow (a*a, n/2);
        else
            return c = a * pow(a*a, (n - 1)/2);
    }
}

/* +3 *5
Определить можно ли с использованием только операций «прибавить 3» и «умножить на 5» получить из числа 1 число 𝑁 (𝑁 - натуральное, не превышает 1 000 000). Разумеется, само число 1 получить можно, просто не применяя никаких операций.
Входные данные
Вводится число 𝑁.
Выходные данные
Выведите слово YES, если число 𝑁 можно получить из числа 1, или NO - в противном случае.*/
import java.util.Scanner;
class Programm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(calc(n));
    }
    static String calc(int n){
        if (n==1) return "YES";
        if((n-1)%3 == 0 || n%5 == 0) return "YES";
        else return "NO";
    }
}

/*Генератор
Даны два натуральных числа N и K. Требуется вывести  все цепочки x1, x2, ..., xN такие, что xi - натуральное и 1 ≤ xi ≤ K.
Входные данные
Вводятся два натуральных числа N и K (N, K ≤ 6).
Выходные данные
Выведите все требуемые цепочки в произвольном порядке – по одной на строке. Никакая цепочка не должна встречаться более одного раза.*/
import java.util.Scanner;

class Programm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        generateChains(N, K, "");
    }

    public static void generateChains(int N, int K, String chain) {
        if (N == 0) {
            System.out.println(chain.trim());
        } else {
            for (int i = 1; i <= K; i++) {
                generateChains(N - 1, K, chain + " " + i);
            }
        }
    }
}
