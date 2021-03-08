package hometask02;/* Вычисляет следующее выражение: 100 - (2 * (n + 3) ∗ n - 7) ∗ n + 3.
n - натуральное число. */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число n=");
        int userNumber = scanner.nextInt();
        int x = 100 - (2 * (userNumber + 3) * userNumber - 7) * userNumber + 3;
        System.out.println("Результат вычисления равен - " + x);
    }

}
