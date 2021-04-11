package hometask10.task4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Children {
    public static HashMap<String, Integer> createMap() {

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Martin", 2);
        map.put("Fisher", 5);
        map.put("Stark", 8);
        map.put("Frost", 6);
        map.put("Navy", 9);
        map.put("Marley", 12);
        map.put("Loona", 7);
        map.put("Diper", 3);
        map.put("Kony", 10);
        map.put("Man", 6);
        return map;
    }

    public static void fixedHappyList(Map<String, Integer> localMap) {
        Iterator iterator = localMap.values().iterator();
        while (iterator.hasNext()) {
            int happyBirthday = (int) iterator.next();
            if (happyBirthday > 5 && happyBirthday < 9) {
                iterator.remove();
            }
        }
    }
}
