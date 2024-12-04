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

