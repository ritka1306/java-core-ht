package hometask06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку целиком");
        String s = in.nextLine();
        System.out.println(maxWord(s.split(" ")));
    }

    public static String maxWord(String[] str) {
        Arrays.sort(str, ((Comparator<String>) (a, b) -> a.length() - b.length()).thenComparing((a, b) -> b.compareToIgnoreCase(a)));
        return str[str.length - 1];
    }
}

