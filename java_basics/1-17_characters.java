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

