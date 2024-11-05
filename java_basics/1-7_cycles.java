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

