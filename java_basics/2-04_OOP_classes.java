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
