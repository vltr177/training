/* Перегрузите метод holiday() в классе Animal (из предыдущего урока) таким образом:

holiday() - увеличивает массу животного на 0.1
holiday(double m) - увеличивает массу животного на m
holiday(double m, int n) - n раз увеличивает массу животного на m */
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

class Main{
    public static void main(String[] args) {
        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.display();

        duck.holiday();
        duck.display();

        duck.holiday(5);
        duck.display();

        duck.holiday(0.4);
        duck.display();

        duck.holiday(0.3, 2);
        duck.display();
    }
}

/*Животные наследники
Создайте три класса - наследника от класса Animal (из предыдущего урока): Bird, Fish и Insect.

Класс Bird:
По умолчанию будем считать, что все птицы умеют летать.
У птиц должны быть новые свойства: 
area - зона обитания
winterFly - ответ на вопрос, улетает ли она зимовать
Добавьте птицам метод chirik_chirik, который выводит на экран строку "Chirik-Chirik".

Класс Fish:
Все рыбы должны уметь плавать по умолчанию.
У рыб должны быть новые свойства: 
squama - тип чешуи
upStreamSwim - умеет ли плавать против течения
Добавьте рыбам метод bul_bul, который выводит на экран строку "Bul-bul".

Класс Insect:
Все насекомые должны уметь ходить по умолчанию.
У насекомых должны быть новые свойства: 
wingCount - количество крыльев
likeJesus - умеет ли ходить по воде
Добавьте насекомым метод ggggg, который выводит на экран строку "Ggggg". */

public class Bird extends Animal {

    private String area;
    private Boolean winterFly;

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
}
public class Fish extends Animal {

    private String squama;
    private Boolean upStreamSwim;

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
}

public class Insect extends Animal {

    private int wingCount;
    private Boolean likeJesus;

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
    }
}

// Переопределённые животные
// Переопределите у созданных вами классов наследников (Bird, Fish и Insect) метод display. Перед выводом стандартной информации добавьте в начало вывода фразу "I am <название класса>". Так же добавьте в метод display информацию о новых свойствах этого класса.
public class Bird extends Animal {

    private String area;
    private Boolean winterFly;

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
public class Fish extends Animal {

    private String squama;
    private Boolean upStreamSwim;

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
public class Insect extends Animal {

    private int wingCount;
    private Boolean likeJesus;

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
        b.setArea("На югах");
        b.setWinterFly(false);
        b.display();
        System.out.println(b.getArea());
        System.out.println(b.isWinterFly());
        b.chirick_chirick();

        Fish f = new Fish();
        f.setName("Сельд");
        f.setSquama("Крупная");
        f.setUpStreamSwim(true);
        f.display();
        System.out.println(f.getSquama());
        System.out.println(f.isUpStreamSwim());
        f.bul_bul();

        Insect i = new Insect();
        i.setName("Жук Жукыч");
        i.setWingCount(4);
        i.setLikeJesus(true);
        i.display();
        System.out.println(i.getWingCount());
        System.out.println(i.isLikeJesus());
        i.ggggg();

    }
}

/* Перегруженные письменные принадлежности
Немного измените и перегрузите метод draw() в классе WritingMaterials (из предыдущего урока) таким образом:

draw() - Если предмет умеет рисовать, то выводит на экран фразу типа: "<Название> провёл линий: 1. Их цвет - <цвет>.", в противном случае выводит на экран фразу " <Название> не может ничего нарисовать.". (почти как и было)
draw(int n) - Если предмет умеет рисовать, то выводит на экран фразу типа: "<Название> провёл линий: <n>. Их цвет - <цвет>.", в противном случае выводит на экран фразу " <Название> не может ничего нарисовать.". 
draw(String color) - Если предмет умеет рисовать, то выводит на экран фразу типа: "<Название> провёл линий: 1. Их цвет - <color>.", в противном случае выводит на экран фразу " <Название> не может ничего нарисовать.". 
draw(String color, int n) - Если предмет умеет рисовать, то выводит на экран фразу типа: "<Название> провёл линий: <n>. Их цвет - <color>.", в противном случае выводит на экран фразу " <Название> не может ничего нарисовать.". */
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
class Main{
    public static void main(String[] args) {
        WritingMaterials pen = new WritingMaterials();
        pen.setName("ручка");
        pen.setColor("Красный");
        pen.setLength(11.6);
        pen.setPrice(167);
        pen.setDraw(true);
        pen.draw();
        pen.draw("Синий");
        pen.draw("Зелёный", 15);
        pen.draw(4);

        WritingMaterials ruler = new WritingMaterials("линека", 34);
        ruler.setDraw(false);
        pen.draw();
        pen.draw("Синий");
        pen.draw("Зелёный", 15);
        pen.draw(4);

    }
}

/* Наследники письменных принадлежностей
Создайте три класса - наследника от класса WritingMaterials (из предыдущего урока): Pen, Ruler и Divider.

Класс Pen:
По умолчанию будем считать, что все ручки умеют рисовать.
У ручек должны быть новые свойства: 
countColor - количество цветов этой ручки (количество стержней, по умолчанию - 1)
auto - ответ на вопрос, автоматическая она, или нет.
Добавьте ручкам метод writeMyName, который выводит на экран строку, содержащую ваше имя.

Класс Ruler:
По умолчанию будем считать, что все линейки не умеют рисовать.
У линеек должны быть новые свойства: 
length - длина линейки
wood - из дерева ли эта линейка
Добавьте линейкам метод measure, который выводит на экран строку "Сейчас померяем длину".

Класс Divider:
По умолчанию будем считать, что все циркули умеют рисовать.
У циркулей должны быть новые свойства: 
dividerType - тип циркуля
metal - сделан ли этот циркуль из металла
Добавьте циркулям метод draw_circle, который выводит на экран строку "Нарисован круг". */

public class Pen extends WritingMaterials{

    int countColor;
    boolean auto;

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
}
public class Ruler extends WritingMaterials{

    boolean wood ;

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
}
public class Divider extends WritingMaterials {

    String dividerType;
    boolean metal;

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


    public void draw_circle(){
        System.out.println("Нарисован круг");
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
    }
}

/* Переопределённые письменные принадлежности
Переопределите у созданных вами классов наследников (Pen, Ruler и Divider.) метод display. Перед выводом стандартной информации добавьте в начало вывода фразу "This is <название класса>". Так же добавьте в метод display информацию о новых свойствах этого класса. */
public class Pen extends WritingMaterials{

    int countColor;
    boolean auto;

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
public class Ruler extends WritingMaterials{

    boolean wood ;

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
public class Divider extends WritingMaterials {

    String dividerType;
    boolean metal;

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


    public void draw_circle(){
        System.out.println("Нарисован круг");
    }

    @Override
    public void display(){
        System.out.println(" This is Pen. Название: " + getName() + ", Цвет: " + getColor() + ", Длина: " + getLength() + ", Цена: " + getPrice() + ", Умеет рисовать: " + isDraw() + ", Тип: " + dividerType + ", Метал: " + isMetal() +".");
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
    }
}
