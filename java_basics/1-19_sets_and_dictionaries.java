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
