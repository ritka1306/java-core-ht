package hometask06;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String[] strings = scanner.nextLine().split(" ");
        StringBuilder postfix = new StringBuilder();
        for (int i = 0; i < strings[1].length(); i++) {
            char c = strings[1].charAt(i);
            if(strings[0].indexOf(c) != -1)
                strings[0] = strings[0].replaceFirst(""+c,"");
            else
                postfix.append(c);
        }
        strings[0] += postfix;
        System.out.println(strings[0]);
    }
}
