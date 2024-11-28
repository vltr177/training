//Сумма массивов
// Вводится число n. Затем вводится 2 раза по n действительных чисел - два массива. Вывести на экран их сумму.

import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] array1 = new float[n];
        float[] array2 = new float[n];
        for (int i = 0; i < n; i++)
            array1[i] = sc.nextFloat();
        for (int i = 0; i < n; i++)
            array2[i] = sc.nextFloat();
        for (int i = 0; i < n; i++)
            System.out.println(array1[i] + array2[i]);
    }
}

//2
