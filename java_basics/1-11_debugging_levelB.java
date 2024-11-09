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
            }
    }
}
