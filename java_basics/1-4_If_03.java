// С клавиатуры построчно вводятся три строки. Необходимо определить, все ли он равны. Если да, то вывести "Yes", в противном случае - "No".

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    String b = sc.nextLine();
    String c = sc.nextLine();
    boolean ab = a.equals(b);
    boolean bc = b.equals(c);
    if (ab && bc) {
        System.out.println("Yes");
    }else{
            System.out.println("No");
         }
    }
}
