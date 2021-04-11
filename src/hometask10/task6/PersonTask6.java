package hometask10.task6;

/* Нам заказали сделать программу автоматической рассылки писем потенциальным
клиентам. Задача: создать словарь типа «фамилия»-«зарплата» и удалить из него тех, у кого
зарплата ниже 500 кредитов.*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PersonTask6 {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> notes = new HashMap<String, Integer>();
        notes.put("Иванов", 1500);
        notes.put("Петров", 845);
        notes.put("Сидоров", 521);
        notes.put("Петренко", 197);
        notes.put("Наумов", 499);
        notes.put("Петлицкий", 2496);
        notes.put("Казак", 387);
        notes.put("Голубев", 994);
        notes.put("Князев", 700);
        notes.put("Никитюк", 9200);

        return notes;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> salary = map.entrySet().iterator();

        while (salary.hasNext()) {
            Map.Entry<String, Integer> entry = salary.next();
            if (entry.getValue() < 500) {
                salary.remove();
            }
        }
    }

}
