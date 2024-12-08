// Дискриминант
// С клавиатуры вводится 3 числа: a, b, c - коэффициенты квадратного уравнения a*x2 + b*x + c = 0 (a != 0). Вычислите дискриминант этого квадратного уравнения и выведите его на экран.
import java.util.Scanner;
import java.math.*;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((int)((Math.pow(b,2) - 4*a*c)));
    }
}

// Сколько корней?
// С клавиатуры вводится 3 числа: a, b, c - коэффициенты квадратного уравнения a*x2 + b*x + c = 0 (a != 0).  Определите, сколько корней будет у этого уравнения. Выведите на экран одно число - количество корней уравнения.
import java.util.Scanner;
import java.math.*;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = (int)((Math.pow(b,2) - 4*a*c));
        if (d>0)
            System.out.println("2");
        if (d==0)
            System.out.println("1");
        if (d<0)
            System.out.println("0");
    }
}

