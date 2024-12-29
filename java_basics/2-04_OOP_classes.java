/* Животные 1
Опишите класс Animal. У класса Animal должны быть свойства:
type - тип животного (String)
name - имя животного (String)
age - возраст животного (int)
weight - вес животного (double)
isFly - ответ на вопрос, умеет ли это животное летать? (boolean)
isWalk - ответ на вопрос, умеет ли это животное ходить? (boolean)
isSwim -  ответ на вопрос, умеет ли это животное плавать? (boolean)
У животного должны быть методы:
display  - выводит информацию о животном в формате: "Тип: <Тип животного>, Имя: <Имя животного>, Возраст: <Возраст животного>, Вес: <Вес животного>, Умеет летать: <Да/Нет>, Умеет ходить: <Да/Нет>, Умеет плавать: <Да/Нет>."
rename(String) - принимает новое имя животного
holiday(int) - принимает на вход число праздничных дней. Увеличивает массу животного на 0.1 за каждый праздничный день. */

public class Animal {
    String type;
    String name;
    int age;
    double weight;
    boolean isFly;
    boolean isWalk;
    boolean isSwim;
    public void display(){
        System.out.println("Тип: " + type + ", Имя: " + name + ", Возраст: " + weight + ", Вес: " + weight + ", Умеет летать: " + isFly + ", Умеет ходить: " + isWalk + ", Умеет плавать: " + isSwim + ".");
    }
    public void rename(String new_name){
        name = new_name;
    }
    public void holiday(int days){
        weight += weight * days * 0.1;
    }
}
class Main{
    public static void main(String[] args) {
        Animal tiger = new Animal();
        tiger.type = "тигр";
        tiger.name = "Артём";
        tiger.age = 15;
        tiger.weight = 300.6;
        tiger.isSwim = true;
        tiger.isWalk = true;
        tiger.isFly = false;
        tiger.display();
        tiger.rename("Антон");
        tiger.display();
        Animal sparrow = new Animal();
        sparrow.type = "воробей";
        sparrow.name = "Капитан Джек";
        sparrow.age = 3;
        sparrow.weight = 2;
        sparrow.isSwim = false;
        sparrow.isWalk = true;
        sparrow.isFly = true;
        sparrow.display();
        sparrow.holiday(2);
        sparrow.display();
    }
}

/* Животные 2
Дополните класс Animal. У класса Animal должны быть следующие конструкторы:

Позволяющий создать животное с его типом и именем
Позволяющий создать животное с его типом и возрастом. При этом в имени окажется значение "No Name"
Позволяющий создать животное со всеми его свойствами в том же порядке, который указан на предыдущем слайде. */
public class Animal {
    String type;
    String name;
    int age;
    double weight;
    boolean isFly, isWalk, isSwim;
    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }
    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
        this.name = "No Name";
    }
    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim){
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }
    public void display(){
        System.out.println("Тип: " + type + ", Имя: " + name + ", Возраст: " + weight + ", Вес: " + weight + ", Умеет летать: " + isFly + ", Умеет ходить: " + isWalk + ", Умеет плавать: " + isSwim + ".");
    }
    public void rename(String new_name){
        name = new_name;
    }

    public void holiday(int days){
        weight += weight * days * 0.1;
    }
}
class Main{
    public static void main(String[] args) {
        Animal tiger = new Animal("тигр", "Артём");
        tiger.age = 15;
        tiger.weight = 300.6;
        tiger.isSwim = true;
        tiger.isWalk = true;
        tiger.isFly = false;
        tiger.display();

        Animal sparrow = new Animal("воробей", 5);
        sparrow.weight = 2;
        sparrow.isSwim = false;
        sparrow.isWalk = true;
        sparrow.isFly = true;
        sparrow.display();

        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.holiday(5);
        duck.rename("Утя-Утя");
        duck.display();
    }
}

// Добавьте инкапсуляцию в класс Animal. Для каждого свойства в классе Animal должны быть свои методы get/set (для булевых значений не get, a is).
public class Animal {

