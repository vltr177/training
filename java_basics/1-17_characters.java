// Подсчёт c учётом регистра
// Вводится строка, найдите, сколько раз в ней встречается буква "f". Подсчитайте количество вхождений только "маленькой буквы".
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] letters = text.toCharArray();
        int count = 0;
        
        for (char letter : letters)
            if (letter == 'f')
                count++;
        System.out.println(count);
    }
}

// Подсчёт без учёта регистра
// Вводится строчка текста, затем, на следующей строке, одна буква латинского алфавита. Найдите, сколько раз в тексте встречается введённый символ в любом регистре. Учтите, что цифры не имеют разницы в записи нижнего и верхнего регистров.
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();
        char sample  = Character.toLowerCase(sc.next().charAt(0));
        char[] letters = text.toCharArray();
        int count = 0;

        for (char letter : letters)
            if (letter == sample)
                count++;
        System.out.println(count);
    }
}

// Кого больше?
// Вводится строка, определите, каких символов в ней больше: цифр или букв? Напоминаю, что знаки препинания и пробелы, например. не являются ни тем ни другим. Если в строчке больше цифр, то выведите на экран слово "Digit", иначе выведите "Letter". Если же их равное количество, то выведите слово "Equal".
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] symbols = text.toCharArray();
        int letters = 0;
        int digits = 0;
        String ans = "";
        

        for (char symbol : symbols){
            if (Character.isDigit(symbol))
                digits++;
            if (Character.isLetter(symbol))
                letters++;
        }
        if (digits > letters)
            ans = "Digit";
        if (digits < letters)
            ans = "Letter";
        if (digits == letters)
            ans = "Equal";
        System.out.println(ans);
    }
}

// Уберите лишнее
// Вводится строка. уберите из неё все символы, которые не являются ни цифрой, ни буквой, ни пробелом.
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] symbols = text.toCharArray();
        
        for (char symbol : symbols)
            if ( Character.isDigit(symbol) || Character.isLetter(symbol) || Character.isSpace(symbol) )
                System.out.print(symbol);
    }
}

/* Палиндром
Вводится строка. определите, является ли она палиндромом. Напоминаю,  что палиндром - это слово/строка, которая читается одинаково слева направо и справа налево. В ответ выведите YES/No */
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();
        text = text.replaceAll(" ", "");
        char[] sym = text.toCharArray();
        char[] rev_sym = new char [sym.length];
        boolean flag = true;

        for (int i = 1; i <= sym.length; i++){
            rev_sym[i-1] = sym[sym.length - i];
            if (sym[i-1] != rev_sym[i-1]){
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

//Самое длинное слово
// Вводится единственная строка без знаков препинания. Определите длину самого длинного слова в ней.
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = text.split(" ");
        int len = 0;

        for (String word : words)
            if (word.length() > len)
                len = word.length();
        System.out.println(len);
    }
}

/* Самый часто встречаемый символ
Вводится единственная непустая строка, состоящая исключительно из букв латинского алфавита и пробелов. Определить самую часто встречаемую букву и вывести на экран эту букву и количество её вхождений в строку. Учтите, что буквы могут быть записаны в разном регистре. Если таких букв несколько, то выведите первую по алфавиту.
Примечание
Ответ записывается в нижнем регистре на одной строке через пробел*/
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();
        String calib = "abcdefghijklmnopqrstuvwxyz";
        text = text.replaceAll(" ", "");
        char[] symbols = text.toCharArray();
        char[] sample = calib.toCharArray();        
        int max = 0;
        char ans = ' ';

        for (int i=0; i<sample.length; i++){
            int count = 0;
            for (int j=0; j < symbols.length; j++){
                if (sample[i] == symbols[j])
                    count++;
            }
            if (count > max){
                max = count;
                ans = sample[i];
            }
        }
        System.out.println(ans + " " + max);
    }
}

/*Второклассная задача
У второклассников очень популярна следующая задача:
101 = 1
8181515 = 4
1111112 = 0
8888888 = 14
1010101 = 3
7000007 = ?
Преподавателю программирования в некоем Центре для одаренных детей так понравилась эта задачка, что он решил именно ее использовать для проверки знаний математики 2-го класса у своих учеников.
Пусть первое число x, а соответствующее ему n
Входные данные
Единственное неотрицательное число x, не превышающее 101001.
Выходные данные
Выведите n. */
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] a = sc.nextLine().toCharArray();
        int count=0;
        for (int i=0;i<a.length;i++){
            if (a[i] == '0' || a[i] == '6' || a[i] == '9') count++;
            if (a[i] == '8') count=count+2;
        }
        System.out.println(count);
    }
}
