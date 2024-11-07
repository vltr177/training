// Задача 1
// Вводится число натуральное число n. Выведите на экран построчно все числа от 1 до n.
import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
            while (i <= n) {
                System.out.println( i++ );
            }
    }
}

// Задача 2
// Вводятся два целых числа a и b (a <= b). Выведите на экран все числа от a до b включительно.
import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = a;
            while (i <= b) {
                System.out.println( i++ );
                }
    }
}

// Задача 3
// Вводятся два целых числа a и b. Выведите на экран все числа от a до b включительно.
import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = a;
        int step = 1;
        if (a < b) {
            step = 1;
            }
        else {
            if (a > b)
            step = -1;
            }
        while (i != b + step) {
            System.out.println( i );
            i += step;
            }
    }
}

// Задача 4
// Вводятся два целых числа k (1 <= k <= 10) и n (0 <= n <= 100). Выведите на экран построчно все числа кратные k от 1 до n включительно.
import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); // 1..10
        int n = sc.nextInt(); // 0..100
        int i = 1;
            while (i <= n) {
                if (i % k == 0)
                    System.out.println(i);
                i += 1;
            }
    }
}

// Задача 5
// Пользователь вводит натуральные числа по одному на каждой строке. Когда ему надоедает, то он вводит 0. Найти количество введенных чисел (0 не считается)
import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 0;
        while (a != 0) {
            i += 1;
            a = sc.nextInt();
            }
        System.out.println(i);  
    }
}

// Задача 6
// Пользователь вводит натуральные числа по одному на каждой строке. Когда ему надоедает, то он вводит 0. Найти сумму введенных чисел (0 не считается)
import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 0;
        int sum = 0;
        while (a != 0) {
            i += 1;
            sum += a;
            a = sc.nextInt();
            }
        System.out.println(sum);  
    }
}

// Задача 7
// Программа запрашивает два числа: n и x. Необходимо составить программу, которая будет прибавлять число x само к себе до тех пор, пока сумма не станет больше либо равна n. Выведите полученную сумму.
import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int sum = 0;
        while (sum < n) {
            sum += x;
            }
        System.out.println(sum);  
    }
}

// Задача 8
// Программа запрашивает натуральное число n. Необходимо составить программу, которая будет считывать целые числа до тех пор, пока их произведение не станет больше либо равна n. Выведите через пробел количество введенных чисел и их произведение.
// Примечание: подумайте, что произойдёт, если n равно 1.
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = sc.nextInt();
        int multi = value;
        int count = 1;
        while (multi < n) {
            value = sc.nextInt();
            multi *= value;
            count++;
            }
        System.out.println(count + " " + multi);
    }
}

// Задача 9
// Вводятся натуральное число n. Выведите на экран лесенку, состоящую из n ступенек. Каждая i-ая ступенька состоит из i звёздочек.
import java.util.Scanner;

class MyProgram{
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        String str="*";
        while(i <= n ){
        System.out.println(str.repeat(i));
        i++;}
    }
}

// Задача 10
// Вводятся натуральное число n. Выведите на экран пирамидку, состоящую из n слоёв.
import java.util.Scanner;

class MyProgram{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ks = 1;
    int kp = n-1;
    String st = "*";
    String p = " ";
    while( ks <= n*2 ){
        System.out.print(" ".repeat(kp));
        kp--;
        System.out.println("*".repeat(ks));
        ks += 2;
        }
    }
}
