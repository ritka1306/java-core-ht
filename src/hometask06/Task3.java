package hometask06;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку целиком");
        String s = in.nextLine();
        String[] strings = s.split(" - |, ");
        System.out.println(strings[0] + ":");
        for (int i = 1; i < strings.length; i++) {
            System.out.println("-" + strings[i]);
        }
    }
}
