package hometask03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/*Создать массив интов длинной 10. Заполнить рандомно от 0 до 9 (включительно).
Отсортировать первую половину массива по убыванию, вторую половину по возрастанию*/

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] array = new int[10];

        System.out.println("Исходный массив");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
            System.out.print(array[i] + " ");
        }
        Arrays.sort(array, 0, array.length / 2);
        System.out.println(System.lineSeparator() + " отсортированный массив первой части");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        Arrays.sort(array, array.length / 2, array.length);
        System.out.println(System.lineSeparator() + " отсортированный массив второй части");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(System.lineSeparator() + " дубляж");
        int[] array1;
        array1 = Arrays.copyOf(array, 5);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        int temp;
        for (int i = array1.length - 1, j = 0; i >= array1.length / 2; i--, j++) {
            temp = array1[j];
            array1[j] = array1[i];
            array1[i] = temp;
        }
        System.out.println(System.lineSeparator() + " перевёрнутый дубляж");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println(System.lineSeparator() + "Исправленный массив");
        for (int i = 0; i < array.length; i++) {
            if (i < array.length/2) {
                for (int j = 0; j < array1.length; j++) {
                    array[i] = array1[j];
                }
            }
            System.out.print(array[i] + " ");
        }
    }
}