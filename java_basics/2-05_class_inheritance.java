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

