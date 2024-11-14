import java.util.Scanner;
import java.util.Random;


public class choice_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = -1;                                                   // переменная с результатом поиска

        // Создаём массив и наполняем случайными числами
        int len = 100000000;                                                  // размер массива
        Random rnd = new Random();
        int[] numbers = new int[len];                                   // инициализируем массив с целыми числами заданного размера
        for (int i = 0; i < len; i++) {                                 // заполняем массив случайными значениями от 0 до 1000000
            numbers[i] = rnd.nextInt(1000);
        }

        int value = sc.nextInt();                                       // запрашиваем искомый элемент

        // Поиск с перебором значений
        System.out.println("Поиск с использованием перебора значений");
        long start = System.currentTimeMillis();
        res = search1(numbers, value);                                  // вызываем функцию простого поиска
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        print(res, elapsed);
        res = -1;

        // Бинарный поиск
        System.out.println("Бинарный поиск");
        start = System.currentTimeMillis();
        qSort(numbers, 0, len - 1);
        res = search2(numbers, value, 0, len - 1);            // вызываем функцию бинарного поиска
        finish = System.currentTimeMillis();
        elapsed = finish - start;
        print(res, elapsed);
    }


    // Функция "Поиск перебором значений"
    public static int search1(int[] numbers, int value) {
        for (int i = 0; i < numbers.length; i++) {
            if (value == numbers[i])
                return i;
        }
        return -1;
