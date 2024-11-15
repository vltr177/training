import java.util.Scanner;
import java.util.Random;

public class choice_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;                           // флаг успеха поиска

        // ГЕНЕРАЦИЯ МАССИВА СЛУЧАЙНЫХ ЧИСЕЛ
        int len = 100000;                               // размер массива 100 000
        Random rnd = new Random();
        int[] numbers = new int[len];                   // инициализируем массив с целыми числами заданного размера
        for (int i = 0; i < len; i++) {                 // заполняем массив случайными значениями от 0 до 100 000
            numbers[i] = rnd.nextInt(100000);
        }
        int value = sc.nextInt();                       // запрашиваем искомый элемент

        // ПРОСТОЙ ПОИСК O(N)
        System.out.println("ПРОСТОЙ ПОИСК");
        long start_time = System.nanoTime();            // фиксируем запуск таймера
        search1(numbers, value, flag);                  // вызов функции простого поиска
        result(flag);                                   // вызов результата простого поиска
        long end_time = System.nanoTime();
        // вывод времени поиска, нс/1 000 000 в мс
        System.out.println("Время простого поиска = " + ((end_time - start_time)/1000000) + " мс");

        flag = false;

        // БЫСТРАЯ СОРТИРОВКА МАСИВА O(N * log N) || (O * N^2) + БИНАРНЫЙ ПОИСК O(log N)
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

    // Функция "Поиск перебором значений"
    public static void search1(int[] numbers, int value, boolean flag) {
        for (int i = 0; i < numbers.length; i++) {
            if (value == numbers[i]) {
                flag = true;
                return;
            }
        }
        return;
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
    public static void search2(int[] numbers, int value, int low, int high, boolean flag) {
        while (low <= high) {
            int mid = (low + high) / 2;
            int label = numbers[mid];
            if (value == label) {
                flag = true;
                return;
            }
            if (value < label)
                high = mid - 1;
            if (value > label)
                low = mid + 1;
        }
        return;
    }

    // ФУНКЦИЯ "Вывод результата"
    public static void result(boolean flag) {
        if (flag == false) {
            System.out.println("Элемент найден");
        } else {
            System.out.println("Элемент не найден");
        }
    }
}
