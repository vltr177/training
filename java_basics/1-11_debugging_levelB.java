// В обратном порядке через одного
// Вводятся два целых числа: a и b (a <=b ). Выведите на экран все числа от b до а через одно на разных строчках.
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for ( int i = b; i >= a; i -= 2) {
            System.out.println (i);
            }
    }
}

// Повторение на флаги
// Вводится количество чисел n, затем n чисел. Необходимо выяснить есть ли среди них такое, которое заканчивается на 4? Если такое число имеется среди введённых выведите на экран слово "Yes", иначе "No".
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Boolean flag = false;
        for ( int i = 1; i <= n; i++ ) {
            int number = sc.nextInt();
            if ( number % 10 == 4 ){
                flag = true;
                }
            }
        if (flag){
            System.out.println ("Yes");
            }
        else {
            System.out.println ("No");

// Исправьте Код!
// Вася заказал посылку из интернет магазина в постамат. Через некоторое время ему пришло сообщение с пинкодом, который, в том числе, может начинаться с 0. Постамат даёт пользователю 5 попыток ввода пинкода, если пользователь вводит неправильный пинкод, то система отправляет СМС с новым пинкодом. Определите, сможет ли Вася забрать свою посылку? 
// На вход программе даются строки попарно: пароль, который пришёл Васе и пароль, который он ввёл. Если Вася вводит неверный пароль, то на экран выводится "INCORRECT n" (где n - номер попытки), а если правильный, то "CORRECT". Если Вася исчерпал все попытки, то появляется строка "Error".
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Boolean flag = false;
        for ( int i = 1; i <= n; i++ ) {
            int number = sc.nextInt();
            if ( number % 10 == 4 ){
                flag = true;
                }
            }
        if (flag){
            System.out.println ("Yes");
            }
        else {
            System.out.println ("No");
            }
    }
}

// Когда ты будешь в двое старше?
//У старшего брата  маленького Лёши день рождения в тот же день, что и у него. Лёше сейчас n лет, а его брату - k лет. Сейчас 2020 год. необходимо определить, в каком году Брат Лёши будет ровно вдвое старше? Если такое невозможно, то выведите в консоль слово "Никогда".
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int c = k - 2*n;
        if (c>=0){
            System.out.println(c+2020);}
        else{
            System.out.println("Никогда");
        }
    }
}
// Делители
// Вводится натуральное число n. Необходимо определить количество его делителей.
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = n; i > 0; i--){
            if (n % i == 0)
                count +=1;
            }
        System.out.println(count);
    }
}

// Другая система счисления
// Вводятся целые неотрицательные числа n и k, причём 2 < k < 10.  Переведите число n из десятичной системы счисления в систему счисления с основанием k.
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = "";
        if(n == 0)
            System.out.print(n);
        while( n != 0){
            if(k >= 2 && k < 10 ){
               s = n % k + s;
               n /= k;
               }
            }
            System.out.print(s);
    }
}

// Последовательность
// Маша занималась обработкой больших и не очень больших данных. На её компьютер время от времени приходили числа и она хотела понять, каких больше: кратных 3, или отрицательных. Помогите Маше с её вопросом.
// Вводятся целые числа до тех пор, пока не будет введён 0.
// Если больше чисел, кратных 3, то выведите "333", если больше отрицательных чисел, то выведите "negative", если их одинаковое количество, то выведите "Equal".
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = 0, m = 0;
        for (int i = sc.nextInt(); i!=0; i = sc.nextInt()){
            if( i % 3 == 0)
                t++;
            if ( i < 0 )
                 m++;   
            }
        System.out.println(t>m?"333":t<m?"negative":"Equal");
    }
}

// Детский Сад
// Для постановки Сказки красная шапочка в детском саду "Солнышко" было решено выбрать самого маленького по росту ребёнка на роль красной шапочки и самого большого на роль волка. 
// На вход программе даётся число n, затем 2*n  строк. Каждая пара строк - Имя ребёнка и его рост. Выведите  на разных строках два имени: ребёнка, который будет играть красную шапочку и ребёнка, который будет играть волка. Если детей одного наименьшего или наибольшего роста несколько, то выберите первого из встретившихся. Гарантируется, что все имена различны и есть минимум 1 ребёнок.
// В силу специфики работы Scanner для считывания строки используйте именно sc.next();
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     int n = scanner.nextInt();
     String name = scanner.next();
     int height = scanner.nextInt();
     int maxHeight = height;
     int minHeight = height;
     String minName = name;
     String maxName = name;
     for(int i = 0; i < n - 1; i++) {
         name = scanner.next();
         height = scanner.nextInt();
         if(height > maxHeight){
             maxHeight = height;
             maxName = name;
         }
         if(height < minHeight) {
             minHeight = height;
             minName = name;
         }
     }
        System.out.println(minName);
        System.out.println(maxName);
    }
}
