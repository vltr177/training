//По данному году определите, является ли он високосным. Если забыли, какой год называют високосным, то вот вам ссылка: високосный год
// Если год Високосный, то выведите "Yes", если же нет, то выведете "No"

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    Boolean test1 = (a%4 == 0) && (a%100 !=0);
    Boolean test2 = (a%400 == 0);


if (test1 || test2) {
    System.out.println("Yes");
}else{
    System.out.println("No");
     }
}
}
