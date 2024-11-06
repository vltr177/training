// Квадраты
// Пользователь вводит натуральное число. Необходимо вывести все полные квадраты натуральных чисел, не превосходящие этого числа.
import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1;
        int square = 0;
    	while(b * b <= a ) {
    	    System.out.println(b * b++);
    	}
    }
}

// Сумма
// Вводится 2 целых числа a и b (a <= b). Необходимо вычислить сумму всех чисел от а до b включительно.
import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = a;
        int sum = 0;
    	while(i < b + 1) {
            sum += i++;
    	}
    	System.out.println(sum);
    }
}

// Количество
// Вводится 2 целых числа a и b (a <= b). Необходимо вычислить количество всех чисел кратных 3, но не кратных 5 от а до b включительно.
import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = a;
        int n = 0;
    	while (i < b+1) {
            if (i%3 == 0 && i%5 != 0) {
                n += 1;
            }
            i += 1;
    	}
    	System.out.println(n);
    }
}

// Считывание чисел с клавиатуры
// Пользователь с клавиатуры вводит действительные числа до 0. Необходимо вычислить их среднее арифметическое. Гарантируется, что он введёт хотя бы одно ненулевое число.
import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int n = 0;
    	while (a != 0) {
            n += 1;
            sum += a;
            a = sc.nextInt();
        }
        System.out.println( (double)sum / n );
    }
}

/* Максимум
Последовательность состоит из различных натуральных чисел и завершается числом 0. Определите значение максимального элемента в этой последовательности.
Числа, следующие за числом 0, считывать не нужно.
Входные данные
Вводится последовательность целых чисел, оканчивающаяся числом 0 (само число 0 в последовательность не входит). Гарантируется, что будет введено хотя бы 2 числа.
Выходные данные
Выведите ответ на задачу.
*/
import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max = 0;

    	while (a != 0) {
            max = Math.max(max,a);
            a = sc.nextInt();
        }
        System.out.println( max );
    }
}

// Чётные числа
//Вводятся целые числа a и b. Гарантируется, что a не превосходит b. Выведите все четные числа от a до b (включительно).
import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = a;
    	while (i <= b) {
            if (i%2 == 0)
                System.out.println( i );
            i += 1;
        }
    }
}

// Минимальный делитель
// Дано целое число, не меньшее 2. Выведите его наименьший натуральный делитель, отличный от 1.
import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 2;
    	while ( (a % i != 0) && ( i <= a) ) {
            i += 1;
        }
        System.out.println( i );
    }
}

// Сумма квадратов
// По данному натуральному n вычислите сумму 12+22+...+n2.
import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;
        int res = 0;
            while (i <= a) {
            res += i*i;
            i += 1;
        }
        System.out.println( res );
    }
}

/* Утренняя пробежка
В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал пробег на 10% от предыдущего значения. По данному числу y определите номер дня, на который пробег спортсмена составит не менее y километров.
Входные данные
Программа получает на вход действительные числа x и y
Выходные данные
Программа должна вывести одно натуральное число.
*/
import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double x = sc.nextDouble();
        Double y = sc.nextDouble();
        int d = 1;
        Double dist = x;
            while ( dist < y ) {
            d += 1;
            dist += 0.1*dist;
        }
        System.out.println( d );
    }
}

// Сумма цифр натурального числа
// Дано натуральное число N. Напишите програму, вычисляющую сумму цифр числа N.
import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
            while ( n%10 != 0 ) {
                sum += n%10;
                n = n/10;
        }
        System.out.println( sum );
    }
}

/* Количество элементов, больших предыдущего
Последовательность состоит из натуральных чисел и завершается числом 0. Определите, сколько элементов этой последовательности больше предыдущего элемента. Гарантируется ввод хотя бы двух ненулевых чисел.
Числа, следующие за числом 0, считывать не нужно.
*/
import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = 0;
        int count = 0;
    	while (n != 0) {
            l = n;            
            n = sc.nextInt();   
            if ( n > l )
                count += 1;
        }
        System.out.println( count );
    }
}

