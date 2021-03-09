package hometask03;/*Создать массив интов длинной 10. Заполнить рандомно от 0 до 9 (включительно).
Удалить 5й элемент*/

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] array = new int[10];

        System.out.println("Исходный массив");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println(System.lineSeparator() + "Исправленный массив");
        array[4] = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}