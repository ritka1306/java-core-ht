package hometask03;/*Создать матрицу 5х5. Заполнить рандомно от 1 до 9 (включительно).
Заполнить -1 строку 3 и колонку 2.*/

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] array = new int[5][5];
        System.out.println("Исходный массив: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = rand.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            array[2][i] = -1;
        }
        for (int i = 0; i < 5; i++) {
            array[i][1] = -1;
        }
        System.out.println("Исправленный массив: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
