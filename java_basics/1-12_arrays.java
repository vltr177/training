// Кубы
// Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 1000;
        int[] cube = new int[n];
        for (int i = 0; i < n; i++)
            cube[i] = (int)Math.pow(i+1,3);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(cube[a-1]);
        System.out.println(cube[b-1]);
    }
}

// Простая обработка массива
// Вводится число n, затем n чисел целых, по одному на каждой строке. Затем вводится число, на которое нужно умножить все введённые выше числа. Выведите на экран результат умножения построчно.
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++)
            System.out.println(a[i]*m);
    }
}

// Сумма
// Вводится список (сначала количество элементов, потом сами элементы). Найдите сумму всех элементов и выведите её. А потом выведите введённые числа в обратном порядке.
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            sum += a[i];
            }
            System.out.println(sum);
        for (int i = n-1; i >= 0; i--)
            System.out.println(a[i]);
    }
}

// Сумма 2
// Вводится массив (сначала количество элементов, потом сами элементы). Найдите сумму его элементов с чётными индексами и выведите её. А потом выведите числа, которые суммировались.
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            if (i%2 == 0)
                sum += a[i];
            }
            System.out.println(sum);
        for (int i = 0; i < n; i++){
            if (i%2 == 0)
                System.out.println(a[i]);
            }
    }
}

// Поменяться местами
// Дан список (сначала количество элементов, потом сами элементы). Потом водятся два числа: a и b. Поменяйте местами значения a-ого и b-ого элементов массива и выведите его на экран построчно. Гарантируется, что а и b не выходят за границы размеров массива.
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++)
            m[i] = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = m[a];
        m[a] = m[b];
        m[b] = temp;
        for (int i = 0; i < n; i++)
            System.out.println(m[i]);
    }
}

/* Шеренга
Петя перешёл в другую школу. На уроке физкультуры ему понадобилось определить своё место в строю. Помогите ему это сделать.
Входные данные
Программа получает на вход невозрастающую последовательность натуральных чисел (сначала вводится количество, затем сами числа), означающих рост каждого человека в строю. После этого вводится число X – рост Пети. Все числа во входных данных натуральные и не превышают 200.
Выходные данные
Выведите номер, под которым Петя должен встать в строй. Если в строю есть люди с одинаковым ростом, таким же, как у Пети, то он должен встать после них.*/
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = n;
        int[] m = new int[n];
        for (int i = 0; i < n; i++)
            m[i] = sc.nextInt();
        int x = sc.nextInt();
        for (int i = 0; i < n; i++)
            if (x > m[i]){
                number = i;
                break;
                }
        System.out.println(number+1);
    }
}

/* Уникальные элементы
Дан список. Выведите те его элементы, которые встречаются в списке только один раз. Элементы нужно выводить в том порядке, в котором они встречаются в списке.
Входные данные
Вводится список чисел. Все числа списка находятся на одной строке.
Выходные данные
Выведите ответ на задачу.*/
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Boolean flag = false;
        int[] m = new int[n];
        for (int i = 0; i < n; i++)
            m[i] = sc.nextInt();
        for (int i = 0; i < n; i++){
            for (int k = 0; k < n; k++){
                if (i != k) {
                    if (m[i] == m[k]) {
                        flag = true;
                        break;
                    }
                }
            }
            if (!flag) {
                System.out.println(m[i]);
            }
            flag = false;
        }
    }
}