    private String type;
    private String name;
    private int age;
    private double weight;
    private boolean isFly, isWalk, isSwim;

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
        this.name = "No Name";
    }

    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim){
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setFly(boolean isFly){
        this.isFly = isFly;
    }
    public void setWalk(boolean isWalk){
        this.isWalk = isWalk;
    }
    public void setSwimm(boolean isSwim){
        this.isSwim = isSwim;
    }

    public String getType(){
        return type;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getWeight(){
        return weight;
    }
    public boolean isFly(){
        return isFly;
    }
    public boolean isWalk(){
        return isWalk;
    }
    public boolean isSwimm(){
        return isSwim;
    }

    public void display(){
        System.out.println("Тип: " + type + ", Имя: " + name + ", Возраст: " + weight + ", Вес: " + weight + ", Умеет летать: " + isFly + ", Умеет ходить: " + isWalk + ", Умеет плавать: " + isSwim + ".");
    }

    public void rename(String new_name){
        name = new_name;
    }

    public void holiday(int days){
        weight += weight * days * 0.1;
    }
}

class Main{
    public static void main(String[] args) {
        Animal tiger = new Animal("тигр", "Артём");
        tiger.setAge(15);
        tiger.setWeight(300.6);
        tiger.setSwimm(true);
        tiger.setWalk(true);
        tiger.setFly(false);
        tiger.display();

        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.holiday(5);
        duck.rename("Утя-Утя");
        duck.display();
        System.out.println(duck.getAge());
        System.out.println(duck.getName());
        System.out.println(duck.getWeight());
        System.out.println(duck.getType());
        System.out.println(duck.isSwimm());
        System.out.println(duck.isWalk());
        System.out.println(duck.isFly());
    }
}

/* Письменные принадлежности 1
Опишите класс WritingMaterials. У класса WritingMaterials должны быть свойства:

name - название предмета (String)
color - цвет, которым он пишет (String).
price - его цена (int)
length - его длина (double)
draw - ответ на вопрос, умеет ли эта письменная принадлежность писать? (boolean)
У предмета должны быть методы:

display()  - выводит информацию о предмете в формате:
"Название: <его название>, Цвет: <цвет>, Длина: <его длина>, Цена: <его цена>, Умеет рисовать: <Да/Нет>.

replace_rod(String) - принимает новый цвет стержня
priceUp(int) - принимает на вход изменение цены. Увеличивает цену на это число.
priceDown(int) - принимает на вход изменение цены. Уменьшает цену на это число.
draw() - Если предмет умеет рисовать, то выводит на экран фразу типа: "<Название> провёл линию. Её цвет - <цвет>.", в противном случае выводит на экран фразу " <Название> не может ничего нарисовать.". */
public class WritingMaterials {
    String name;
    String color;
    int price;
    double length;
    boolean draw;

    public void display(){
        System.out.println("Название: " + name + ", Цвет: " + color + ", Длина: " + length + ", Цена: " + price + ", Умеет рисовать: " + draw + ".");
    }

    public void priceUp(int new_price){
        price += new_price;
    }

    public void replace_rod(String new_color){
        color = new_color;
    }

    public void priceDown(int new_price){
        price -= new_price;
    }

    public void draw(){
        if (draw)
            System.out.println(name + " провёл линию. " + "Её цвет - " + color + ".");
        else
            System.out.println(name + " не может ничего нарисовать.");
    }

}
class Main{
    public static void main(String[] args) {
        WritingMaterials pen = new WritingMaterials();
        pen.name = "ручка";
        pen.color = "Красный";
        pen.length = 15.6;
        pen.price = 145;
        pen.draw = true;
        pen.display();
        pen.draw();
        pen.priceDown(10);
        pen.display();
        pen.priceUp(23);
        pen.display();
        pen.replace_rod("Синий");
        pen.draw();

        WritingMaterials ruler = new WritingMaterials();
        ruler.name = "линейка";
        ruler.length = 30.0;
        ruler.price = 25;
        ruler.draw = false;
        ruler.display();
        ruler.draw();
        ruler.priceUp(13);
        ruler.display();
    }
}

/* Письменные принадлежности 2
Дополните класс WritingMaterials. У класса WritingMaterials должны быть следующие конструкторы:

Позволяющий создать предмет с его названием и цветом.
Позволяющий создать предмет с его названием и ценой. При этом в цвете окажется значение "No Color".
Позволяющий создать предмет с его ценой, длиной и способностью рисовать. При этом в цвете окажется значение "No Color", а в названии - "No Name".
Позволяющий создать предмет со всеми его свойствами в том же порядке, который указан на предыдущем слайде. */
public class WritingMaterials {
    String name;
    String color;
    int price;
    double length;
    boolean draw;


    public WritingMaterials(String name, String color){
        this.name = name;
        this.color = color;
    }

    public WritingMaterials(String name, int price){
        this.name = name;
        this.color = "No Color";
        this.price = price;
    }

    public WritingMaterials(int price, double length, boolean draw){
        this.name = "No Name";
        this.color = "No Color";
        this.price = price;
        this.length = length;
        this.draw = draw;
    }

    public WritingMaterials(String name, String color, int price, double length, boolean draw){
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = draw;
    }


    public void display(){
        System.out.println("Название: " + name + ", Цвет: " + color + ", Длина: " + length + ", Цена: " + price + ", Умеет рисовать: " + draw + ".");
    }

    public void priceUp(int new_price){
        price += new_price;
    }

    public void replace_rod(String new_color){
        color = new_color;
    }

    public void priceDown(int new_price){
        price -= new_price;
    }

    public void draw(){
        if (draw)
            System.out.println(name + " провёл линию. " + "Её цвет - " + color + ".");
        else
            System.out.println(name + " не может ничего нарисовать.");
    }

}
class Main{
    public static void main(String[] args) {
        WritingMaterials pen = new WritingMaterials("ручка", "Красный", 145, 15.6, true);
        pen.display();
        pen.draw();
        pen.priceDown(10);
        pen.display();
        pen.priceUp(23);
        pen.display();
        pen.replace_rod("Синий");
        pen.draw();

        WritingMaterials ruler = new WritingMaterials("линека", 34);
        ruler.display();
        ruler.draw();

        WritingMaterials wm1 = new WritingMaterials(23, 67.8, false);
        wm1.display();
        wm1.draw();

        WritingMaterials wm2 = new WritingMaterials("Циркуль", "Зелёный");
        wm2.draw = true;
        wm2.display();
        wm2.draw();
    }
}

// Письменные принадлежности 3
// Добавьте инкапсуляцию в класс WritingMaterials. Для каждого свойства в классе WritingMaterials должны быть свои методы get/set (для булевых значений не get, a is).
public class WritingMaterials {
    private String name;
    private String color;
    private int price;
    private double length;
    private boolean draw;

    public WritingMaterials(){
         }

    public WritingMaterials(String name, String color){
        this.name = name;
        this.color = color;
    }

    public WritingMaterials(String name, int price){
        this.name = name;
        this.color = "No Color";
        this.price = price;
    }

    public WritingMaterials(int price, double length, boolean draw){
        this.name = "No Name";
        this.color = "No Color";
        this.price = price;
        this.length = length;
        this.draw = draw;
    }

    public WritingMaterials(String name, String color, int price, double length, boolean draw){
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = draw;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public int getPrice() {
        return this.price;
    }

    public double getLength() {
        return this.length;
    }

    public boolean isDraw() {
        return this.draw;
    }


    public void display(){
        System.out.println("Название: " + name + ", Цвет: " + color + ", Длина: " + length + ", Цена: " + price + ", Умеет рисовать: " + draw + ".");
    }

    public void priceUp(int new_price){
        price += new_price;
    }

    public void replace_rod(String new_color){
        color = new_color;
    }

    public void priceDown(int new_price){
        price -= new_price;
    }

    public void draw(){
        if (draw)
            System.out.println(name + " провёл линию. " + "Её цвет - " + color + ".");
        else
            System.out.println(name + " не может ничего нарисовать.");
    }

}
class Main{
    public static void main(String[] args) {
        WritingMaterials pen = new WritingMaterials();
        pen.setName("ручка");
        pen.setColor("Красный");
        pen.setLength(11.6);
        pen.setPrice(167);
        pen.setDraw(true);
        pen.display();
        pen.draw();
        pen.priceDown(10);
        pen.display();
        pen.priceUp(23);
        pen.display();
        pen.replace_rod("Синий");
        pen.draw();
        System.out.println(pen.getName());
        System.out.println(pen.getColor());
        System.out.println(pen.getLength());
        System.out.println(pen.getPrice());
        System.out.println(pen.isDraw());
    }

}
