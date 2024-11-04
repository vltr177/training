// Температура
// Вводится одно действительное число - температура воздуха на улице. Если она меньше, чем 22.4 градуса, то вывести "Холодно(", если больше, то вывести "Тепло!", если ровно 22.4 градуса, то вывести "Прохладно...".

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double t = sc.nextDouble();

        if (t < 22.4){
            System.out.println("Холодно(");
            }
        else{
            if (t > 22.4){
                System.out.println("Тепло!");
                }
            else{
                System.out.println("Прохладно...");                
                }
            }
        }
    }
