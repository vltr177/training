/* Пришло время познакомиться с двусвязным списком. Решая эту задачу ты поймешь, как работает двусвязный список и сможешь добавлять в него элементы.
У тебя есть класс StringLinkedList, в котором есть поля first и last, указывающие на первый и последний элемент соответственно.
Тебе нужно реализовать логику метода add, который будет добавлять элементы в список.

Подсказки:

Для правильной реализации важно понимать, что по списку можно проходить как с первого элемента до последнего, так и наоборот, поэтому при добавлении новых элементов не забудь менять ссылки рядом стоящих.
Метод add должен создавать новый объект класса Node, в который он поместит переданное значение. Перед тем как добавлять новую ноду, нужно изменить ссылку последней ноды на новосозданную, а новосозданная станет последней.
Если в списке один элемент, то на него указывает first.next и last.prev одновременно.
Метод printAll создан для debug и в проверке не участвует.
Важно:
Node first не должна иметь значение, она указывает только на первый элемент(first.next);
Node last также не содержит значения, а только указывает на последний элемент(last.prev).
Требования:
•	При добавлении нового элемента предыдущие элементы должны получать на него ссылку.
•	При добавлении нового элемента он должен получать ссылку на предыдущий.
•	Поле first класса StringLinkedList должно всегда ссылаться на первый элемент, не содержать значение (value) и ссылку на предыдущий элемент (prev).
•	Поле last класса StringLinkedList должно всегда ссылаться на последний элемент, не содержать значение (value) и ссылку на следующий элемент (next). */

/* 
StringLinkedList
*/

public class Solution {

    public static void main(String[] args) {
        StringLinkedList stringLinkedList = new StringLinkedList();
        stringLinkedList.add("1");
        stringLinkedList.add("2");
        stringLinkedList.add("3");
        stringLinkedList.add("4");
        stringLinkedList.add("5");
        stringLinkedList.add("6");
        stringLinkedList.add("7");
        stringLinkedList.add("8");
        stringLinkedList.add("9");
        stringLinkedList.printAll();
    }
}

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement != null) && (currentElement != last)) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node cell = new Node();
        if (first.next == null) {
            first.next = cell;
            cell.prev = first;
        }
        else {
            Node preCell = last.prev;
            preCell.next = cell;
            cell.prev = preCell;
        }
        cell.value = value;
        cell.next = last;
        last.prev = cell;

    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}


/* Решая эту задачу, ты научишься извлекать элемент из двусвязного списка.
Мы реализовали метод add, который добавляет элементы в конец списка. Тебе нужно реализовать метод get(int), который вернет строку под индексом, переданным в метод. Если строки с таким индексом нет, нужно вернуть null.
Помни, что first и last не имеют значений, а ссылаются только на первый и последний элемент соответственно.

Требования:
•	Метод get(int index) должен возвращать элемент, который находится под индексом index в списке. */

/* 
StringLinkedList, часть 2
*/

public class Solution {

    public static void main(String[] args) {
        StringLinkedList stringLinkedList = new StringLinkedList();
        stringLinkedList.add("1");
        stringLinkedList.add("2");
        stringLinkedList.add("3");
        stringLinkedList.add("4");
        stringLinkedList.add("5");

        System.out.println(stringLinkedList.get(0)); // должно вывести "1"
        System.out.println(stringLinkedList.get(2)); // должно вывести "3"
        System.out.println(stringLinkedList.get(4)); // должно вывести "5"
        System.out.println(stringLinkedList.get(5)); // должно вывести null
    }
}

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public StringLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public void add(String value) {
        Node newNode = new Node();
        newNode.value = value;

        Node prevLast = last.prev;
        prevLast.next = newNode;
        newNode.prev = prevLast;
        newNode.next = last;
        last.prev = newNode;
    }

    public String get(int index) {
        Node node = first.next;
        int count = 0;
        while ((node != null) && (node != last)){
            if (count == index){
                return node.value;
            }
            count ++;
            node = node.next;
        }
        return null;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
