//Вводится 3 целых числа, выведите большее из них

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    Boolean max_a = (a>b) && (a>c);
    Boolean max_b = (b>a) && (b>c);

if (max_a) {
    System.out.println(a);
}else{
    if (max_b) {
        System.out.println(b);
    }else{
        System.out.println(c);
        }
    }
}
}
