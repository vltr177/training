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

