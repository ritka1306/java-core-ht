package hometask03;/*Создать массив интов длинной 10. Заполнить рандомно от 0 до 9 (включительно).
Проверить, чтобы не было повторяющихся чисел. Если какое-то число повторяется, то заменить на то,
которого еще нет.*/

import java.util.Random;

public class Task7 {
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
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = rand.nextInt(10);
                }
            }
        }
        System.out.println(System.lineSeparator() + "Исправленный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
