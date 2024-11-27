// Задача 1
// Вводится натуральное число n. Допишите код, который создаст массив с именем array на n элементов, в котором буду храниться числа от 0 до n - 1 (элемент равен индексу).
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = i;
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}

// Задача 2
// Вводится натуральное число n. Допишите код, который создаст массив с именем array на n элементов, в котором буду храниться квадраты чисел от 0 до n - 1 (элемент равен квадрату индекса).
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = (int) Math.pow(i,2);
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}

