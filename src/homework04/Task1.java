package homework04;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число - ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число - ");
        int b = scanner.nextInt();
        System.out.println(System.lineSeparator() + "Сумма введённых чисел - " + sum(a, b));
    }
        static int sum (int a, int b) {
        return a + b;
    }
}
