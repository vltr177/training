// Задача 1
// Вводится натуральное число n. Допишите код, который создаст массив с именем array на n элементов, в котором буду храниться числа от 0 до n - 1 (элемент равен индексу).
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = i;
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}

// Задача 2
// Вводится натуральное число n. Допишите код, который создаст массив с именем array на n элементов, в котором буду храниться квадраты чисел от 0 до n - 1 (элемент равен квадрату индекса).
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = (int) Math.pow(i,2);
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}

// Задача 3
//Вводится натуральное число n. На следующей строчке вводятся n целых чисел. Допишите код, который создаст массив с именем array на n элементов, в котором буду храниться введённые числа (элемент массива равен соответствующему числу в во второй строке).
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}

/* Задача 4 (легко)
Вводится натуральное число n. На следующей строчке вводятся n целых чисел. Напишите код, который создаст массив с именем array на n элементов, в котором буду храниться введённые числа
(элемент массива равен соответствующему числу в во второй строке). На следующей строке вводится 2 числа - индексы элементов, сумму которых вам надо найти.
Выведите на экран сумму этих двух элементов. Гарантируется, что индексы лежат в диапазоне от 0 до n - 1. */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        int sum = array[index1] + array[index2];
        System.out.print(sum);
    }
}

/* Задача 5 (средне)
Вводится натуральное число n. На следующей строчке вводятся n целых чисел. Напишите код, который создаст массив с именем array на n элементов, в котором буду храниться введённые числа
(элемент массива равен соответствующему числу в во второй строке). На следующей строке вводится 2 числа - индексы элементов, сумму которых вам надо найти. Выведите на экран сумму этих двух элементов.
Если вдруг индекс индекс оказался вне пределов диапазона от 0 до n - 1, то выведите на экран слово Error. */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        if ((index1 < 0) || (index1 > n-1) || (index2 < 0) || (index2 > n-1)){
            System.out.print("Error");
        }
        else {
            int sum = array[index1] + array[index2];
            System.out.print(sum);
        }
    }
}

/* Задача 6 (сложно)
Вводится натуральное число n. На следующей строчке вводятся n целых чисел. Напишите код, который создаст массив с именем array на n элементов, в котором буду храниться введённые числа
(элемент массива равен соответствующему числу в во второй строке). На следующей строке вводится число t - Количество запросов к вашей программе. Каждый запрос состоит из пары целых чисел и записывается на отдельной строке.
Каждая пара чисел - индексы элементов, сумму которых вам надо найти. Выведите на экран сумму этих двух элементов для каждого запроса на каждой строке по отдельности. Если вдруг индекс индекс оказался вне пределов диапазона от 0 до n - 1,
то выведите на экран слово Error. */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int index1 = sc.nextInt();
            int index2 = sc.nextInt();
            if ((index1 < 0) || (index1 > n-1) || (index2 < 0) || (index2 > n-1)){
                System.out.println("Error");
            }
            else {
                int sum = array[index1] + array[index2];
                System.out.println(sum);
            }
        }
    }
}

/* Задача 7
Вводится натуральное число n (n > 1). На следующей строчке вводятся n целых чисел. Считайте их как массив на n элементов. Выведите на экран n - 1 число: сумму первого элемента и второго, затем сумму второго и третьего, третьего и четвёртого и т.д.
Подсказка: Обратите внимание, что в данном случае на каждой итерации циклам вам необходимо знать сразу два элемента массива. В таком случае обычно поступают так: внутри цикла обращаются сразу к элементам с индексами i - 1 и i, 
н при этом начинают перебирать значения в цикле не с 0, а с 1. Иначе выйдем за пределы массива. */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        for (int i = 1; i < n; i++)
            System.out.print(array[i-1] + array[i] + " ");
    }
}

// Задача 8
// Вводится натуральное число n (n > 1). На следующей строчке вводятся n целых чисел. Считайте их как массив на n элементов. Найдите количество элементов, которые больше предыдущего элемента.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        for (int i = 1; i < n; i++){
            if (array[i] > array[i-1])
                count += 1;
        }
        System.out.print(count);
    }
}

// Задача 9
// Вводится натуральное число n. На следующей строчке вводятся n целых чисел. Считайте их как массив на n элементов. Затем вводится число k. Найдите индекс элемента k. Если такого элемента нет в массиве, выведите на экран слово Error.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++){
            if (array[i] == k){
                System.out.print(i);
                break;
            }
            if (i == n -1)
                System.out.print("Error");
        }
    }
}

// Задача 10
// Вводится натуральное число n. На следующей строчке вводятся n целых чисел. Считайте их как массив на n элементов. Затем вводится число k. Найдите количество элементов в массиве равных k.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++){
            if (array[i] == k)
                count += 1;
        }
        System.out.print(count);
    }
}

//Задача 11
// Вводится натуральное число n. На следующей строчке вводятся n целых чисел. Считайте их как массив на n элементов. Затем вводится число k. Найдите сумму первых k элементов. Гарантируется, что 0 < k <= n.
// 1. Если среди элементов массива есть значение равное k, то считаем до этого момента . 2. Если среди элементов массива нет значения равному k, то считаем сумму элементов k .
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < k; i++){
            if (array[i] == k)
                break;
            sum += array[i];
        }
        System.out.print(sum);
    }
}

// Задача 12
// Вводится натуральное число n. На следующей строчке вводятся n целых чисел. Считайте их как массив на n элементов. на следующей строке вводятся два индекса: l и r.
// Найдите среднее арифметическое всех элементов с индексами от l до r включительно. Выведите в ответ одно действительное число. Гарантируется, что 0 <= l <= r < n.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        int I = sc.nextInt();
        int r = sc.nextInt();
          for (int i = I; i <= r; i++)
            sum += array[i];
        System.out.print((float) sum/(r-I+1));
    }
}
