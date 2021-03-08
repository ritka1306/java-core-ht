package hometask02;/* Дано натуральное число x, выведите вторую справа цифру из числа. Если этой цифры нет,
вывести ноль. Например: 123 -> вывод: 2, 345 -> 4, 7 -> 0. */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число x=");
        int userNumber = scanner.nextInt();
        if (userNumber > 9) {
            int x = (userNumber / 10) % 10;
            System.out.println("Вторая цифра - " + x);
        } else {
            System.out.println("Вторая цифра - " + 0);
        }
    }
}
