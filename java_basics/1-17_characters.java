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
