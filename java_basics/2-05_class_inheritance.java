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
