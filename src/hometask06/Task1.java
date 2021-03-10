package hometask06;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два слова");
        String word1 = sc.next();
        String word2 = sc.next();
        int diff = word1.compareTo(word2);
        if (diff < 0) {
            System.out.println(word1);
        } else if (diff > 0) {
            System.out.println(word2);
        } else {
            System.out.println("Строки равны");
        }
    }
}
