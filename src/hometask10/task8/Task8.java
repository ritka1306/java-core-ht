package hometask10.task8;

/* Напишите метод, который получает на вход Map<K, V> и возвращает Map, где ключи и
значения поменяны местами. Так как значения могут совпадать, то тип значения в Map будет
уже не K, а Collection<K>: Map<V, Collection<K>>*/

import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        Map<Integer, Integer> map8 = new HashMap<>();
        map8.put(1, 100);
        map8.put(2, 200);
        map8.put(3, 300);
        map8.put(4, 200);
        map8.put(5, 500);
        System.out.println(reverseMap(map8));
    }

    static <K, V> Map<V, Collection<K>> reverseMap(Map<K, V> map) {
        Map<V, Collection<K>> newMap = new HashMap<>();
        Set<K> keys = map.keySet();
        for (K key : keys) {
            V value = map.get(key);
            newMap.compute(value, (v, collection) -> {
                if (collection == null) {
                    collection = new HashSet<>();
                }
                collection.add(key);
                return collection;
            });
        }
        return newMap;
    }
}
