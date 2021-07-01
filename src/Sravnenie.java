/**Напишите консольную программу, в которой пользователь вводит с клавиатуры число.
 * Если число одновременно меньше 9 и больше 2, то программа выводит "Число больше 5 и меньше 10".
 * Иначе программа выводит сообщение "Неизвестное число".
 */

import java.util.Scanner;

public class Sravnenie {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scn.nextInt();
        if(a < 9 && a > 2){
            System.out.println(a + " больше 2 и меньше 9");
        }else{
            System.out.println("Неизвестное число");
        }

    }
}
