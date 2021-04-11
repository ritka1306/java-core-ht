package hometask10.task6;

/* Нам заказали сделать программу автоматической рассылки писем потенциальным
клиентам. Задача: создать словарь типа «фамилия»-«зарплата» и удалить из него тех, у кого
зарплата ниже 500 кредитов.*/

import java.util.HashMap;
import static hometask10.task6.PersonTask6.*;

public class Task6 {
    public static void main(String[] args) {
        HashMap<String, Integer> rich = createMap();
        System.out.println(rich);
        removeItemFromMap(rich);
        System.out.println(rich);

    }
}
