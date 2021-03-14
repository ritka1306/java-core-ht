package hometask08;

import java.time.LocalDate;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        System.out.println("Текущая дата: " + date);
        System.out.print("Введите количество дней с начала года: ");
        int x = scanner.nextInt();
        LocalDate y = date.plusDays(x);
        System.out.println("Дата после прибавления дней: " + y);
    }
}
