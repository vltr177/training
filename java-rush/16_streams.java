/*Напиши программу, которая считывает с консоли путь к файлу1 и путь к файлу2. Далее все байты из файла1 записывает в файл2, но при этом меняет их местами по такому принципу: первый со вторым, третий с четвертым, и т.д.
Если последний байт в файле1 нечетный, то пишем его в файл2 как есть. Для чтения и записи файлов используй методы newInputStream и newOutputStream класса Files.*/

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        Scanner console = new Scanner(System.in);
        try(
        var input = Files.newInputStream(Paths.get(console.nextLine()));
        var output = Files.newOutputStream(Paths.get(console.nextLine())) )
        {
            while (input.available() > 1){
                byte[] buffer = new byte[2];
                input.read(buffer);
                output.write(buffer[1]);
                output.write(buffer[0]);
            }
            if (input.available() == 1){
                output.write(input.read());
            }
        }
    }
}


/* Напиши программу, которая считывает из консоли имя текстового файла, далее читает символы из этого файла (используй метод readAllLines(Path) класса Files) и выводит на экран все, за исключением точки, запятой и пробела.
Требования:
•	Программа должна считать с консоли путь к файлу.
•	Программа должна вывести в консоль содержимое файла согласно условию.
•	Для чтения строк из файла должен быть использован метод readAllLines(Path) класса Files.
•	Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io. */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        try {
            List<String> lines = Files.readAllLines(Paths.get(console.nextLine()));
            for (String string : lines){
                char[] chars = string.toCharArray();
                for (char c : chars){
                    if (c != '.' && c != ',' && c != ' '){
                        System.out.print(c);
                    }
                }
            System.out.println();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


/* Напиши программу, которая считывает из консоли имя текстового файла, далее читает строки из этого файла (используй метод readAllLines(Path) класса Files) и выводит их на экран через одну, начиная с первой.

Требования:
•	Программа должна считать из консоли путь к файлу.
•	Программа должна вывести в консоли содержимое файла согласно условию.
•	Для чтения строк из файла нужно использовать метод readAllLines(Path) класса Files.
•	Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io. */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        List<String> lines = Files.readAllLines(Paths.get(console.nextLine()));
        for (int i = 0; i < lines.size(); i += 2)
            System.out.println(lines.get(i));
    }
}
