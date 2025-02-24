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

/* Используя вложенные циклы while (цикл в цикле) выведи на экран незаполненный прямоугольник (его контур) размером 10 (высота) на 20 (ширина) из букв 'Б'.
Незаполненная часть состоит из пробелов.*/

//Незаполненный прямоугольник
public class Solution {
    public static void main(String[] args) {
        int n = 0;
        while (n < 10)
        {
            int m = 0;
            while (m < 20)
            {
                if ((n==0) || (n==9))
                    System.out.print("Б");
                else
                {
                    if ((m==0) || (m==19))
                        System.out.print("Б");
                    else
                        System.out.print(" ");
                }
                m++;
            }
            System.out.println();
            n++;
        }
    }
}
