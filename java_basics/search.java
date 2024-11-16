/* Код мой. Быструю сортировку подсмотрел, даже дважды), но смысл понимаю, ибо почитывал ранее книжку
"Грокаем алгоритмы" и велосипед нет смысла изобретать. Qsort делал ранее в питоне на 10 строк, но тема так просто
в Java не взлетела, ибо не умеет она нормально в массивы, когда их нужно быстро разрезать и клеить.
Можно было это упростить в списках, но тогда добавилось бы ещё прямое и обратное преобразование.
По быстродействию понятно, что бинарный поиск быстрее простого, если бы не сортировка.
 */

import java.util.Scanner;
import java.util.Random;

public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;                           // флаг успеха поиска
        System.out.println("Hello, Java World :)");
        System.out.println("Введите число для поиска (0..100 000):");

        // ГЕНЕРАЦИЯ МАССИВА СЛУЧАЙНЫХ ЧИСЕЛ
        int len = 100000;                               // размер массива 100 000
        Random rnd = new Random();
        int[] numbers = new int[len];                   // инициализируем массив с целыми числами заданного размера
        for (int i = 0; i < len; i++) {                 // заполняем массив случайными значениями от 0 до 100 000
            numbers[i] = rnd.nextInt(100000);
          }
        int value = sc.nextInt();                       // запрашиваем искомый элемент

        // ПРОСТОЙ ПОИСК за время O(N)
        System.out.println("ПРОСТОЙ ПОИСК");
        long start_time = System.nanoTime();            // фиксируем запуск таймера
        search1(numbers, value, flag);                  // вызов функции простого поиска
        result(flag);                                   // вывод результата простого поиска
        long end_time = System.nanoTime();
        // вывод времени поиска, нс/1 000 000 в мс
        System.out.println("Время простого поиска = " + ((end_time - start_time)/1000000) + " мс");

        flag = false;

        // БЫСТРАЯ СОРТИРОВКА МАСИВА за время O(N * log N) или O(N^2) + БИНАРНЫЙ ПОИСК O(log N)
        System.out.println("БЫСТРАЯ СОРТИРОВКА МАССИВА");
        start_time = System.nanoTime();
        qSort(numbers, 0, len - 1);          // вызов функции быстрой сортировки
        end_time = System.nanoTime();
        System.out.println("Время сортировки = " +   ((end_time - start_time)/1000000) + " мс");
        System.out.println("БИНАРНЫЙ ПОИСК");
        start_time = System.nanoTime();
        // вызов функции бинарного поиска
        search2(numbers, value, 0, len - 1, flag);
        result(flag);
        end_time = System.nanoTime();
        System.out.println("Время бинарного поиска = " +  ((end_time - start_time)/1000000) + " мс");
    }

    // ФУНКЦИЯ "ПОИСК ПЕРЕБОРОМ ЗНАЧЕНИЙ"
    public static void search1(int[] numbers, int value, boolean flag) {
        for (int i = 0; i < numbers.length; i++) {
            if (value == numbers[i]) {
                flag = true;
                return;
            }
        }
    }

    // ФУНКЦИЯ "БЫСТРАЯ СОРТИРОВКА"
    public static void qSort(int[] numbers, int low, int high) {
        if (numbers.length == 0 || low >= high) return;         // выходим если массив пустой, или всё переделили
        int base = low + (high - low) / 2;                      // новый опорный элемент по центру массива
        int border = numbers[base];
        //Обмен элементами массива
        int i = low, j = high;
        while (i <= j) {
            while (numbers[i] < border) i++;
            while (numbers[j] > border) j--;
            if (i <= j) {
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
                i++;
                j--;
            }
        }
        //рекурсивная сортировка частей массива
        if (low < j) qSort(numbers, low, j);
        if (high > i) qSort(numbers, i, high);
    }

    // ФУНКЦИЯ "БИНАРНЫЙ ПОИСК"
    public static void search2(int[] numbers, int value, int low, int high, boolean flag) {
        while (low <= high) {                   // делаем, пока индексы не сравняются
            int mid = (low + high) / 2;         // динамически меняем центр в зависимости от новой области
            int label = numbers[mid];           // запоминаем середину области поиска
            if (value == label) {               // если нашли искомое, выходим
                flag = true;
                return;
            }
            if (value < label)                 // если недолёт, сужаем область поиска до левой части области минус центр
                high = mid - 1;
            if (value > label)                 // если перелёт, сужаем область поиска до правой части плюс центр
                low = mid + 1;
        }
    }

    // ФУНКЦИЯ "ВЫВОД РЕЗУЛЬТАТА"
    public static void result(boolean flag) {
        if (!flag) {
            System.out.println("Элемент найден");
        } else {
            System.out.println("Элемент не найден");
        }
    }
}
