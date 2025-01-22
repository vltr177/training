import java.sql.*;
import java.util.*;

public class DB {
    public static Connection conn;
    public static Statement stmt;
    static String[] types = new String[]{"Абиссинская кошка",
            "Австралийский мист",
            "Американская жесткошерстная",
            "Американская короткошерстная",
            "Американский бобтейл",
            "Американский кёрл",
            "Балинезийская кошка",
            "Бенгальская кошка",
            "Бирманская кошка",
            "Бомбейская кошка",
            "Бразильская короткошёрстная",
            "Британская длинношерстная",
            "Британская короткошерстная",
            "Бурманская кошка",
            "Бурмилла кошка",
            "Гавана",
            "Гималайская кошка",
            "Девон-рекс",
            "Донской сфинкс",
            "Европейская короткошерстная",
            "Египетская мау",
            "Канадский сфинкс",
            "Кимрик",
            "Корат",
            "Корниш-рекс",
            "Курильский бобтейл",
            "Лаперм",
            "Манчкин",
            "Мейн-ку́н",
            "Меконгский бобтейл",
            "Мэнкс кошка",
            "Наполеон",
            "Немецкий рекс",
            "Нибелунг",
            "Норвежская лесная кошка",
            "Ориентальная кошка",
            "Оцикет",
            "Персидская кошка",
            "Петерболд",
            "Пиксибоб",
            "Рагамаффин",
            "Русская голубая кошка",
            "Рэгдолл",
            "Саванна",
            "Селкирк-рекс",
            "Сиамская кошка",
            "Сибирская кошка",
            "Сингапурская кошка",
            "Скоттиш-фолд",
            "Сноу-шу",
            "Сомалийская кошка",
            "Тайская кошка",
            "Тойгер",
            "Тонкинская кошка",
            "Турецкая ангорская кошка",
            "Турецкий ван",
            "Украинский левкой",
            "Чаузи",
            "Шартрез",
            "Экзотическая короткошерстная",
            "Японский бобтейл"
    };

    public static void connectOrCreateDB(String path) throws SQLException, ClassNotFoundException {//создание или подключение БД
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection(path);//создаем соединение
        stmt = conn.createStatement();//получаем доступ к БД для выполнения SQL запросов
    }

    public static void createTable() throws SQLException{//создание таблицы
        stmt.execute("CREATE TABLE if not exists 'types' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'type' VARCHAR(100) NOT NULL);");
    }

    public static void insertType (String type)//добавление типа кошки
    {
        try {
            stmt.executeUpdate("INSERT INTO 'types' ('type') VALUES ('" + type + "')");
        }
        catch (SQLException s) {
            System.out.println("Запись '"+type+"' уже существует");
        }
    }

    static void addAllTypes(String[] types) {
        for (String type : types) {
            insertType(type);
        }
    }

    public static void deleteType (int id) throws SQLException {//удаление типа кошки по ID
        stmt.executeUpdate("DELETE FROM types WHERE id=" + id);
    }

    public static void deleteType (String type) throws SQLException {//удаление типа кошки по названию
        stmt.executeUpdate("DELETE FROM types WHERE type='" + type + "'");
    }

    public static void updateType (int id, String newType ) {//обновление типа кошки по ID
        try {
            stmt.executeUpdate("UPDATE types SET type='"+newType+"' WHERE id=" + id);
        }
        catch (SQLException s) {
            System.out.println("Запись с ключом '"+id+"' уже существует");
        }
    }

    public static void updateType (String type, String newType ) {//обновление типа кошки по названию
        try{
            stmt.executeUpdate("UPDATE types SET type='"+newType+"' WHERE type='" + type + "'");
        }
        catch (SQLException s) {
            System.out.println("Запись '"+newType+"' уже существует");
        }
    }

    public static String getType (int id) throws SQLException {//получаем тип по id
        ResultSet rs = stmt.executeQuery("SELECT type FROM types WHERE id=" + id);
        return rs.isBeforeFirst()?rs.getString("type"):"Типа с ключом "+id+" не существует";
    }

    public static ResultSet getType (String where) throws SQLException {//получаем типы по условию
        ResultSet rs = stmt.executeQuery("SELECT id, type FROM types WHERE " + where);
        //while(rs.next())//пока печать отключаем
//            System.out.println(rs.getString("type"));
        return rs;
    }

    public static void getType () throws SQLException {//получаем и печатаем все типы
        ResultSet rs = stmt.executeQuery("SELECT type FROM types");
        while(rs.next())
            System.out.println(rs.getString("type"));
    }

    public static void createTableCats() throws SQLException{//создание таблицы котов
        stmt.executeUpdate("CREATE TABLE if not exists 'cats' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'name' VARCHAR(20) NOT NULL, 'id_type' INTEGER REFERENCES 'types' ('id') ON DELETE RESTRICT NOT NULL, 'age' INTEGER NOT NULL, 'weight' DOUBLE, FOREIGN KEY ('id_type')  REFERENCES 'types' ('id'))");
    }

    public static void insertCat (String name, String type, int age, Double weight) throws SQLException {//добавление кошки
        ResultSet rs = getType("type='"+type+"'");//ищем тип
        int id;
        if (rs.isBeforeFirst())//если тип есть то берем его id
            id=rs.getInt("id");
        else {//если нет, то создаем и берем
            insertType(type);
            id = getType("type='"+type+"'").getInt("id");
        }
        stmt.executeUpdate("INSERT INTO 'cats' ('name','id_type','age','weight') VALUES ('" + name + "',"+id+","+age+","+weight+")");
    }

