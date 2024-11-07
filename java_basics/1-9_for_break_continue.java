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
    
