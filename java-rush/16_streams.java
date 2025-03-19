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

