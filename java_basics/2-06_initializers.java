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

/* Письменные принадлежности по умолчанию
Добавьте классу WritingMaterials инициализатор. Задайте в нём для каждого предмета название и цвет по умолчанию. Добавьте инициализаторы и в наследников вашего класса.
Статичные письменные принадлежности
Добавьте классу WritingMaterials статичный метод на ваш вкус и статичное свойство String description, в котором будет храниться описание класса. Убедитесь, что его нельзя вызвать у объекта, но можно вызвать у класса. 
Пронумерованные письменные принадлежности
Добавьте автоматическую нумерацию создания всех письменных принадлежностей и наследников. Используйте при этом статическое поле. Так же, для удобства, сгенерируйте классу WritingMaterials  метод toString(), который выводил бы подробную информацию о предмете (данные по всем полям, включая номер). Вывод номера в метод display() не добавляйте.
Финальные письменные принадлежности
Запретите наследование от класса Ruler, переопределение метода drawCircle у класса Divider и изменение свойства description. */

public class WritingMaterials {
    public final static String description = "Library of materials";

    public static void info(){
        System.out.println(description);
    }

    private String name;
    private String color;
    private int price;
    private double length;
    private boolean draw;
    static int counter = 0;

    {
        name = "Vadik";
        color = "black";
        price = 777;
        length = 35;
        draw = true;
    }

    public WritingMaterials(){
        counter++;
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


    @Override
    public String toString(){
        return this.name + ", " + this.color + ", " + this.length + ", " + this.price + ", " + this.draw + ", " + counter;
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
            System.out.println(name + " провёл линий: 1. " + "Их цвет - " + color + ".");
        else
            System.out.println(name + " не может ничего нарисовать.");
    }

    public void draw(int n){
        if (draw)
            System.out.println(name + " провёл линий: " + n + ". Их цвет - " + color + ".");
        else
            System.out.println(name + " не может ничего нарисовать.");
    }

    public void draw(String color){
        if (draw)
            System.out.println(name + " провёл линий: 1" + ". Их цвет - " + color + ".");
        else
            System.out.println(name + " не может ничего нарисовать.");
    }

    public void draw(String color, int n){
        if (draw)
            System.out.println(name + " провёл линий: " + n + ". Их цвет - " + color + ".");
        else
            System.out.println(name + " не может ничего нарисовать.");
    }

}

public class Divider extends WritingMaterials {

    String dividerType;
    boolean metal;

    {
        dividerType = "unknown";
        metal = true;
    }

    public Divider(){
    }

    public Divider(String name, String color, int price, double length, boolean draw, String dividerType, boolean metal){
        super(name, color, price,length, draw);
        this.dividerType = dividerType;
        this.metal = metal;
    }

    public void setDividerType(String dividerType){ this.dividerType = dividerType; }
    public void setMetal(Boolean metal){ this.metal = metal; }
    public String getDividerType() { return dividerType; }
    public Boolean isMetal(){ return metal; }


    public final void draw_circle(){
        System.out.println("Нарисован круг");
    }

    @Override
    public void display(){
        System.out.println(" This is Pen. Название: " + getName() + ", Цвет: " + getColor() + ", Длина: " + getLength() + ", Цена: " + getPrice() + ", Умеет рисовать: " + isDraw() + ", Тип: " + dividerType + ", Метал: " + isMetal() +".");
    }
}

public class Pen extends WritingMaterials{

    int countColor;
    boolean auto;

    {
        countColor = 1;
        auto = false;
    }

    public Pen(){
        super.setDraw(true);
    }

    public Pen(String name, String color, int price, double length, boolean draw, int countColor, boolean auto){
        super(name, color, price,length, draw);
        this.countColor = countColor;
        this.auto = auto;
        super.setDraw(true);
    }

    public void setCountColor(int countColor){ this.countColor = countColor; }
    public void setAuto(Boolean auto){ this.auto = auto; }
    public int getCountColor(){ return countColor; }
    public Boolean isAuto(){  return auto; }


    public void writeMyName(){
        System.out.println("Вадим");
    }

    @Override
    public void display(){
        System.out.println(" This is Pen. Название: " + getName() + ", Цвет: " + getColor() + ", Длина: " + getLength() + ", Цена: " + getPrice() + ", Умеет рисовать: " + isDraw() + ", Кол-во цветов: " + countColor + ", Авто: " + isAuto() + ".");
    }
}


public final class Ruler extends WritingMaterials{

    boolean wood ;

    {
        wood = false;
    }

    public Ruler(){
        super.setDraw(false);
    }

    public Ruler(String name, String color, int price, double length, boolean draw, boolean wood ){
        super(name, color, price, length, draw);
        this.wood = wood;
        super.setDraw(false);
    }

    public void setWood(Boolean auto){ this.wood = wood; }
    public Boolean isWood(){  return wood; }

    public void measure(){
        System.out.println("Сейчас измерим длину");
    }

    @Override
    public void display(){
        System.out.println(" This is Pen. Название: " + getName() + ", Цвет: " + getColor() + ", Длина: " + getLength() + ", Цена: " + getPrice() + ", Умеет рисовать: " + isDraw() + ", Дерево: " + isWood() + ".");
    }

}


class Main{
    public static void main(String[] args) {
        WritingMaterials wm = new WritingMaterials("ручка", "Красный", 145, 15.6, true);
        wm.display();

        Pen p = new Pen();
        p.setName("Паркер");
        p.display();
        p.setCountColor(2);
        p.setAuto(false);
        System.out.println(p.getCountColor());
        System.out.println(p.isAuto());
        p.writeMyName();

        Ruler r = new Ruler();
        r.setName("Линейка");
        r.display();
        r.setLength(25);
        r.setWood(true);
        System.out.println(r.getLength());
        System.out.println(r.isWood());
        r.measure();

        Divider d = new Divider();
        d.setName("Циркуль");
        d.display();
        d.setDividerType("С карандашом");
        d.setMetal(true);
        System.out.println(d.getDividerType());
        System.out.println(d.isMetal());
        d.draw_circle();

        WritingMaterials.info();
        System.out.println(d);
    }
}
