// Путешествуя, ВАЛЛ-И попал в логово к Дракону. Чтобы остаться в живых ему надо угадать число, которое задумали его головы. Первая голова называет любое целое число, вторая - увеличивает его на 3, а третья результат уменьшает в 2 раза. Составьте программу, которая позволит ВАЛЛ-И безошибочно вычислять результат.

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    float a = sc.nextInt();
    System.out.println( (a + 3) / 2);
    }
}

/*
Робот ВАЛЛ-И каждый день меняет пароль от своей учетной записи на обучающей платформе. Ему нравится придумывать числа разной длины и суммировать их последние цифры.
К получившемуся значению он добавляет строчные согласные буквы, входящие в его имя на латинице. Составьте программу для ВАЛЛ-И, которая позволяла бы ему придумывать 3 любых целых числа и выдавала бы пароль на текущий день.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int a2 = a % 10;
    int b2 = b % 10;
    int c2 = c % 10;
    System.out.println( (a2 + b2 + c2) + "vll"); 
    }
}

/*
Робот ВАЛЛ-И решил отправиться в соседний город. Половину пути он проехал за t часов со скоростью x км/ч , а остальное расстояние со скоростью y км/ч. Рассчитайте, сколько времени ВАЛЛ-И был в пути.

Входные данные:
Построчно вводятся 3 целых неотрицательных числа:

t - время, затраченное на первую половину пути
x - скорость на первой половине пути
y - скорость на второй половине пути
Гарантируется, что ВАЛЛ-И проехал целое число часов!!!
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t1 = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int s1 = x * t1;
    int t2 = s1 / y; 
    System.out.println( t1 + t2 ); 
    }
}

/*
ВАЛЛ-И решил отметить день рождения и пригласил x друзей. На каждого гостя ему необходимо приготовить 10 грамм заварки и по n пирожному. Килограмм чая на развес стоит t рублей, а одно пирожное - k рублей. Во сколько обойдется ВАЛЛ-И чаепитие? Гарантируется, что все числа в решения задачи окажутся целыми.

Входные данные:
Вводятся 4 целых неотрицательных числа:

x - количество приглашенных друзей
t - стоимость килограмма чая
k - стоимость одного пирожного
n - количество пирожных
Выходные данные:
выведите одно целое число - ответ на задачу.

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int t = sc.nextInt();
    int k = sc.nextInt();
    int n = sc.nextInt();
    int cakes = n * k * x;
    int tea = t / 100 * x;
    System.out.println( cakes + tea ); 
    }
}

/*
ВАЛЛ-И хочет по электронным часам, показывающим часы и минуты,  узнать сколько времени в минутах прошло от начала суток.

Входные данные:
два числа: часы (0 <= h < 24) и минуты (0 <= m < 60)

Выходные данные:
время от начала суток в минутах
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int m = sc.nextInt();
    System.out.println( ( 60 * h)  + m ); 
    }
}

/*
ВАЛЛ-И очень любит читать. В его книге n страниц и каждый день он читает по s страниц. Составьте программу, которая считает, сколько страниц останется ВАЛЛ-И прочитать через 5 дней.

Входные данные:
Вводятся два целых неотрицательных числа:

n - количество страниц в книге
s  - количество страниц, которые прочитывает ВАЛЛ-И каждый день
Выходные данные:
выведите на экран ответ на задачу: сколько страниц останется прочитать ВАЛЛ-И через 5 дней.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int s = sc.nextInt();
    int read = 5 * s;
    System.out.println( n - read ); 
    }
}

/*
ВАЛЛ-И очень любит читать. В его книге n страниц и каждый день он читает по s страниц. Составьте программу, которая считает, сколько страниц останется ВАЛЛ-И прочитать через d дней.

Входные данные:
Вводятся три целых неотрицательных числа:

n - количество страниц в книге
s  - количество страниц, которые прочитывает ВАЛЛ-И каждый день
d - количество дней
Выходные данные:
выведите на экран ответ на задачу: сколько страниц останется прочитать ВАЛЛ-И через d дней.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int s = sc.nextInt();
    int d = sc.nextInt();
    int read = d * s;
    System.out.println( n - read ); 
    }
}

/*
ВАЛЛ-И встретил n детей и хочет разделить между ними k яблок так, чтобы каждому досталось поровну. Не делящийся остаток он собирается отнести ЕВЕ. Сколько яблок достанется каждому ребенку? Сколько яблок получит ЕВА?

Результат выведите в одной строке через пробел в указанном порядке.

Входные данные:

два натуральных числа: 

n - количество детей
k - количество яблок
Выходные данные:

выведите ответ на задачу
/*

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int childrens = k / n;
    int eva = k - (childrens * n);
    System.out.println( childrens + " " + eva ); 
    }
}

/*
ВАЛЛ-И, катаясь на лифте, заметил, что между двумя соседними этажами он проезжает за t  секунд. Составьте программу, помогающую ВАЛЛ-И рассчитать, за сколько секунд он поднимется на этаж с номером n.

Входные данные:

программа получает на вход два натуральных числа:
t - время в секундах, за которое лифт поднимается на один этаж
n - номер этажа, на который надо подняться ВАЛЛ-И
Выходные данные:
выведите ответ на задачу
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int n = sc.nextInt();
    int time = t * (n-1);
    System.out.println( time ); 
    }
}

/*
Робот ВАЛЛ-И любит играть в такую игру: он называет натуральное число, а ЕВА берет последнюю цифру этого числа и увеличивает на n. Какое число получила ЕВА?

Входные данные:
программа получает на вход два натуральных числа:
x - число, которое загадывает ВАЛЛ-И
n - на сколько увеличивается последняя цифра
Выходные данные:
выведите ответ на задачу
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();
    int number = (x % 10) + n;
    System.out.println( number ); 
    }
}

/*
ВАЛЛ-И собирается съездить на уборку в соседний город и хочет рассчитать время на дорогу. По карте он определил расстояние s в километрах и настроил свою скорость равной v км/ч. Составьте программу, которая поможет ВАЛЛ-И определять время, проводимое в пути.

Входные данные:
s - расстояние
v - скорость
Выходные данные:
выведите ответ на задачу
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float s = sc.nextInt();
    int v = sc.nextInt();    
    float time = s / v;
    System.out.println( time ); 
    }
}

/*
ВАЛЛ-И за 1 день выучивает n иностранных слов. Составьте программу, которая рассчитает, сколько иностранных слов выучит робот за d дней.

Входные данные:

n - количество слов
d - количество дней
Выходные данные:

выведите ответ на задачу
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    System.out.println( n * d ); 
    }
}

/*
ВАЛЛ-И случайно забрел на ферму, где увидел лошадей и гусей. Лошадей он насчитал h штук, гусей - g штук. Составьте программу, которая бы помогла ВАЛЛ-И узнать количество ног обитателей фермы.

Входные данные:

h - количество лошадей
g - количество гусей
Выходные данные:

выведите ответ на задачу
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int g = sc.nextInt();
    System.out.println( (2 * g) + (4 * h) ); 
    }
}

/*

ВАЛЛ-И и ЕВА решили встретиться и выехали навстречу друг другу. Скорость ВАЛЛ-И составляет x км/ч, а ЕВЫ - y км/ч. Когда они встретились, то ВАЛЛ-И сообщил, что был в пути t часов, а ЕВА сказала, что потратила на дорогу m часов. Составьте программу, которая бы вычислила, какое расстояние было между ВАЛЛ-И и ЕВОЙ в момент их отправления.

Входные данные:
x - скорость ВАЛЛ-И
y - скорость ЕВЫ
t - время ВАЛЛ-И
m - время ЕВЫ
Выходные данные:
выведите ответ на задачу
*/



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int t = sc.nextInt();
    int m = sc.nextInt();
    int s1 = x * t;
    int s2 = y * m;
    System.out.println( s1 + s2 ); 
    }
}

/*
ВАЛЛ-И называет натуральное число, а ЕВА записывает 3 последовательных числа, следующих после него. Напишите программу, которая выводит числа  ЕВЫ через черточку.
Входные данные:
натуральное число
Выходные данные:
выведите ответ на задачу
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    System.out.println( (x+1) + "-" + (x+2) + "-" + (x+3) ); 
    }
}

