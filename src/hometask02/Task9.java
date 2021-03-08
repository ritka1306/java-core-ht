package hometask02;/*Рассмотрите следующий фрагмент кода.
if (aNumber >= 0)
if (aNumber == 0)
System.out.println("first string");
else System.out.println("second string");
System.out.println("third string");
1. Что будет в консоли, если aNumber=3?
2. Что будет в консоли, если aNumber=0?
3. Используйте фигурные скобки, {и}, чтобы сделать код более читаемым.*/

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число x=");
        int userNumber = scanner.nextInt();
        if (userNumber >= 0)
            if (userNumber == 0)
                System.out.println("first string");
            else System.out.println("second string");
        System.out.println("third string");
    }
}