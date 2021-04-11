package hometask10.task10;

/* С использованием множества выполнить попарное суммирование произвольного конечного
ряда чисел по следующим правилам: на первом этапе суммируются попарно рядом стоящие
числа, на втором этапе суммируются результаты первого этапа и т.д. до тех пор, пока не
останется одно число.*/

import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        Set<Integer> num = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
        System.out.println(num);
        AllNumElement(multiplySet(num));
    }

    private static void AllNumElement(Set<Integer> set) {
        LinkedHashSet<Integer> newSet;
        newSet = (LinkedHashSet<Integer>) multiplySet(set);
        do newSet = (LinkedHashSet<Integer>) multiplySet(newSet);
        while (newSet.size() > 1);
    }

    private static Set<Integer> multiplySet(Set<Integer> set) {
        if (set.size() % 2 != 0) set.add(0);
        int counter = 0;
        Set<Integer> newSet = new LinkedHashSet<>();
        int doubleValue = 0;
        for (Integer integer : set) {
            if (counter < 2) {
                counter++;
                doubleValue = doubleValue + integer;
                if (counter == 2) {
                    newSet.add(doubleValue);
                    doubleValue = 0;
                    counter = 0;
                }
            }
        }
        System.out.println(newSet);
        return newSet;
    }

}
