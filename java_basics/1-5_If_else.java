// Температура
// Вводится одно действительное число - температура воздуха на улице. Если она меньше, чем 22.4 градуса, то вывести "Холодно(", если больше, то вывести "Тепло!", если ровно 22.4 градуса, то вывести "Прохладно...".

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double t = sc.nextDouble();

        if (t < 22.4){
            System.out.println("Холодно(");
            }
        else{
            if (t > 22.4){
                System.out.println("Тепло!");
                }
            else{
                System.out.println("Прохладно...");                
                }
            }
        }
    }

// Количество цифр 1
// Вводится целое число n (0 < n < 1000). Определите, является ли оно двузначным? Выведите в ответ "Yes"/"No".

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if ( (n < 100) && (n > 9) ){
            System.out.println("Yes");
            }
        else{
            System.out.println("No");
            }
        }
    }

// Количество цифр 2
// Вводится целое число n (0 < n < 1000). Определите, сколько в нём цифр. Выведите ответ на экран.

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 99){
            System.out.println("3");
            }
        else{
            if (n > 9){
                System.out.println("2");
                }
            else{
                System.out.println("1");                
                }
            }
        }
    }

// Уравнение 1
// Вводятся два целых числа:  a, b - коэффициенты линейного уравнения a * x + b = 0. Определите количество его корней. Вам достаточно вывести одно целое число - количество корней квадратного уравнения. Если корней бесконечно много, ты выведите строку "inf".

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if ( (a == 0) && (b == 0) ){
            System.out.println("inf");
            }
        else{
            System.out.println(a != 0 ? "1" : "0");
            }
        }
    }
// Уравнение 1
// Вводятся три целых числа:  a, b и c - коэффициенты квадратного уравнения (a != 0). Определите количество его корней. Вам достаточно вывести одно целое число - количество корней квадратного уравнения.

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = b * b - 4 * a * c;
        
        if ( d < 0 ){
            System.out.println("0");
            }
        else{
            System.out.println(d > 0 ? "2" : "1");
            }
        }
    }

// Уравнение 3
// Вводятся три целых числа:  a, b и c - коэффициенты квадратного уравнения. Определите количество его корней. Вам достаточно вывести одно целое число - количество корней уравнения. Если корней бесконечно много, ты выведите строку "inf".

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = b * b - 4 * a * c;
        
        if (a == 0) {
            if(b == 0 && c != 0) {
                System.out.println("0");
            } else if (b == 0 && c == 0) {
                System.out.println("inf");
            } else {
                System.out.println("1");
            }
        } else if(d < 0) {
            System.out.println("0");
        } else if(d > 0) {
            System.out.println("2");
        } else {
            System.out.println("1");
        }
        }
    }

//Точка 1
//Вводятся два действительных числа: координаты точки на плоскости. Определите, принадлежит ли эта точка закрашенной области. Выведите ответ на задачу в формате "Yes"/"No". 
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), y = sc.nextDouble();
        if(y>x*2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

// Точка 2
// Вводятся два действительных числа: координаты точки на плоскости. Определите, принадлежит ли эта точка закрашенной области. Выведите ответ на задачу в формате "Yes"/"No". 

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double x = sc.nextDouble(), y = sc.nextDouble();
        if ((x > 0) && (y > 0)) {
            if ((x * 2 < y) && (x * 3 > y)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}

// Точка 3
// Вводятся два действительных числа: координаты точки на плоскости. Определите, принадлежит ли эта точка закрашенной области. Выведите ответ на задачу в формате "Yes"/"No". 

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), y = sc.nextDouble();
        if ((x / 2 > y) && (x * x - 2 * x - 3 < y)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

// Точка 4
// Вводятся два действительных числа: координаты точки на плоскости. Определите, принадлежит ли эта точка закрашенной области. Выведите ответ на задачу в формате "Yes"/"No". 

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), y = sc.nextDouble();
        if ((x * x - 3 > y) && (y * y + x * x < 5)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

// Точка 5
// Вводятся два действительных числа: координаты точки на плоскости. Определите, принадлежит ли эта точка закрашенной области. Выведите ответ на задачу в формате "Yes"/"No". 

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), y = sc.nextDouble();
        if ((y * y + x * x < 5) && (x * x - 3 > y) && (0.5 * x - 1) < y){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}

// Точка 6
// Вводятся два действительных числа: координаты точки на плоскости. Определите, принадлежит ли эта точка закрашенной области. Выведите ответ на задачу в формате "Yes"/"No".

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       double x = sc.nextDouble();
       double y = sc.nextDouble();
       if ((y > 0.5 * x - 1)  && (y < x * x - 3)  && (y * y < 5 - x * x) || (-2 > y && y > -3 && -1 < x && x < 1)){
           System.out.print("Yes");
       }else{
           System.out.print("No");
       
      }

    }
}
