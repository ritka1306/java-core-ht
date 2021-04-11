package hometask10.task1;

/* Нужно создать множество строк (Set<String>) и занести в него 20 слов на букву «Л»*/

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Set<String> setString = new HashSet<>();
        setString.add("Луна");
        setString.add("Литерал");
        setString.add("Лимон");
        setString.add("Логика");
        setString.add("Лето");
        setString.add("Ливень");
        setString.add("Лабиринт");
        setString.add("Лаванда");
        setString.add("Лавина");
        setString.add("Лев");
        setString.add("Люрекс");
        setString.add("Лошадь");
        setString.add("Лифт");
        setString.add("Лес");
        setString.add("Лебедь");
        setString.add("Любовь");
        setString.add("Лён");
        setString.add("Льстить");
        setString.add("Лэндинг");
        setString.add("Лазурит");

        System.out.println(setString.toString());

    }
}
