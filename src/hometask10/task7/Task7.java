package hometask10.task7;

/* Создадим коллекцию Set с типом элементов String. А добавим в неё вот такие десять строк:
арбуз, банан, вишня, груша, дыня, ежевика, женьшень, земляника, ирис, картофель. После
этого выведем содержимое коллекции на экран соблюдая порядок добавления.*/

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task7 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(Arrays.asList("арбуз", "банан", "вишня", "груша", "дыня", "ежевика", "женьшень", "земляника", "ирис", "картофель"));
        System.out.println(set);
    }
}
