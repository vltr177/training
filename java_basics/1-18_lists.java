// Вспомним for
// Напишите программу, которая считает натуральное число n, а затем выведет на экран построчно все числа от 1 до n включительно.
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
            System.out.println(i);
    }
}

// Повторение Строк
// Напишите программу, которая считает строку и определит, есть ли в ней именно слово "повторение". Слово может быть написано как с маленькой, так и с большой буквы.  Гарантируется, что знаки препинания из текста были удалены. На экран выведите YES/NO.
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();
        if (text.contains("повторение ") || text.contains(" повторение") )
            System.out.println("YES");
        else
            System.out.println("NO");       
    }
}

// Создание списка
// Напишите программу, которая считает натуральное число n c клавиатуры и создаст список, в котором первый и последний элементы будут равны строчке 1, а между ними будет n 0. Выведите список на экран через пробел. 
import java.util.Scanner;
import java.util.ArrayList;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        list.add(1);
        for (int i = 0; i<n; i++)
            list.add(0);
        list.add(1);
        for (int i = 0; i<n+2; i++)
            System.out.print(list.get(i) + " ");
    }
}

/* Добавление элемента
Напишите программу, которая считает натуральное число n c клавиатуры и создаст список, в котором будут хранится строковые представления чисел от 0 до n-1. Затем программа считывает число m (m <= n) и строку s. Вставьте строку s на позицию m. Выведите список на экран через пробел. */
import java.util.Scanner;
import java.util.ArrayList;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int n = sc.nextInt();
        String s_n = "";
        for (int i = 0; i<n; i++)
            list.add(s_n.valueOf(i));
        int m = sc.nextInt();
        String s = sc.next();
        list.add(m,s);
        for (String word : list)
            System.out.print(word + " ");
    }
}

/* Замена элемента
Напишите программу, которая считает натуральное число n c клавиатуры и создаст список, в котором будут хранится строковые представления чисел от 0 до n-1. Затем программа считывает число m (m < n) и строку s. Замените строкой s элемент на позиции m. Выведите список на экран через пробел. */
import java.util.Scanner;
import java.util.ArrayList;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int n = sc.nextInt();
        String s_n = "";
        for (int i = 0; i<n; i++)
            list.add(s_n.valueOf(i));
        int m = sc.nextInt();
        String s = sc.next();
        list.add(m,s);
        for (String word : list)
            System.out.print(word + " ");
    }
}

/* Удаление элемента
Напишите программу, которая считает натуральное число n c клавиатуры и создаст список, в котором будут хранится строковые представления чисел от 0 до n-1. Затем программа считывает число m (m < n). Удалите  элемент на позиции m. Выведите список на экран через пробел */
import java.util.Scanner;
import java.util.ArrayList;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int n = sc.nextInt();
        String s_n = "";
        for (int i = 0; i<n; i++)
            list.add(s_n.valueOf(i));
        int m = sc.nextInt();
        list.remove(m);
        for (String word : list)
            System.out.print(word + " ");
    }
}


/*Очередь
Напишите программу, которая реализует структуру данных очередь, используя список.
Условие задачи таково: пользователь листает список музыки и добавляет в плейлист понравившиеся ему композиции. Когда песня доигрывает, включается следующая. Вам необходимо вывести на экран через пробел композиции, которые будут играть далее.
Сначала вводится число n - количество запросов к вашей программе. Каждый из запросов будет иметь один следующих видов:
push <Название трека> - добавляет трек в плейлист
pop - удаляет из плейлиста первый трек. При этом на экран выводится запись вида "воспроизводится <название трека>"
После выполнения всех запросов выведите оставшиеся в очереди треки. Гарантируется, что название трека состоит из одного слова.*/
import java.util.Scanner;
import java.util.ArrayList;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> playlist = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        String cmd = "";
        String song = "";
        for (int i = 0; i<n; i++){
            cmd = sc.nextLine();
            if (cmd.contains("push")){
                song = cmd.replace("push ","");
                playlist.add(song);                
            }
            if (cmd.contains("pop")){
                System.out.println("воспроизводится "+ playlist.get(0));
                playlist.remove(0);
            }
        }
        for (String play : playlist)
            System.out.print(play + " ");
    }
}


/* Я Занимала!
Напишите программу, которая будет формировать очередь оформления заявок в МФЦ. Сначала водится число n -  количество запросов в вашей программе. Каждый из запросов будет иметь один следующих видов:
"Добавить <ИМЯ>" - Добавить человека с именем ИМЯ в конец очереди
"Следующий!" - вызвали человека, следующего первым по очереди. При этом человек с именем ИМЯ уходит из очереди. 
"<ИМЯ1> занимала за <ИМЯ2>" - человек с именем ИМЯ1 становится в очередь за человеком по имени ИМЯ2. гарантируется, что человек, за которым занимали очередь стоит в ней.
Гарантируется, что все люди имеют различные имена и при вызове следующего человека, очередь не пуста.
Выведите на экран через пробел очередь после совершения всех запросов. */
import java.util.Scanner;
import java.util.ArrayList;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> queue = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        String cmd = "";
        String name1 = "";
        String name2 = "";
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i<n; i++){
            cmd = sc.nextLine();
            if (cmd.contains("Добавить")){
                name1 = cmd.replace("Добавить ","");
                queue.add(name1);                
            }
            if (cmd.contains("занимала за")){
                index1 = cmd.indexOf("за");
                index2 = cmd.lastIndexOf("за");
                name1 = cmd.substring(0,index1 - 1);
                name2 = cmd.substring(index2 + 3);
                queue.add(queue.indexOf(name2) + 1, name1);
            }
            if (cmd.contains("Следующий!")){
                queue.remove(0);                
            }
        }
        for (String person : queue)
            System.out.print(person + " ");
    }
}

