

public static void main(String[] args) {
    Employee Ivanova = new Employee("Евгения", "Иванова", LocalDate.of(1995, 12, 15), "Библиотекарь");
    Ivanova.setDateOfBirth(LocalDate.of(1996, 12, 15));
    System.out.println(Ivanova);
    Employee Petrova = new Employee("Екатерина", "Петрова", LocalDate.of(1980, 11, 01), "Методист");
    System.out.println(Petrova);
    System.out.println("Работников библиотеки: " +Employee.allNumEmployee);
    Client Sidorov = new Client("Петр", "Сидоров", LocalDate.of(2009, 02, 25), "Свидетельство о рождении VH-345677");
    Client Anikina = new Client("Анастасия", "Аникина", LocalDate.of(1990, 01, 8), "Паспорт 8899 883939");
    Client Kozlov = new Client("Иван", "Козлов", LocalDate.of(1978, 02, 18), "Паспорт 9220 929292");
    Kozlov.setDocument("Паспорт 9555 55555");
    System.out.println(Sidorov);
    System.out.println(Sidorov.isChildren()==true?"Ребенок":"Взрослый");
    System.out.println(Anikina);
    System.out.println(Anikina.isChildren()==true?"Ребенок":"Взрослый");
    System.out.println(Kozlov);
    System.out.println(Kozlov.isChildren()==true?"Ребенок":"Взрослый");
    System.out.println(Kozlov.getData());
    ForeignClient Musamba = new ForeignClient("Лунгу", "Мусамба", LocalDate.of(1993, 10, 11), "Загранпаспорт 7780 778883", "ЮАР");
    ForeignClient VanKlod = new ForeignClient("Klod", "Van", LocalDate.of(1984, 5, 3), "Загранпаспорт FN-9 888-099", "Нидерланды");
    VanKlod.setNationality("Бельгия");
    System.out.println(Musamba);
    System.out.println(VanKlod);
    System.out.println(VanKlod.getData());
    System.out.println("Клиентов библиотеки всего: " +Client.allNumClient);
    System.out.println("Всего людей: " +People.allNum);
}

static class ForeignClient extends Client{
    private String nationality;
    public ForeignClient(String firstName, String lastName, LocalDate dateOfBirth, String document, String nationality) {
        super(firstName, lastName, dateOfBirth, document);
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String getData() {
        return super.getData()+", национальность: "+nationality;
    }

    @Override
    public String toString() {
        return "ForeignClient{" +
                "nationality='" + nationality + '\'' +
                ", document='" + getDocument() + '\'' +
                ", numClient=" + getNumClient() +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", dateOfBirth=" + getDateOfBirth() +
                '}';
    }
}

static class Client extends People implements Clients{
    private String document;
    private static int allNumClient;
    private int numClient;
    {
        allNumClient++;
        numClient=allNumClient;
    }

    public Client(String firstName, String lastName, LocalDate dateOfBirth, String document) {
        super(firstName, lastName, dateOfBirth);
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public int getNumClient() {
        return numClient;
    }

    @Override
    public String getData() {
        return "Краткая информация - ФИО: "+getFirstName()+" "+getLastName();
    }
    @Override
    public boolean isChildren() {
        return (Period.between(getDateOfBirth(),LocalDate.now()).getYears()<18?true:false);
    }

    @Override
    public String toString() {
        return "Client{" +
                "document='" + document + '\'' +
                ", numClient=" + numClient +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", dateOfBirth=" + getDateOfBirth() +
                '}';
    }
}

static class Employee extends People{
    private String position;
    private static int allNumEmployee;
    private int numEmployee;
    {
        allNumEmployee++;
        numEmployee=allNumEmployee;
    }
    public Employee(String firstName, String lastName, LocalDate dateOfBirth, String position) {
        super(firstName, lastName, dateOfBirth);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", numEmployee=" + numEmployee +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", dateOfBirth=" + getDateOfBirth() +
                '}';
    }
}

interface Clients{
    String getData();
    boolean isChildren();
}

public static abstract class People{
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private static int allNum;
    private int num;
    {
        allNum++;
        num=allNum;
    }
    public People(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "People{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", num=" + num +
                '}';
    }
}
