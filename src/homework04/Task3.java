package homework04;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число - ");
        int a = scanner.nextInt();
        System.out.println(isPrime(a));
    }
    static boolean isPrime (int a) {
        if (a < 2) {
            return false;
        }
        for ( int i = 2; i <= a/i; i++){
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
