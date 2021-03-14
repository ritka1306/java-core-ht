package hometask06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
    public static void main(String[] args) throws IOException {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку");
        String str = s.readLine();
        String[] chAr = str.split(" ");
        String ch = chAr[0];
        for (int i = 1; i < chAr.length; i++) {
            if (ch.length() < chAr[i].length())
                ch = chAr[i];
        }
        System.out.println(ch);
    }
}
