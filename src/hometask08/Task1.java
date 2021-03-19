package hometask08;

import java.time.LocalDate;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        int nowDayOfYear = date.getDayOfYear();
        System.out.println("Текущая дата: " + date);
        System.out.println("Сегодняшний день от начала года: " + nowDayOfYear);
        LocalDate a = date.plusDays(nowDayOfYear);
        System.out.println("Дата после прибавления дней: " + a);
    }
}

