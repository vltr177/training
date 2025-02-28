/* Публичный статический метод toOctal(int) должен переводить целое число, полученное в качестве входящего параметра, из десятичной системы счисления в восьмеричную. А публичный статический метод toDecimal(int) наоборот — из восьмеричной в десятичную.
Методы работают только с положительными числами. Если входящий параметр меньше или равен 0, методы возвращают 0.
Твоя задача — реализовать эти методы.

Один из алгоритмов перевода десятичного числа в восьмеричное следующий:
i равно 0
while(десятичное число не равно 0) {
восьмеричное число = восьмеричное число + (остаток от деления десятичного числа на 8) * на 10 в степени i
десятичное число = десятичное число / 8
i увеличиваем на 1
}

Один из алгоритмов перевода восьмеричного числа в десятичное следующий:
i равно 0
while(восьмеричное число не равно 0) {
десятичное число = десятичное число + (остаток от деления восьмеричного числа на 10) * на 8 в степени i
восьмеричное число = восьмеричное число / 10
i увеличиваем на 1
}
*/

import java.util.regex.Pattern;

/* 
Восьмеричный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber){
        if (decimalNumber > 0){
            int octal = 0;
            for (int i = 0; decimalNumber != 0; i++){
                octal = octal + (decimalNumber % 8) * (int) Math.pow(10, i);
                decimalNumber = decimalNumber / 8;
            }
            return octal;
        }
        else {
            return 0;
        }
    }

    public static int toDecimal(int octalNumber) {
        if (octalNumber > 0) {
            int decimal = 0;
            for (int i = 0; octalNumber != 0; i++) {
                decimal = decimal + (octalNumber % 10) * (int) Math.pow(8, i);
                octalNumber = octalNumber / 10;
            }
            return decimal;
        } else {
            return 0;
        }
    }
}

/* Публичный статический метод toBinary(int) должен переводить целое число, полученное в качестве входящего параметра, из десятичной системы счисления в двоичную и возвращать его строковое представление. А публичный статический метод toDecimal(String) наоборот — из строкового представления двоичного числа в десятичное число.
Методы работают только с положительными числами и не пустыми строками. Если входящий параметр меньше или равен 0, метод toBinary(int) возвращает пустую строку. Если входящий параметр — пустая строка или null, то метод toDecimal(String) возвращает 0.
Твоя задача — реализовать эти методы.

Один из алгоритмов перевода десятичного числа в представление двоичного числа следующий:
while(десятичное число не равно 0) {
двоичное представление = остаток от деления десятичного числа на 2 + двоичное представление
десятичное число = десятичное число / 2
}

Один из алгоритмов перевода представления двоичного числа в десятичное число следующий:
for (int i = 0; i < длины двоичного представления; i++) {
десятичное число = десятичное число + число из двоичного представления * на 2 в степени i
}

Изначально берется крайнее правое число из двоичного представления. С каждой итерацией цикла берется следующее число ближе к началу двоичного представления. */

import java.util.regex.Pattern;

/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if (decimalNumber > 0) {
            String binary = "";
            while (decimalNumber != 0){
                binary = (decimalNumber % 2) + binary;
                decimalNumber = decimalNumber / 2;
            }
            return binary;
        }
        else {
            return "";
        }
    }

    public static int toDecimal(String binaryNumber) {
        if ((binaryNumber != null) && !(binaryNumber.equals(""))){
            int decimal = 0;
            int[]mas = new int[binaryNumber.length()];
            for (int i = 0; i < mas.length; i++){
                mas[i] = Character.getNumericValue(binaryNumber.charAt(mas.length - 1 - i));
            }
            for (int i = 0; i < mas.length; i++){
                decimal = decimal + mas[i] * (int) (Math.pow(2,i));
            }
            return decimal;
        }
        else {
            return 0;
        }
    }
}


