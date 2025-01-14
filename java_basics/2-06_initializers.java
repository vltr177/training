/* Животные по умолчанию
Добавьте классу Animal инициализатор. Задайте в нём для каждого животного имя и тип по умолчанию. Добавьте инициализаторы и в наследников вашего класса.

Статичные животные
Добавьте классу Animal статичный метод на ваш вкус и статичное свойство String description, в котором будет храниться описание класса. Убедитесь, что его нельзя вызвать у объекта, но можно вызвать у класса.

Пронумерованные животные
Добавьте автоматическую нумерацию создания всех животных и наследников. Используйте при этом статическое поле. Так же, для удобства, сгенерируйте классу Animal  метод toString(), который выводил бы подробную информацию о животном (данные по всем полям, включая номер). Вывод номера в метод display() не добавляйте.

Финальные животные
Запретите наследование от класса Fish, переопределение метода rename у класса Animal и изменение свойства description */

public class Animal {
    public final static String description = "Animals base";

    public static void info (){
        System.out.println(description);
    }

    private String type;
    private String name;
    private int age;
    private double weight;
    private boolean isFly, isWalk, isSwim;
    static int counter = 0;


    {
        type = "Bird";
        name = "Barsik";
    }

    public Animal(){
        counter++;
        }

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
    public void setFly(boolean isFly) {
        this.isFly = isFly;
    }
    public void setWalk(boolean isWalk){
        this.isWalk = isWalk;
    }
    public void setSwim(boolean isSwim){
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
    public boolean isSwim(){
        return isSwim;
    }

    @Override
    public String toString(){
        return this.type + ", " + this.name + ", " + this.age + ", " + this.isFly + ", " + this.isWalk + ", " + this.isSwim + ", " + counter;
    }


    public void display(){
        System.out.println("Тип: " + type + ", Имя: " + name + ", Возраст: " + age + ", Вес: " + weight + ", Умеет летать: " + isFly + ", Умеет ходить: " + isWalk + ", Умеет плавать: " + isSwim + ".");
    }

    public final void rename(String new_name){
        name = new_name;
    }

    public void holiday(){
        weight += 0.1;
        weight = Math.ceil(weight * 10) / 10;
    }

    public void holiday(int days) {
        weight += days * 0.1;
    }

    public void holiday(double m){
        weight += m;
        weight = Math.ceil(weight * 10) / 10;
    }

    public void holiday(double m, int n){
        weight += n*m;
        weight = Math.ceil(weight * 10) / 10;
    }
}

public final class Fish extends Animal {

    private String squama;
    private Boolean upStreamSwim;

    {
        squama = "blue";
        upStreamSwim = false;
    }

    public Fish(){
        super.setSwim(true);
    }

    public Fish(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim, String squama, boolean upStreamSwim){
        super(type, name, age, weight, isFly,isWalk, isSwim);
        this.squama = squama;
        this.upStreamSwim = upStreamSwim;
        super.setSwim(true);
    }

    public void setSquama(String squama){ this.squama = squama; }
    public void setUpStreamSwim(Boolean upStreamSwim){ this.upStreamSwim = upStreamSwim; }
    public String getSquama(){ return squama; }
    public Boolean isUpStreamSwim(){  return upStreamSwim; }

    public void bul_bul(){
        System.out.println("Bul-bul");
    }

    @Override
    public void display(){
        System.out.println("I am Fish - " + "Тип: " + getType() + ", Имя: " + getName() + ", Возраст: " + getAge() + ", Вес: " + getWeight() + ", Умеет летать: " + isFly() + ", Умеет ходить: " + isWalk() + ", Умеет плавать: " + isSwim() + ", Икра: " + squama + ", Против течения: " + upStreamSwim + ".");
    }
}

public class Bird extends Animal {

    private String area;
    private Boolean winterFly;

    {
        area = "Russia";
        winterFly = false;
    }

    public Bird(){
        super.setFly(true);
    }

    public Bird(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim, String area, boolean winterFly){
        super(type, name, age, weight, isFly,isWalk, isSwim);
        this.area = area;
        this.winterFly = winterFly;
        super.setFly(true);
    }

    public void setArea(String area){ this.area = area; }
    public void setWinterFly(Boolean winterFly){ this.winterFly = winterFly; }
    public String getArea(){
        return area;
    }
    public Boolean isWinterFly(){  return winterFly; }

    public void chirick_chirick(){
        System.out.println("Chirik-Chirik");
    }

    @Override
    public void display(){
        System.out.println("I am Bird - " + "Тип: " + getType() + ", Имя: " + getName() + ", Возраст: " + getAge() + ", Вес: " + getWeight() + ", Умеет летать: " + isFly() + ", Умеет ходить: " + isWalk() + ", Умеет плавать: " + isSwim() + ", Регион: " + area + ", Улетает зимовать: " + winterFly + ".");
    }
}

public class Insect extends Animal {

    private int wingCount;
    private Boolean likeJesus;

    {
        wingCount = 2;
        likeJesus = false;
    }

    public Insect(){
        super.setWalk(true);
    }

    public Insect(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim, int wingCount, boolean likeJesus){
        super(type, name, age, weight, isFly,isWalk, isSwim);
        this.wingCount = wingCount;
        this.likeJesus = likeJesus;
        super.setWalk(true);
    }

    public void setWingCount(int wingCount){ this.wingCount = wingCount; }
    public void setLikeJesus(Boolean likeJesus){ this.likeJesus = likeJesus; }
    public int getWingCount(){ return wingCount; }
    public Boolean isLikeJesus(){  return likeJesus; }

    public void ggggg(){
        System.out.println("Ggggg");
    }

    @Override
    public void display(){
        System.out.println("I am Insect - " + "Тип: " + getType() + ", Имя: " + getName() + ", Возраст: " + getAge() + ", Вес: " + getWeight() + ", Умеет летать: " + isFly() + ", Умеет ходить: " + isWalk() + ", Умеет плавать: " + isSwim() + ", Крыльев: " + wingCount + ", Исуус: " + likeJesus + ".");
    }
}

class Main{
    public static void main(String[] args) {
        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.display();

        Bird b = new Bird();
        b.setName("Bob");
        b.display();
        b.setArea("На югах");
        b.setWinterFly(false);
        System.out.println(b.getArea());
        System.out.println(b.isWinterFly());
        b.chirick_chirick();

        Bird d = new Bird();
        b.setName("Олег");
        b.display();
        b.setArea("На северах");
        b.setWinterFly(true);
        System.out.println(b.getArea());
        System.out.println(b.isWinterFly());
        b.chirick_chirick();

        Fish f = new Fish();
        f.setName("Сельд");
        f.display();
        f.setSquama("Крупная");
        f.setUpStreamSwim(true);
        System.out.println(f.getSquama());
        System.out.println(f.isUpStreamSwim());
        f.bul_bul();

        Insect i = new Insect();
        i.setName("Жук Жукыч");
        i.display();
        i.setWingCount(4);
        i.setLikeJesus(true);
        System.out.println(i.getWingCount());
        System.out.println(i.isLikeJesus());
        i.ggggg();

        Animal.info();
        System.out.println(d);
    }
}

