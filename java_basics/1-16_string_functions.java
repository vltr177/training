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

/*Строки
Дана строка. Сначала выведите третий символ этой строки. Во второй строке выведите предпоследний символ этой строки. В третьей строке выведите первые пять символов этой строки.
В четвертой строке выведите всю строку, кроме последних двух символов. На пятой строке выведите всю строку, кроме первых 3 символов. На шестой строке выведите длину данной строки.
Гарантируется, что вводится строчке, состоящая не менее, чем из 5 символов.*/

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

/* Замена
Вася написал книгу рецептов для своего лучшего друга Коли, но забыл, что у него аллергия на один из продуктов. Тогда Вася решил заменить этот продукт на некоторый другой. Вася не хочет переписывать всю книгу, поэтому помогите ему написать программу, которая сделает это за него.
Входные данные/ На первой строке записывается, на какой продукт аллергия у Коли. На второй - на какой продукт его следует заменить. После даётся одна строка, в которой, теоретически, записана вся книга. Все слова написаны с маленькой буквы. 
Выходные данные. Выведите на экран изменённую строку. На окончания не обращайте внимание.*/

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

// Просто соедини их
// Вводится число n, затем n строчек, которые необходимо соединить. После вводится ещё одна строка - которая должна быть в качестве разделителя. Выведите одну строку - все введённые выше слова через разделитель.

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

// Кто первый?
// Дана строка, в которой через пробел перечислены цифры. На следующей строке вводится цифра. Определите индексы первого и последнего её вхождения.
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String mas = sc.nextLine();
        String n = sc.next();
        System.out.println(mas.indexOf(n));
        System.out.println(mas.lastIndexOf(n));
    }
}

/*Сколько слов?
Маша и Олег играли в игру. Маша читала статьи в газете и выписывала слова, которые начинаются на её любимую букву и заканчиваются на любимую букву её друга Олега. Олег же наоборот - слова, которые начинаются на его любимую букву и заканчиваются на любимую букву Маши. Обратите внимание, что буквы могут быть в разных регистрах (большие/маленькие).  Определите, сколько слов выписали дети.
Формат входных данных:
На первой строке вводится любимая буква Маши, на второй - Олега. Затем вводится строка, в которой перечислены слова, которые написаны в газете.
Формат выходных данных:
На первой строчке выведите, сколько слов выписала Маша, а на второй - сколько слов выписал Олег. */
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next().toLowerCase();
        String b = sc.next().toLowerCase();
        sc.nextLine();
        String text = sc.nextLine().toLowerCase();
        int masha = 0;
        int oleg = 0;
       
        String[] words = text.split(" ");
        for (String word : words){
            if ( word.startsWith(a) & word.endsWith(b) )
                masha ++;
            if ( word.startsWith(b) & word.endsWith(a) )
                oleg ++;
        }
        System.out.println(masha);
        System.out.println(oleg);        
    }
}

/* IP-адрес
Для того чтобы выходить в Интернет, каждому компьютеру присваивается так называемый IP-адрес. Он состоит из четырех целых чисел в диапазоне от 0 до 255, разделенных точками. В следующих трех строках показаны три правильных IP-адреса:
127.0.0.0
192.168.0.01
255.00.255.255
Напишите программу, которая определяет, является ли заданная строка правильным IP-адресом.
Входные данные
На вход программе подается строка длиной не более 15 символов, которая включает цифры и точки.
Выходные данные
Если строка является правильным IP-адресом, необходимо вывести YES, иначе NO.*/
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        String dot = "\\.";
        String[] array_ip = ip.split(dot);
        int rightNumber = 0;
        if (array_ip.length == 4) {
            for (int i = 0; i < array_ip.length; i++) {
                if (array_ip[i].equals("")) {array_ip[i]="256";}
                int number = Integer.parseInt(array_ip[i]);
                if (number < 0 || number > 255) {
                    System.out.println("NO");
                    break;
                }
                rightNumber++;
            }
        }else {
            System.out.println("NO");
        }
        if (rightNumber == 4) System.out.println("YES");
    }
}

/* Замена 2
Вася из задачи на слайде 9 решил улучшить алгоритм. Что если у человека есть аллергия не на один, а на несколько продуктов? да и держать книгу как одну большую строку не очень удобно. Помимо всего прочего, непривычно видеть текст без заглавных букв.  Помогите Васе улучшить алгоритм.
Входные данные
На первой строке записывается натуральное число n - количество строчек в книге. Затем вводится n строк - строки книги. потом вводится натуральное число m - количество продуктов, на которые у человека аллергия. Потом вводится m строк - вида "продукт1 - продукт2", где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт, на который следует заменить продукт1. Гарантируется что любой продукт состоит из 1 слова. название продуктов написаны строчными буквами. Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.
Выходные данные
Замените все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания не обращайте внимание. ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!*/
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] rescipes = new String[n];
        for (int i = 0; i < rescipes.length; i++)
            rescipes[i] = sc.nextLine();
        int m = sc.nextInt();
        sc.nextLine();
        String[] products = new String[m];
        for (int i = 0; i < products.length; i++)
            products[i] = sc.nextLine();
        for (int i = 0; i < rescipes.length; i++) {
            for (String product : products) {
                String[] words = product.split(" - ");
                rescipes[i] = rescipes[i].replace(words[0], words[1]);
                String allergic = words[0].substring(0, 1).toUpperCase() + words[0].substring(1);
                String prod = words[1].substring(0, 1).toUpperCase() + words[1].substring(1);
                rescipes[i] = rescipes[i].replace(allergic, prod);
            }
            System.out.println(rescipes[i]);
        }

    }
}