/* Публичный статический метод toHex(int) должен переводить целое число, полученное в качестве входящего параметра, из десятичной системы счисления в шестнадцатеричную и возвращать его строковое представление. А публичный статический метод toDecimal(String) наоборот — из строкового представления шестнадцатеричного числа в десятичное число.
Методы работают только с положительными числами и не пустыми строками. Если входящий параметр меньше или равен 0, метод toHex(int) возвращает пустую строку. Если входящий параметр — пустая строка или null, то метод toDecimal(String) возвращает 0.
Твоя задача реализовать эти методы.

Также в классе Solution есть константа HEX, которая содержит в себе все символы, используемые в шестнадцатеричной системе.

Один из алгоритмов перевода десятичного числа в шестнадцатеричное следующий:
while(десятичное число не равно 0) {
представление шестнадцатеричного числа = символ из строки HEX с индексом, равным остатку от деления десятичного числа на 16
+ представление шестнадцатеричного числа
десятичное число = десятичное число / 16
}

Один из алгоритмов перевода шестнадцатеричного числа в десятичное следующий:
for (int i = 0; i < длина входящей строки; i++) {
десятичное число = 16 * десятичное число + индекс символа из строки HEX, равного символу из входящей строки с индексом i
} /*

import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 324234;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4f28a";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        if (decimalNumber >= 0){
            String hex = "";
            while (decimalNumber != 0){
                hex = HEX.charAt(decimalNumber % 16) + hex;
                decimalNumber = decimalNumber / 16;
            }
            return hex;
        }
        else {
            return "";
        }
    }

    public static int toDecimal(String hexNumber) {
        if ((hexNumber != null) && !(hexNumber.equals(""))){
            int decimal = 0;
            char[] mas = new char[hexNumber.length()];
            for (int i = 0; i < mas.length; i++){
                mas[i] = hexNumber.charAt(i);
            }
            for (int i = 0; i < hexNumber.length(); i++){
                decimal = 16 * decimal + HEX.indexOf(mas[i]);
            }
            return decimal;
        }
        else {
            return 0;
        }
    }
}

/* Публичный статический метод toHex(String) должен переводить строковое представление двоичного числа, полученное в качестве входящего параметра, из двоичной системы счисления в шестнадцатеричную и возвращать его строковое представление. А публичный статический метод toBinary(String) наоборот — из строкового представления шестнадцатеричного числа в строковое представление двоичного числа.

Методы работают только с не пустыми строками.
Если входящий параметр — пустая строка или null, то оба метода возвращают пустую строку.
Если входящий параметр метода toHex(String) содержит любой символ, кроме 0 или 1, то метод возвращает пустую строку.
Если входящий параметр метода toBinary(String) содержит любой символ, кроме цифр от 0 до 9 или латинскую букву от a до f (в нижнем регистре), то метод возвращает пустую строку.

Твоя задача — реализовать эти методы.

Один из алгоритмов перевода строкового представления двоичного числа в строковое представление шестнадцатеричного числа следующий:

Проверяем длину строки, полученной входящим параметром. Она должна быть кратна 4.
Если это не так, то добавляем нужное количество 0 в начало строки.
Берем каждые четыре символа (бита) и проверяем, какому символу шестнадцатеричной кодировки он соответствует.
Один из алгоритмов перевода строкового представления шестнадцатеричного числа в строковое представление двоичного числа следующий:
Берем каждый символ и проверяем какому двоичному числу (4 бита) он соответствует. */

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";
    private static final String[] BIN = {"0000", "0001", "0010", "0011", "0100", "0101", "0110","0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        //проверяем на null или пустую строку
        if ((binaryNumber == null) || (binaryNumber.equals("")))
            return "";
        // проверяем на недопустимые символы для двоичной системы
        for (int i = 0; i < binaryNumber.length();i++){
            if ((binaryNumber.charAt(i) != '0') && (binaryNumber.charAt(i) != '1'))
                return "";
        }
        // выравниваем разряды по 4 бита
        String hex = "";
        for (int i = 4 - binaryNumber.length() % 4; i > 0;i--){
            if (i == 4)
                break;
            else    
                binaryNumber = "0" + binaryNumber;
        }
        // преобразуем в двоичную систему по таблицам соответствий
        for (int i = 0; i < binaryNumber.length(); i += 4){
            for (int j = 0; j < BIN.length; j++){
                if ((binaryNumber.substring(i, i + 4)).equals(BIN[j])){
                    hex = hex + HEX.charAt(j);
                    break;
                }
            }
        }
        return hex;
    }

    public static String toBinary(String hexNumber) {
        //проверяем на null или пустую строку
        if ((hexNumber == null) || (hexNumber.equals("")))
            return "";
        // проверяем на недопустимые символы для шестнадцатеричной системы
        for (int i = 0; i < hexNumber.length(); i++) {
            for (int j = 0; j < HEX.length(); j++) {
                if (hexNumber.charAt(i) == HEX.charAt(j))
                    break;
                if (j == HEX.length()-1)
                    return "";
            }
        }
        // преобразуем в шестнадцатеричную систему по таблицам соответствий
        String bin = "";
        for (int i = 0; i < hexNumber.length(); i++){
            for (int j = 0; j < HEX.length(); j++){
                if (hexNumber.charAt(i) == HEX.charAt(j)){
                    bin = bin + BIN[j];
                }
            }
        }
        return bin;
    }
}
