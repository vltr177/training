// Две функции
// Допишите функцию my_first_function, которая выводит на экран три строчки "Hello world!". Напишите так же функцию my_second_function, которая выведет на экран одну строку: "Java the best!". Содержание функции main менять запрещено.
class Example{
    public static void main(String[] args){
        my_first_function();
        my_second_function();
        my_second_function();
    }

    static void my_first_function(){
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
    }

    static void my_second_function(){
        System.out.println("Java the best!");
    }
}

// Произведение трёх чисел
// Напишите функцию multiply, которая будет принимать в себя три целых числа и распечатывать на строке их произведение. Содержание функции main менять запрещено.
import java.util.Scanner;
class Example{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        multiply(a, b, c);
    }

    static void multiply(int a, int b, int c){
        System.out.println(a*b*c);
    }
}

//Какое слово длиннее?
//Напишите функцию twoWords, которая принимает две строки и сравнивает их длины. После чего выводит на экран либо "Первая строка длиннее", либо "Вторая строка длиннее", либо "Равная длина". Содержание функции main менять запрещено.
import java.util.Scanner;

class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        twoWords(s1, s2);
    }

    static void twoWords(String s1, String s2){
        if (s1.length() > s2.length()){
            System.out.println("Первая строка длиннее");
        }
        else if (s1.length() < s2.length()){
            System.out.println("Вторая строка длиннее");
        }
        else if (s1.length() == s2.length()){
            System.out.println("Равная длина");
        }

    }
}

// Формула Герона
// Площадь треугольника можно вычислить по формуле Герона. Напишите функцию geron, которая по трём действительным числам находит площадь треугольника и выводит её на экран. Если такого треугольника не существует, то выведите на экран "Такого треугольника не существует". Содержимое функции main менять запрещено.
import java.util.Scanner;

class Example{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();
        geron(s1, s2, s3);
    }

    static void geron(double a, double b, double c){
        double p = (a+b+c)/2;
        double s = p*(p-a)*(p-b)*(p-c);
        if (s>0)
            System.out.println(Math.sqrt(s));
        else
            System.out.println("Такого треугольника не существует");
    }
}

// Площадь и периметр
// Необходимо написать программу для поиска площади и периметра квадрата или круга. Напишите две функции: perimeter и area, каждая из них принимает строку - название фигуры и одно целое число (либо радиус круга, либо сторону квадрата). Как результат они выводят периметр и площадь фигуры соответственно.
// В ответ они должны вывести именно целое число (при надобности округлять "вверх", то есть до ближайшего большего целого числа). Содержание функции main менять запрещено. Пи брать как 3.14.
import java.util.Scanner;

class Example{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String figure = sc.nextLine();
        int x = sc.nextInt();
        perimeter(figure, x);
        area(figure, x);
    }

    static void perimeter(String figure, int x){
        if (figure.equals("Квадрат"))
            System.out.println(4*x);
        if (figure.equals("Круг")) {
            System.out.println((int) Math.ceil(2*3.14*x));
        }
    }

    static void area(String figure, int x){
        if (figure.equals("Квадрат"))
            System.out.println(x*x);
        if (figure.equals("Круг")) {
            System.out.println((int) Math.ceil(3.14*Math.pow(x,2)));
        }
    }
}

