 package hometask10.task5;


/* Давайте создадим словарь, занесём в него записи по принципу «фамилия» - «имя» и удалим
людей с одинаковыми именами.*/

import java.util.HashMap;

import static hometask10.task5.PersonTask5.*;

public class Task5 {
    public static void main(String[] args) {
        HashMap<String, String> map = createMap();

        System.out.println(map);
        removeTheFirstNameDuplicates(map);
        System.out.println(map);
    }

}
