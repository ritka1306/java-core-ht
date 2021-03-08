package hometask02;

import java.util.Scanner;

/*Дано трехзначное целое число (то есть целое число от 100 до 999). Найдите сумму его цифр*/

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трехзначное число x=");
        int userNumber = scanner.nextInt();
        if (userNumber > 1000 || userNumber < 99) {
            System.out.println("Вы ввели неверное число");
        } else {
            int sum = 0;
            for (int i = userNumber; i > 0; i /= 10) {
                sum += i % 10;
            }
            System.out.println("Сумма цифр числа - " + sum);
        }
    }
}