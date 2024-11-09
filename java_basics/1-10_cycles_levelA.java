// Повтори 10 раз!
// Напишите программу, которая выводит на экран слово "Привет" (без кавычек) 10 раз.
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        for ( int i = 0; i < 10; i++){
            System.out.println("Привет");
        }
    }
}

// Сумма чисел
// Напишите программу, которая находит сумму натуральных чисел от 1 до n, где n вводится с клавиатуры.
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
            }
        System.out.println(sum);
    }
}

// Сумма квадратов
// Напишите программу, которая находит сумму квадратов натуральных чисел от 1 до n, где n вводится с клавиатуры.
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power = 0;
        for (int i = 1; i <= n; i++){
             power += Math.pow(i,2);
            }
        System.out.println(power);
    }
}

/* Доллары
Напишите программу, которая выводила бы на экран числа (например число а) следующим образом:
a a.$
Входные данные
Вводятся два натуральных числа a и b (a <= b).
Выходные данные
Выведите ответ на задачу.
*/
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = n1; i <= n2; i++){
            System.out.println(i + " " + i + ".$");
            }
    }
}

/* Произведение 1
Составьте программу, которая запрашивает ввод n чисел и считает их произведение.
Входные данные
На первой строке вводится натуральное число n. Затем вводится n строк, на каждой из которых находится ровно одно целое число.
Выходные данные
Выведите единственное число - ответ на задачу.
*/
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long multi = 1;
        for (int i = 1; i <= n; i++){
            long a = sc.nextInt();
            multi *= a;
            }
        System.out.println(multi);
    }
}

// Нечётные цифры
// Составьте программу, которая в одну строку через пробел выводит все нечетные цифры.
class MyProgram{
    public static void main(String[] args){
         for (int i = 1; i <= 10; i++){
            if (i % 2 != 0 )
                System.out.print(i + " ");
             }
    }
}

/* Произведение 2
Вводится 2 целых числа a и b (a <= b). Необходимо вычислить произведение всех чисел от а до b включительно
Входные данные
Заданы два целых числа а и b
Выходные данные
Выведите единственное число - ответ на задачу.
*/

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long multi = 1;
        
        for (int i = a; i <= b; i++){
            multi *= i;
            }
        System.out.println(multi);
    }
}

// Вывод чисел "вниз"
// Напишите программу, которая выводит в столбик целые числа от 50 до 0  с шагом 10.
class MyProgram{
    public static void main(String[] args){
        for (int i = 50; i >= 0; i -= 10){
            System.out.println(i);
            }
    }
}

/* Вывод чисел "вниз" Pro
Напишите программу, которая выводит в столбик целые числа от a до b (a >= b) с шагом c. Границы включаются.
Входные данные
Заданы три целых числа а, b, с, где a > b
*/
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
                
        for (int i = a; i >= b; i -= c){
            System.out.println(i);
            }
    }
}

/* Средний возраст
В компьютер вводятся по очереди данные об имени и возрасте n учащихся класса. Напишите программу, которая вычисляет средний возраст учащихся класса.
Входные данные
Вводится натуральное число n - количество человек в классе. Затем вводится n пар строчек. Каждая пара состоит из имени и возраста ученика.  
Выходные данные
Выведите единственное действительное число - ответ на задачу.
*/
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float sum = 0;
        for (int i = 1; i <= n; i++){
            String name = sc.next();
            int age = sc.nextInt();
            sum += age;
            }
    System.out.println(sum/n);
    }
}

/* Таблица умножения
Напишите программу, которая по заданному с клавиатуры числу n печатает таблицу умножения от 1 до 9.
Входные данные
Задано натуральное число n.
Выходные данные
Выведите ответ на задачу.
*/
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 9; i++){
            System.out.println(n + " * " + i + " = " + (i*n));
            }
    }
}

/* Совы нежные
Ознакомьтесь с этим произведением искусства: совы нежные
Напишите программу, которая по введенному с клавиатуры числу выводит соответствующее число сов. 
Картинка тетушки Совы состоит из символов. Размер одной картинки 5 на 11 символов.
:)\_____/(:
 {(@)v(@)}
 {|~- -~|}
 {/^'^'^\}
 ===m-m===
Между двумя соседними совами имеется пустая строка.
Входные данные
Задано целое неотрицательное число n.
*/
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println(":)\\_____/(:");
            System.out.println(" {(@)v(@)}");
            System.out.println(" {|~- -~|}");
            System.out.println(" {/^'^'^\\}");
            System.out.println( " ===m-m===");
            System.out.println("");
            }
    }
}

/* Произведение чисел числа
Дано натуральное число. Найдите произведение его цифр.
Входные данные
Задано натуральное число n.
Выходные данные
Выведите ответ на задачу.
*/
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int multi  = 1;
        for (int i = n; i != 0; i /= 10){
            multi *= i % 10;
            }
    System.out.println(multi);
    }
}