/*Стек
Напишите программу, которая реализует структуру данных стек, используя список.
Условие задачи таково: мальчик Петя использует свой стул в качестве многоместной вешалки. А именно: накидывает на него вещи. Иногда он забирает верхнюю вещь. Нужно вывести на экран порядок его вещей от спинку стула.
Сначала водится число n - количество запросов в вашей программе. Каждый из запросов будет иметь один следующих видов:
push <одежда> - Петя вешает на стул элемент одежды
pop - снимает одежду со стула. При этом на экран выводится запись вида "Петя взял <одежда>"
После выполнения всех запросов выведите оставшиеся на стуле вещи. Гарантируется, что название вещи состоит из одного слова. */
import java.util.Scanner;
import java.util.ArrayList;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> wear = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        String cmd = "";
        String name = "";
        for (int i = 0; i<n; i++){
            cmd = sc.nextLine();
            if (cmd.contains("push")){
                name = cmd.replace("push ","");
                wear.add(name);                
            }
            if (cmd.contains("pop")){
                System.out.println("Петя взял " + wear.get(wear.size() - 1));
                wear.remove(wear.size() - 1);
            }
        }
        
        for (String thing : wear)
            System.out.print(thing + " ");
    }
}

/*Я Занимала 2!
Напишите программу, которая будет формировать очередь оформления заявок в МФЦ. Сначала водится число n -  количество запросов в вашей программе. Каждый из запросов будет иметь один следующих видов:
"Добавить <ИМЯ>" - Добавить человека с именем ИМЯ в конец очереди. Вывести на экран фразу "<ИМЯ> в очереди"
"Следующий!" - вызвали человека, следующего первым по очереди. При этом человек с именем ИМЯ уходит из очереди и на экране появляется строка вида "<ИМЯ> в обработке". 
"<ИМЯ1> занимала/занимал за <ИМЯ2>" - человек с именем ИМЯ1 становится в очередь за человеком по имени ИМЯ2. Если этот человек сейчас находится в обработке, то ИМЯ1 становится в начало очереди. Если такого человека в очереди нет, то ИМЯ1 становится в конец списка, при этом в консоль выводится фраза "<ИМЯ1, не надо тут ля-ля>".
"Посмотреть очередь" - на экран в консоль выводится вся очередь через пробел.
"Стоит ли оно того? <ИМЯ>" - человек с именем ИМЯ смотрит на очередь, если в ней сейчас меньше 5 человек, то он становится в конец очереди, если нет - то уходит, а в консоли появляется надпись "Слабак!"
Помимо этого, если вызывают следующего человека, а в очереди никого нет, то вывести в консоль фразу "Отлично, попью чаёк!". Если очередь пуста, а её пытаются вывести на экран, то следует вывести "*прокатилось перекати-поле*"*/
import java.util.Scanner;
import java.util.ArrayList;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> queue = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        String cmd = "";
        String name1 = "";
        String name2 = "";
        int index1 = 0;
        int index2 = 0;
        int count = 0;
        String proc = "";
        for (int i = 0; i<n; i++){
            cmd = sc.nextLine();
// "Добавить <ИМЯ>"            
            if (cmd.contains("Добавить")){
                name1 = cmd.replace("Добавить ","");
                System.out.println(name1 + " в очереди");
                queue.add(name1);
                count++;
            }
// "Следующий!"   
            if (cmd.contains("Следующий!")){
                if (count == 0)
                    System.out.println("Отлично, попью чаёк!");
                else{
                    System.out.println(queue.get(0) + " в обработке");
                    proc = queue.get(0);
                    queue.remove(0);
                    count--;
                }
            }            
// "<ИМЯ1> занимала/занимал за <ИМЯ2>"
            if (cmd.contains("занимала за")){
                index1 = cmd.indexOf("занимала");
                index2 = cmd.lastIndexOf("за");
                name1 = cmd.substring(0,index1 - 1);
                name2 = cmd.substring(index2 + 3);
                if (queue.contains(name2)){
                    queue.add(queue.indexOf(name2) + 1, name1);
                    count++;
                }
                else{
                    if (name2.equals(proc)){
                        queue.add(0, name1);
                        count++;
                    }
                    else{
                        System.out.println(name1 + ", не надо тут ля-ля");
                        queue.add(name1);
                        count++;
                    }
                }
            }
// "Посмотреть очередь"
            if (cmd.contains("Посмотреть очередь")){
                if (count == 0)
                    System.out.println("*прокатилось перекати-поле*");
                else {
                    System.out.println(String.join(" ", queue));
                }
            }   
// "Стоит ли оно того? <ИМЯ>"
            if (cmd.contains("Стоит ли оно того?")){
                if (count<5){
                    name1 = cmd.replace("Стоит ли оно того? ","");
                    queue.add(name1);
                    count++;
                }
                else{
                    System.out.println("Слабак!");
                }
            }   
        }
    }
}
