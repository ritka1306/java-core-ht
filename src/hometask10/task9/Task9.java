package hometask10.task9;

/* Напишите метод, который получает на вход массив элементов типа К (Generic) и возвращает
Map<K, Integer>, где K — значение из массива, а Integer — количество вхождений в массив.
То есть сигнатура метода выглядит так: <K> Map<K, Integer> arrayToMap(K[] ks); */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task9 {
    public static void main(String[] args) {
        Integer[] intArr = new Integer[]{100, 450, 300, 450, 150, 300, 800, 900, 600, 150, 450, 800};
        System.out.println(Arrays.toString(intArr));
        System.out.println(arrayToMap(intArr));
    }

    private static <K> Map<K, Integer> arrayToMap(K[] array) {
        Map<K, Integer> map = new HashMap<>();
        for (K key : array) {
            map.compute(key, (v, counter) -> {
                if (counter == null) {
                    counter = 0;
                }
                counter++;
                return counter;
            });
        }
        return map;
    }
}
