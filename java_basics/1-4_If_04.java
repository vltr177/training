// Напишите программу, которая считывает 2 действительных числа и выводит их частное. Если это невозможно, то выводит слово "Error"


import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double a = sc.nextInt();
    double b = sc.nextInt();
    if (b != 0) {
        System.out.println(a/b);
    }else{
            System.out.println("Error");
        }
    }
}
