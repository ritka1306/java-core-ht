package hometask10;

/* Перевалочный пункт Оддиозо ищет сотрудников. Единственное условие: количество
конечностей у них не должно превышать более десяти конечностей. Поможем им
программой, в которой создим множество чисел(Set<Integer>), занесем туда 20 различных
чисел, а затем удалить из множества все числа больше 10. */

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Set<Integer> limbs = new HashSet<>();
        while (limbs.size() < 20) {
            limbs.add(rand.nextInt(35));
        }
        System.out.println("Всего пришли с таким количеством конечностей: " + limbs.toString());

        limbs.removeIf(nextInteger -> nextInteger > 10);

        System.out.println("Подходящие по условию: " + limbs.toString());
    }
}
