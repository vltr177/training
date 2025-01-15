public abstract class Building {

    private String name;
    private String adress;
    private int build_year;
    private String creator;
    private String monument;
}

public class Library extends Building{

    private String topic;
    private boolean gov;
}
public class PoliceDepartment extends Building{

    private String police_district;
    private boolean weapon;
}
public class ShoppingCenter extends Building{

    private String info;
    private int shops;
}
public class University extends Building{

    private String direction;
    private boolean main;
}
public class HighRiseBuilding extends Building{

    private int floors;
    private int height;
}
