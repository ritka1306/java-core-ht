package hometask03;

import java.util.Random;

/*Создать матрицу 5х5. Диагоняль заполнить нолями. Элементы матрицы ниже диагонали заполнить 1.
Элементы выше диагонали зполнять -1.*/

public class Task6 {
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
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    array[i][j] = 0;
                }
                if (i > j) {
                    array[i][j] = 1;
                }
                if (i < j) {
                    array[i][j] = -1;
                }
            }
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
