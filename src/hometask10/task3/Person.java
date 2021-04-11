package hometask10.task3;

import java.util.HashMap;

public class Person {
    public static HashMap<String, String> createMap() {

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Martin", "Hugo");
        map.put("Fisher", "Leo");
        map.put("Stark", "David");
        map.put("Frost", "Brayan");
        map.put("Navy", "Daniel");
        map.put("Marley", "Leo");
        map.put("Loona", "David");
        map.put("Diper", "Nick");
        map.put("Kony", "Tony");
        map.put("Man", "Lexy");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for (String s : map.values())
            if (s.equals(name))
                count += 1;
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (String s : map.keySet())
            if (s.equals(lastName))
                count += 1;
        return count;
    }


}