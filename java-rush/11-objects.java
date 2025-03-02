/* В методе main создаются два айфона с одинаковыми параметрами.
В консоли выводится результат их сравнения. Разберись, почему сейчас результат отрицательный и сделай так, чтобы он был положительным. Для этого тебе нужно переопределить метод equals(Iphone), который будет учитывать все параметры.
У двух равных объектов значения полей должны быть одинаковыми. Метод main не участвует в проверке.

Требования:
•	В классе Iphone должен быть переопределен метод public boolean equals(Object).
•	Метод equals должен возвращать true для двух равных объектов типа Iphone и false — для разных.
•	Метод equals должен возвращать false, если в него передали null. */

import java.util.Objects;

/* 
Два айфона
*/

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (!(obj instanceof Iphone))
            return false;

        Iphone iphone = (Iphone) obj;

        if (this.price != iphone.price)
            return false;

        if (this.model == null || iphone.model == null)
            if (this.color == null || iphone.color == null)
                return this.model == iphone.model && this.color == iphone.color;
            else
                return this.model == iphone.model && this.color.equals(iphone.color);
        else
            if (this.color == null || iphone.color == null)
                return this.model.equals(iphone.model) && this.color == iphone.color;

        return this.model.equals(iphone.model) && this.color.equals(iphone.color);
    }


    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "BLACK", 999);
        Iphone iphone2 = new Iphone("X", "BLACK", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}

/* Напиши свою реализацию hashCode, используя переменные model и year. Если эти поля у двух объектов одинаковые, то должен возвращаться одинаковый hashCode. Если правильно реализовать метод hashCode, вывод должен быть таким:
true
true
true
true
false
false */

import java.util.Objects;

/* 
Создаем свой hashCode
*/

public class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public int hashCode(){
        int result = model == null? 0 : model.hashCode();
        result = result + year;
        return result;
    }


    public static void main(String[] args) {
        Car lamborghini = new Car("Lamborghini", 2020);
        Car lamborghini1 = new Car("Lamborghini", 2020);
        Car ferrari = new Car("Ferrari", 2020);
        Car ferrari1 = new Car("Ferrari", 2020);
        Car bugatti = new Car("Bugatti", 2020);
        Car bugatti1 = new Car("Bugatti", 2020);
        System.out.println(ferrari.hashCode() == ferrari.hashCode());
        System.out.println(lamborghini.hashCode() == lamborghini1.hashCode());
        System.out.println(ferrari.hashCode() == ferrari1.hashCode());
        System.out.println(bugatti.hashCode() == bugatti1.hashCode());
        System.out.println(bugatti.hashCode() == lamborghini.hashCode());
        System.out.println(lamborghini.hashCode() == ferrari.hashCode());
    }
}
