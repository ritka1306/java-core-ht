package hometask03;/*Создать массив интов длинной 10. Заполнить рандомно от 0 до 9 (включительно).
Заменить все четные на 0, нечетные на 1.*/

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        System.out.print("Исходный массив: " + System.lineSeparator());
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            } else
                array[i] = 1;
        }
        System.out.println(System.lineSeparator() + "Исправленный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
