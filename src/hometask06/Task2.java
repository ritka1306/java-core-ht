package hometask06;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку целиком");
        String s = in.nextLine();
        String[] strings = s.split(" ");
        for (String str : strings) {
            if (str.matches("^[a-h]\\w*"))
                System.out.println(str);
        }
    }
}
