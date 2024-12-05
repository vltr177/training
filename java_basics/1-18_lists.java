// Вспомним for
// Напишите программу, которая считает натуральное число n, а затем выведет на экран построчно все числа от 1 до n включительно.
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
            System.out.println(i);
    }
}

// Повторение Строк
// Напишите программу, которая считает строку и определит, есть ли в ней именно слово "повторение". Слово может быть написано как с маленькой, так и с большой буквы.  Гарантируется, что знаки препинания из текста были удалены. На экран выведите YES/NO.
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();
        if (text.contains("повторение ") || text.contains(" повторение") )
            System.out.println("YES");
        else
            System.out.println("NO");       
    }
}

// Создание списка
// Напишите программу, которая считает натуральное число n c клавиатуры и создаст список, в котором первый и последний элементы будут равны строчке 1, а между ними будет n 0. Выведите список на экран через пробел. 
import java.util.Scanner;
import java.util.ArrayList;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        list.add(1);
        for (int i = 0; i<n; i++)
            list.add(0);
        list.add(1);
        for (int i = 0; i<n+2; i++)
            System.out.print(list.get(i) + " ");
    }
}

/* Добавление элемента
Напишите программу, которая считает натуральное число n c клавиатуры и создаст список, в котором будут хранится строковые представления чисел от 0 до n-1. Затем программа считывает число m (m <= n) и строку s. Вставьте строку s на позицию m. Выведите список на экран через пробел. */
import java.util.Scanner;
import java.util.ArrayList;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int n = sc.nextInt();
        String s_n = "";
        for (int i = 0; i<n; i++)
            list.add(s_n.valueOf(i));
        int m = sc.nextInt();
        String s = sc.next();
        list.add(m,s);
        for (String word : list)
            System.out.print(word + " ");
    }
}

/* Замена элемента
Напишите программу, которая считает натуральное число n c клавиатуры и создаст список, в котором будут хранится строковые представления чисел от 0 до n-1. Затем программа считывает число m (m < n) и строку s. Замените строкой s элемент на позиции m. Выведите список на экран через пробел. */