    public static void addMoreCats (int n) throws SQLException {//добавление кошек
        int minType=stmt.executeQuery("SELECT MIN(id) as id FROM types").getInt("id");//находим минимально и максимально возможное id типа
        int maxType=stmt.executeQuery("SELECT MAX(id) as id FROM types").getInt("id");
        int idType, age;//тип, возраст
        String name, type;//имя, тип
        double weight;//вес
        String[] names = {"Гарфилд","Том","Гудвин","Рокки","Ленивец","Пушок","Спорти","Бегемот","Пират","Гудини","Зорро","Саймон","Альбус","Базилио","Леопольд","Нарцисс","Атос","Каспер","Валлито","Оксфорд","Бисквит","Соня","Клеопатра","Цунами","Забияка","Матильда","Кнопка","Масяня","Царапка","Серсея","Ворсинка","Амели","Наоми","Маркиза","Изольда","Вальс","Несквик","Златан","Баскет","Изюм","Цукат","Мокко","Месси","Кокос","Адидас","Бейлиз","Тайгер","Зефир","Мохи","Валенсия","Баунти","Свити","Текила","Ириска","Карамель","Виски","Кукуруза","Гренка","Фасолька","Льдинка","Китана","Офелия","Дайкири","Брусника","Аватар","Космос","Призрак","Изумруд","Плинтус","Яндекс","Крисмас","Метеор","Оптимус","Смайлик","Цельсий","Краска","Дейзи","Пенка","Веста","Астра","Эйприл","Среда","Бусинка","Гайка","Елка","Золушка","Мята","Радость","Сиам","Оскар","Феликс","Гарри","Байрон","Чарли","Симба","Тао","Абу","Ватсон","Енисей","Измир","Кайзер","Васаби","Байкал","Багира","Айрис","Диана","Мими","Сакура","Индия","Тиффани","Скарлетт","Пикси","Лиззи","Алиса","Лило","Ямайка","Пэрис","Мальта","Аляска"};//массим имен котов

        for (int i = 0; i < n; i++) {
            type="";
            while (type.equals("")) {//берем рандомно один из типов в диапазоне от мин до макс и проверяем его наличие, если такого типа нет то заново
                idType = (int) ((Math.random() * (maxType - minType)) + minType);
                ResultSet rs = stmt.executeQuery("SELECT type FROM types WHERE id=" + idType);//вытаскиваем тип по рандомному id
                if (rs.isBeforeFirst())//если тип есть то присваиваем его и выходим из цикла
                    type=rs.getString("type");
            }
            name = names[(int) (Math.random() * (names.length - 1))];//рандомно выбираем имя из массива
            age =  (int) (Math.random() * (30));//рандомно выбираем возраст до 30 лет
            weight = Math.round((0.01 + (30.0 - 0.01) * new Random().nextDouble())*100.0)/100.0;//рандомно выбираем вес и округляем до 2 знаков после запятой
            insertCat(name,type,age,weight);//добавляем
        }
    }

    public static void deleteById (String table, int id) throws SQLException {//удаление из таблицы по ID
        stmt.executeUpdate("DELETE FROM "+table+" WHERE id=" + id);
    }

    public static void deleteByWhere (String table, String where) throws SQLException {//удаление из таблицы по where
        stmt.executeUpdate("DELETE FROM "+table+" WHERE "+where);
    }

    public static void updateByWhereWithSet (String table, String set, String where) {//универсальное обновление по where
        try{
            stmt.executeUpdate("UPDATE "+table+" SET "+set+" WHERE "+where);
        }
        catch (SQLException s) {
            System.out.println("Запись уже существует");
        }
    }

    public static void updateByIdWithSet (String table, String set, int id) {//универсальное обновление по id
        try{
            stmt.executeUpdate("UPDATE "+table+" SET "+set+" WHERE id="+id);
        }
        catch (SQLException s) {
            System.out.println("Запись уже существует");
        }
    }

    public static String getCat (int id) throws SQLException {//получаем котика по id
        ResultSet rs = stmt.executeQuery("SELECT cats.name, types.type as type, cats.age, cats.weight FROM cats JOIN types ON cats.id_type=types.id WHERE cats.id=" + id);
        return rs.isBeforeFirst()?rs.getString("name")+", "+rs.getString("type")+", "+rs.getInt("age")+", "+rs.getDouble("weight"):"Котика с ключом "+id+" не существует";
    }

    public static ResultSet getCat (String where) throws SQLException {//получаем и печатаем котов по условию
        ResultSet rs = stmt.executeQuery("SELECT cats.name, types.type as type, cats.age, cats.weight FROM cats JOIN types ON cats.id_type=types.id WHERE " + where);
        while(rs.next())
            System.out.println(rs.getString("name")+", "+rs.getString("type")+", "+rs.getInt("age")+", "+rs.getDouble("weight"));
        return rs;
    }

    public static void getCat () throws SQLException {//получаем и печатаем всех котов
        ResultSet rs = stmt.executeQuery("SELECT cats.name, types.type as type, cats.age, cats.weight FROM cats JOIN types ON cats.id_type=types.id");
        while(rs.next())
            System.out.println(rs.getString("name")+", "+rs.getString("type")+", "+rs.getInt("age")+", "+rs.getDouble("weight"));
    }
}
