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

