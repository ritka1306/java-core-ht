package hometask02;

import java.util.Scanner;

/*Дано двузначное число. Выведите его первую цифру (то есть количество десятков)*/

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите двухзначное число x=");
        int userNumber = scanner.nextInt();
        if (userNumber > 99 || userNumber < 9) {
            System.out.println("Вы ввели неверное число");
        } else {
            int z = (userNumber / 10) % 10;
            System.out.println("Первая цифра - " + z);
        }
    }
}
