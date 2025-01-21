/* Абстракция зданий
Создайте абстрактный класс Building. Определите у класса свойства:

название,
адрес,
год постройки,
имя архитектора, 
является ли культурным памятником.
Унаследуйте у от него 6 классов: Library, House, PoliceDepartment, University, ShoppingCenter, HighRiseBuilding.
Добавьте каждому классу наследнику по 2-3 свойства и 2-3 метода, которые соответствовали бы тематике здания. Так же необходимо во всех классах сгенерировать метод toString()
Каждый класс должен быть инкапсулирован. Если хотите, то можете расширить список зданий (классов наследников).

Интерфейсы зданий
Создайте интерфейсы LivingHouse и SocialHouse (жилой дом и общественное здание). Подумайте, какие методы должны требовать к реализации эти интерфейсы. Опишите 2-3 таких метода.
Добавьте нужные интерфейсы к классам наследникам из предыдущей задачи и реализуйте необходимые методы. */

public abstract class Building {
    private String name;
    private String adress;
    private int build_year;
    private String creator;
    private boolean monument;

    public Building (String name, String adress, int build_year, String creator, boolean monument){
        this.name = name;
        this.adress = adress;
        this.build_year = build_year;
        this.creator = creator;
        this.monument = monument;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public void setBuild_year(int build_year) {
        this.build_year = build_year;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }
    public void setMonument(boolean monument) {
        this.monument = monument;
    }
    public String getName(){
        return name;
    }
    public String getAdress(){
        return adress;
    }
    public int getBuild_year(){
        return build_year;
    }
    public String getCreator(){
        return creator;
    }
    public boolean isMonument(){
        return monument;
    }

}

public interface LivingHouse {
    public void control_company();
}

public interface SocialHouse {
    public void gov_company();
}

public class Library extends Building implements SocialHouse{
    private String topic;
    private boolean gov;


    public Library (String name, String adress, int build_year, String creator, boolean monument, String topic, boolean gov){
        super(name, adress, build_year, creator, monument);
        this.topic = topic;
        this.gov = gov;
    }


    public void setTopic(String topic) {
        this.topic = topic;
    }
    public void setGov(boolean gov){
        this.gov = gov;
    }
    public String getTopic(){
        return topic;
    }
    public boolean isGov(){
        return gov;
    }

    public void about_Library(){
        System.out.println("Это библиотеки");
    }

    @Override
    public String toString(){
        return getName() + ", " + getAdress() + ", " + this.topic;
    }

    public void gov_company(){
        System.out.println("Государственная органицзация");
    }
}

public class House extends Building implements LivingHouse {
    private String owner;
    private int cost;

    public House (String name, String adress, int build_year, String creator, boolean monument, String owner, int cost){
        super(name, adress, build_year, creator, monument);
        this.owner = owner;
        this.cost = cost;
    }

    public void setOwner(String topic) {
        this.owner = owner;
    }
    public void setCost(int cost){
        this.cost = cost;
    }
    public String getOwner(){
        return owner;
    }
    public int getCost() {
        return cost;
    }

    public void about_House(){
        System.out.println("Это дома");
    }

    @Override
    public String toString(){
        return getName() + ", " + getAdress() + ", " + this.owner;
    }

    public void control_company(){
        System.out.println("Управляющая компания");
    }
}

public class HighRiseBuilding extends Building implements LivingHouse, SocialHouse{
    private int floors;
    private int height;

    public HighRiseBuilding (String name, String adress, int build_year, String creator, boolean monument, int floors, int height){
        super(name, adress, build_year, creator, monument);
        this.floors = floors;
        this.height = height;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getFloors(){
        return floors;
    }
    public int getHeight(){
        return height;
    }

    public void about_HighRiseBuilding(){
        System.out.println("Это небоскрёбы");
    }

    @Override
    public String toString(){
        return getName() + ", " + getAdress() + ", " + this.floors;
    }

    public void control_company(){
        System.out.println("Управляющая компания");
    }
    public void gov_company(){
        System.out.println("Государственная органицзация");
    }
}

    private String police_district;
    private boolean weapon;

    public PoliceDepartment (String name, String adress, int build_year, String creator, boolean monument, String police_district, boolean weapon){
        super(name, adress, build_year, creator, monument);
        this.police_district = police_district;
        this.weapon = weapon;
    }


    public void setPolice_district(String police_district) {
        this.police_district = police_district;
    }
    public void setWeapon(boolean weapon){
        this.weapon = weapon;
    }
    public String getPolice_district(){
        return police_district;
    }
    public boolean isWeapon(){
        return weapon;
    }

    public void about_PoliceDepartment(){
        System.out.println("Это полицейские участки");
    }

    @Override
    public String toString(){
        return getName() + ", " + getAdress() + ", " + this.police_district;
    }

    public void gov_company(){
        System.out.println("Государственная органицзация");
    }
}

public class ShoppingCenter extends Building implements LivingHouse{
    private String info;
    private int shops;

    public ShoppingCenter (String name, String adress, int build_year, String creator, boolean monument, String info, int shops){
        super(name, adress, build_year, creator, monument);
        this.info = info;
        this.shops = shops;
    }


    public void setInfo(String info) {
        this.info = info;
    }
    public void setShops(int shops){
        this.shops = shops;
    }
    public String getInfo(){
        return info;
    }
    public int getShops(){
        return shops;
    }

    public void about_ShoppingCenter(){
        System.out.println("Это торговые центры");
    }

    @Override
    public String toString(){
        return getName() + ", " + getAdress() + ", " + this.info;
    }

    public void control_company(){
        System.out.println("Управляющая компания");
    }
}

public class University extends Building implements SocialHouse{
    private String direction;
    private boolean main;

    public University (String name, String adress, int build_year, String creator, boolean monument, String direction, boolean main){
        super(name, adress, build_year, creator, monument);
        this.direction = direction;
        this.main = main;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
    public void setMain(boolean main){
        this.main = main;
    }
    public String getDirection(){
        return direction;
    }
    public boolean isMain(){
        return main;
    }

    public void about_University(){
        System.out.println("Это университеты");
    }

    @Override
    public String toString(){
        return getName() + ", " + getAdress() + ", " + this.direction;
    }

    public void gov_company(){
        System.out.println("Государственная органицзация");
    }
}
