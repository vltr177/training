import java.util.Scanner;
import java.util.Random;

class choice_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = -1;                                           // переменная с результатом поиска

        // Создаём массив и наполняем случайными числами
        int len = 100;                                          // размер массива
        Random rnd = new Random();
        int[] numbers = new int[len];                           // инициализируем массив с целыми числами заданного размера
        for (int i = 0; i < len; i++) {                         // заполняем массив случайными значениями от 0 до 1000000
            numbers[i] = rnd.nextInt(100);
        }

        // Поиск
        int value = sc.nextInt();                               // запрашиваем искомый элемент
        int choise = sc.nextInt();                              // запрашиваем метод поиска (1 - простой, !1 - бинарный)
        if (choise == 1) {
            res = search1(numbers, value);
            // вызываем функцию простого поиска
            }
        else {
            // сортируем массив
            qSort(numbers, 0, len - 1);
            for (int i = 0; i < len; i++){
                System.out.println(numbers[i]);
            // ищем бинарным поиском
            res = search2(numbers, value, 0, len - 1);
            }
        }
        if (res != -1) {                                        // выводим результат
            System.out.println("Элемент найден в позиции " + res);
        } else {
            System.out.println("Элемент не найден");
        }
    }

    // Функция простого поиска
    public static int search1(int[] numbers, int value) {
        for (int i = 0; i < numbers.length; i++) {
            if (value == numbers[i])
                return i;
        }
        return -1;
    }


    // Функция быстрой сортировки массива
    public static void qSort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        qSort(array, begin, pivot-1);
        qSort(array, pivot+1, end);
    }
    static int partition(int[] array, int begin, int end) {
        int pivot = end;

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



    // Функция бинарного поиска

    public static int search2(int[] numbers, int value, int left, int right) {
        int label = left + (right - left) / 2;
        System.out.print((right-left) + "D");
        if (value < numbers[label]) {
            left = left;
            right = left + label;   
        }
        if (value > numbers[label]) {
             left = left + label;
             right = right;
        }
        if (value == numbers[label])
            return label;
        if ((right - left ) < 1 )
            return -1;
        return search2(numbers, value, left, right);
    }


    // Функция измерения времени


}