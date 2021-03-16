package hometask06;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку целиком");
        String s = in.nextLine();
        s = s.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        if (s.toLowerCase().equals((new StringBuilder(s)).reverse().toString().toLowerCase()))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
