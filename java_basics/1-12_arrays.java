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

// Переставить соседние
// Переставьте соседние элементы списка (A[0] c A[1], A[2] c A[3] и т.д.). Если элементов нечетное число, то последний элемент остается на своем месте.
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;
        Boolean flag = false;
        int[] m = new int[n];
        for (int i = 0; i < n; i++)
            m[i] = sc.nextInt();
        for (int i = 0; i < n; i += 2){
            if (i == n - 1){
                System.out.println(m[i]);
                break;
            }
            temp = m[i];
            m[i] = m[i+1];
            m[i+1] = temp;
            System.out.println(m[i]);
            System.out.println(m[i+1]);
        }
    }
}

/* Кубы 2
Вводятся числа a и b. Создайте массив, в котором будут храниться кубы чисел от a до b. Затем вводится число n и n чисел после него.
Используя данные из массива найдите кубы этих. Если вводится число, не принадлежащее заданному диапазону, выведите на экран слово "Error". */
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = a;
        int[] cube = new int[b - a + 1];
        for (int i = 0; i <= (b - a); i++){
            cube[i] = (int) Math.pow(temp,3);
            temp += 1;
        }
        int n = sc.nextInt();
        for (int k = 0; k < n; k++){
            int number = sc.nextInt();
            for (int i = 0; i <= (b - a); i++){
                if (cube[i] == (int) Math.pow(number,3)){
                    System.out.println(cube[i]);
                    break;
                }    
                if (i == (b - a))
                    System.out.println("Error");
            }
        }
    }
}

/* Кегельбан
N кеглей выставили в один ряд, занумеровав их слева направо числами от 1 до N. Затем по этому ряду бросили K шаров, при этом i-й шар сбил все кегли с номерами от a до b включительно. Определите, какие кегли остались стоять на месте.
Входные данные
Программа получает на вход количество кеглей N и количество бросков K. Далее идет K пар чисел a, b , при этом 1abN.
Выходные данные
Программа должна вывести последовательность из N символов, где j-й символ есть “I”, если j-я кегля осталась стоять, или “.”, если j-я кегля была сбита. */
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] bowls = new int[N+1];
        for (int i = 1; i <= N; i++)
            bowls[i] = 1;
        int K = sc.nextInt();
        for (int i = 1; i <= K; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j = a; j <= b; j++)
                bowls[j] = 0;
        }
        for (int i = 1; i <= N; i++){
            if (bowls[i] == 1)
                System.out.print("I");
            else
                 System.out.print(".");      
        }
    }
}
