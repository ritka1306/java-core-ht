package hometask02;/*В три переменные a, b и c явно записаны программистом три целых попарно неравных
между собой числа. Создать программу, которая переставит числа в переменных таким
образом, чтобы при выводе на экран последовательность a, b и c оказалась строго
возрастающей*/

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число a=");
        int a = scanner.nextInt();
        System.out.print("Введите второе число b=");
        int b = scanner.nextInt();
        System.out.print("Введите третье число c=");
        int c = scanner.nextInt();
        if (a == b || a==c || b==c) {
            System.out.println("Вы ввели повторяющиеся числа");
        }
        if (a < b && a < c) {
            if (b < c) {
                System.out.println("Ваша последовательность " + a + " " + b + " " + c);
            }
                else{
                    System.out.println("Ваша последовательность " + a + " " + c + " " + b);
                }
        }
        if (b < a && b < c) {
            if (a < c) {
                System.out.println("Ваша последовательность " + b + " " + a + " " + c);
            }
             else{
                    System.out.println("Ваша последовательность " + b + " " + c + " " + a);
                }
        }
        if (c < a && c < b) {
            if (a < b) {
                System.out.println("Ваша последовательность " + c + " " + a + " " + b);
            }
                else{
                    System.out.println("Ваша последовательность " + c + " " + b + " " + a);
                }
        }
    }
}
