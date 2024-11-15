import java.util.Scanner;
import java.util.Random;


public class choice_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = -1;                                                   // переменная с результатом поиска

        // Создаём массив и наполняем случайными числами
        int len = 10000000;                                                  // размер массива
        Random rnd = new Random();
        int[] numbers = new int[len];                                   // инициализируем массив с целыми числами заданного размера
        for (int i = 0; i < len; i++) {                                 // заполняем массив случайными значениями от 0 до 1000000
            numbers[i] = rnd.nextInt(10000000);
        }

        int value = sc.nextInt();                                       // запрашиваем искомый элемент

        // Поиск с перебором значений
        System.out.println("ПРОСТОЙ ПОИСК");
        long start_time = System.nanoTime();
        res = search1(numbers, value);                                  // вызываем функцию простого поиска
        result(res);
        long end_time = System.nanoTime();
        System.out.println("Время простого поиска = " + ((end_time - start_time)/1000000) + " мс");

        res = -1;

        // Бинарный поиск
        System.out.println("БЫСТРАЯ СОРТИРОВКА МАССИВА");
        start_time = System.nanoTime();
        qSort(numbers, 0, len - 1);
        end_time = System.nanoTime();
        System.out.println("Время сортировки = " +   ((end_time - start_time)/1000000) + " мс");
        System.out.println("БИНАРНЫЙ ПОИСК");
        start_time = System.nanoTime();
        res = search2(numbers, value, 0, len - 1);            // вызываем функцию бинарного поиска
        result(res);
        end_time = System.nanoTime();
        System.out.println("Время бинарного поиска = " +  ((end_time - start_time)/1000000) + " мс");
    }


    // Функция "Поиск перебором значений"
    public static int search1(int[] numbers, int value) {
        for (int i = 0; i < numbers.length; i++) {
            if (value == numbers[i])
                return i;
        }
        return -1;
    }

    // ФУНКЦИЯ "Быстрая сортировка массива"
    public static void qSort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        qSort(array, begin, pivot-1);
        qSort(array, pivot+1, end);
    }
    // ФУНКЦИЯ "Перераспределение массива для быстрой сортировки"
    static int partition(int[] array, int begin, int end) {
        int pivot = array[begin + (end - begin) / 2];

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }

    // ФУНКЦИЯ "Бинарный поиск"
    public static int search2(int[] numbers, int value, int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2;
            int label = numbers[mid];
            if (value == label)
                return mid;
            if (value < label)
                high = mid - 1;
            if (value > label)
                low = mid + 1;
        }
        return -1;
    }

    public static void result(int res) {
        if (res != -1) {                                                // выводим результат
            System.out.println("Элемент найден в позиции " + res);
        } else {
            System.out.println("Элемент не найден");
        }
    }
}
