/*Много вставок
Создайте список, содержащий строковые представления первых n  натуральных чисел. Затем добавьте в список k элементов на нужные позиции.
Входные данные:
На первой строчке вводится число n, на второй число k. Затем вводится k пар чисел. В каждой паре первое число - объект, который надо вставить в список, а второе - индекс, куда его нужно вставить, гарантируется, что все индексы корректны.  
Выходные данные:
Выведите полученный список на экран через пробел.*/
import java.util.Scanner;
import java.util.ArrayList;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a = 0;
        int b = 0;
        for (int i = 1; i<=n; i++)
            list.add(i);
        for (int i = 0; i<k; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            list.add(b, a);
        }
        for (Integer cell : list)
            System.out.print(cell + " ");
    }
}
/* Словарь синонимов
Вам дан словарь, состоящий из пар слов. Каждое слово является синонимом к парному ему слову. Все слова в словаре различны.
Для слова из словаря, записанного в последней строке, определите его синоним.
Вводится число n. Затем 2*n строк. И Ещё одна строка - синоним для которой нужно вывести. */
import java.util.*;
class MyProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> sinonim = new HashMap<String, String>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n; i++){
            sinonim.put(sc.nextLine(),sc.nextLine());
        }
        String ask = sc.nextLine();
        for (Map.Entry<String, String> entry : sinonim.entrySet()) {
            if (entry.getValue().equals(ask)) {
                System.out.println(entry.getKey());
            } else if (entry.getKey().equals(ask)) {
                System.out.println(entry.getValue());
            }
        }
    }
}

//Что ты сказал?
//Вводится натуральное число n, затем n слов на разных строках. Определите, какое слово встречается чаще всего. Гарантируется, что такое слово одно. Все слова вводятся в нижнем регистре на русском языке.
import java.util.HashMap;
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> words = new HashMap<String, Integer>();
        int max = 0;
        String ans = "";
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n; i++){
            String word = sc.next();
            if (words.containsKey(word))
                words.replace(word, words.get(word)+1);
            else
                words.put(word,1);
        }
        for (String key: words.keySet())
            if (words.get(key)>max){
                max = words.get(key);
                ans = key;
            }
        System.out.println(ans);
    }
}

// Статистика по Персоналу
// Вводится число n. Затем 2*n строк. Каждая пара строк - имя человека и его профессия. Определите, сотрудников какой профессии больше всего. Выведите на экран это количество, профессию и их имена на экран в том же порядке, в котором они вводились. Гарантируется, что будет введено не более 100 сотрудников.
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String,String>workers=new LinkedHashMap<String,String>();
        HashMap<String, Integer> profession = new HashMap<>();
        String ans = "";
        String search = "";
        int max = 0;
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n; i++)
            workers.put(sc.next(), sc.next());
        for (String key: workers.keySet()){
            search = workers.get(key);
            if (profession.containsKey(search))
                profession.replace(search,profession.get(search)+1);
            else
                profession.put(search,1);
        }
        for (String key: profession.keySet()){
            if (profession.get(key)>max){
                max = profession.get(key);
                ans = key;
            }
        }
        System.out.println(max);
        System.out.println(ans);
        for (String key: workers.keySet())
           if (workers.get(key).equals(ans))
               System.out.println(key);
    }
}

