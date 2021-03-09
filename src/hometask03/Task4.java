package hometask03;

import java.util.Random;

/*Создать массив интов длинной 10. Заполнить рандомно от 0 до 9 (включительно).
Каждый 3й элемент заменить на 3.*/

public class Task4 {
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
        for (int i = 2; i < array.length; i += 3) {
            array[i] = 3;
        }
        System.out.println(System.lineSeparator() + "Исправленный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
