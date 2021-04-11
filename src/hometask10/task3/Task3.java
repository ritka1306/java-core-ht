package hometask10.task3;


/* Очень часто люди и прочие граждане Вселенной пытаются найти своих родственников.
Сделаем шаг к программе поиска людей. В задачке нам нужно создать словарь (Map<String,
String>) занести в него десять записей по принципу «Фамилия» - «Имя», после чего
проверить, сколько людей имеют совпадающие с заданным имя или фамилию. */

import java.util.HashMap;

import static hometask10.task3.Person.*;

public class Task3 {
    public static void main(String[] args) {

        HashMap<String, String> map = createMap();

        System.out.println(map);

        System.out.println(getCountTheSameFirstName(map, "Leo"));
        System.out.println(getCountTheSameLastName(map, "Kony"));

    }
}
