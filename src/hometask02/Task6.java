package hometask02;/*Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в
переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.*/

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число m=");
        double m = scanner.nextDouble();
        System.out.print("Введите второе число n=");
        double n = scanner.nextDouble();
        int a = 10;
        double b = Math.abs (a - m);
        double c = Math.abs (a - n);
        if (b==c){
            System.out.println("Числа "+n +" и "+m + " равноудалены от "+a);
        }
        if(b>c){
            System.out.println("Ближе к 10 находится " + n);
        }
        if (b<c) {
            System.out.println("Ближе к 10 нахоится " + m);
        }
    }

}
