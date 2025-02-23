/* Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму, пока пользователь не введет слово "ENTER".
Вывести на экран полученную сумму и завершить программу. */

import java.util.Scanner;

// Суммирование
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        Boolean isExit = false;
        while (!isExit)
        {
            String word = scan.nextLine();
            if (word.equals("ENTER"))
                isExit = word.equals("ENTER");
            else
                sum += Integer.parseInt(word);
        }
        System.out.println(sum);
    }
}
