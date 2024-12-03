/*Это цифра?
Напишите программу, определяющую, является ли данный символ цифрой или нет.
Входные данные
Задан единственный символ c.
Выходные данные
Необходимо вывести  строку "yes", если символ является цифрой, и строку "no" в противном случае.*/
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if ( (c>='0') & (c<='9'))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}

2------

import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        char [] part5 = new char[5];
        String text = sc.next();
        int len = text.length();
        System.out.println(text.charAt(2));
        System.out.println(text.charAt(len-2));
//        text.getChars(0, 5, part5, 0);
//        System.out.println(part5);
        System.out.println(text.substring(0,5));
        System.out.println(text.substring(0,len-2));
        System.out.println(text.substring(3,len));
        System.out.println(len);
    }
}

3----

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        String text = sc.nextLine();
        String new_text = text.replace(word1, word2);
        System.out.println(new_text);
    }
}

4----

import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i=0;i<n;i++)
            words[i] = sc.next();
        String splitter = sc.next();
        String ans = String.join(splitter, words);
        System.out.println(ans);
    }
}


