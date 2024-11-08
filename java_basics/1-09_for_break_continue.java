// Повторение 1
// Пользователь вводит с клавиатуры натуральное число n. Затем вводит n целых чисел. Необходимо найти и вывести на экран их сумму.
import java.util.Scanner;
class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numbers = 0;
        int sum = 0;
                
        while ( n != 0) {
            n -= 1;
            numbers = sc.nextInt();
            sum += numbers;
            }
        System.out.println(sum);  
    }
}

// Повторение 2
// Пользователь вводит с клавиатуры натуральное число n. Затем вводит n целых чисел. Необходимо найти и вывести на экран количество чётных.
import java.util.Scanner;
class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numbers = 0;
        int count = 0;
                
        while ( n != 0) {
            n -= 1;
            numbers = sc.nextInt();
            if ( numbers % 2 == 0)
                count +=1;
            }
        System.out.println(count);  
    }
}

// Опять Сумма
// Вводится 2 целых числа a и b (a <= b). Необходимо вычислить сумму всех чисел от а до b включительно.
import java.util.Scanner;
class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

    	for(int i = a; i <= b; i++) {
            sum += i;
    	    }
        System.out.println(sum);
    }
}

// Только 7
// Напишем программу, которая считывает целые числа с клавиатуры и находит их сумму, если они заканчиваются на 7. Если ввели число, кратное 7, то программа должна завершиться (оно не суммируется). Во время решения задачи воспользуемся break и continue.
import java.util.Scanner;
class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int n = sc.nextInt();; n = sc.nextInt()){
            if (n % 7 == 0) {    
                break;
                }
            else if ( n % 10 == 7) {
                sum += n;
                continue;
                }
    	    }
        System.out.println(sum);
    }
}

// Найдите Куб
// Пользователь вводит слова до тех пор, пока не введёт "СТОП". Необходимо выяснить, было ли среди введённых слов слово "Куб". Если да, то выведите "YES", если нет, то  "NO".
import java.util.Scanner;
class MyProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean is_cube = false;
        for (String word = sc.nextLine(); true ; word = sc.nextLine()){
            if (word.equals("СТОП")) {
                break;
            }
            if (word.equals("Куб")) {
                is_cube = true;
                continue;
            }
        }
        if (is_cube)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

// Min и Max
// Задача на поиск минимума и максимума. Пользователь вводит натуральное число n, затем n целых чисел. Необходимо определить и вывести на экран минимальное и максимальное из них. 
// Обратите внимание, что в большинстве задач как минимальное и максимальное значения часто используются -2*109 и 2*109 соответственно. Но в олимпиадных задачах всегда смотрите на ограничения по числам (в них всегда оговорены границы, в которых будут лежать значения переменных).
import java.util.Scanner;

class MyProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();    
        int min = a;
        int max = a;
        for (int i = 1; i < n ; i++){
            a = sc.nextInt();            
            if ( a < min)
                min = a;
            if ( a > max)
                max = a;
        }
        System.out.println(min);
        System.out.println(max);
    }
}

// Факториал
// Вводится натуральное число n. Вычислите n! ("эн-факториал") – произведение всех натуральных чисел от 1 до n 
import java.util.Scanner;

class MyProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 2; i <= n ; i++){
            fact *= i;            
        }
        System.out.println(fact);
    }
}

// Произведение
// Пользователь вводит целые числа до тех пор, пока не введёт слово "СТОП" (гарантируется, что других слов не будет). Найдите произведение ненулевых чисел. Если же такое произведение найти не удалось, то выведите на экран "Не найдено".
import java.util.Scanner;

class MyProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int multi = 1;
        Boolean flag = false;
        for (String number = sc.nextLine(); !number.equals("СТОП") ; number = sc.nextLine()){
            int n = Integer.parseInt(number);
            if (n == 0)
                continue;
            multi *= n;
            flag = true;
        }
        if (flag) {
            System.out.println(multi);
            }
        else {
            System.out.println("Не найдено");
            }
    }
}
    
// Геометрическая прогрессия
// По данному целому числу a и натуральному n вычислите сумму 1+a+a2+...+an, не используя формулу суммы геометрической прогрессии. Время работы программы должно быть пропорционально n.
import java.util.Scanner;

class MyProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int sum = 1;
        for ( int i = 1; i <= n ; i++ ){
            sum += Math.pow(a,i);
        }
        System.out.println(sum);
    }
}

// Двоичная запись
// Дано натуральное число N. Выведите его представление в двоичном виде в обратном порядке.
import java.util.Scanner;

class MyProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = 0;
        for ( int i = N; i != 0 ; i /= 2 ){
            res = i % 2;
            System.out.print(res);


        }
    }
}
// Найдите Куб 2.0
// Пользователь вводит слова до тех пор, пока не введёт "СТОП". Среди введённых слов могут быть слова - паразиты, а именно: "'ээээ" или "потом". Слова-паразиты не считаются нормальными словами.
// Необходимо выяснить, было ли среди введённых слов слово "Куб". Если да, то выведите, каким по счёту нормальным словом оно было введено. В противном случае выведите на экран слово "NO".

import java.util.Scanner;
class MyProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        Boolean flag = false;
        for ( String word = sc.nextLine(); !word.equals("СТОП") ; word = sc.nextLine() ) {
            if ( (word.equals("ээээ")) || (word.equals("потом")) ) {
                continue;
            }
            count += 1;
            if ( word.equals("Куб") ) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println(count);
            }
        else {
            System.out.println("NO");
        }
    }
}

// Сколько элементов, равных максимуму?
// Последовательность состоит из натуральных чисел и завершается числом 0. Всего вводится не более 10000 чисел (не считая завершающего числа 0). Определите, сколько элементов этой последовательности равны ее наибольшему элементу.
// Числа, следующие за числом 0, считывать не нужно
import java.util.Scanner;

class MyProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int count = 0;
        for ( int n = sc.nextInt(); n != 0 ; n = sc.nextInt() ){
            if (n > max) {
                count = 0;
                max = n;
            }
            if (n == max) {
                count +=1;
            }
        }
        System.out.println(count);
    }
}
