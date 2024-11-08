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

