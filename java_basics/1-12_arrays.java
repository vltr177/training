# Кубы
# Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.
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

