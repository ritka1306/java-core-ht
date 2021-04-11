package hometask10.task5;


/* Давайте создадим словарь, занесём в него записи по принципу «фамилия» - «имя» и удалим
людей с одинаковыми именами.*/

import java.util.HashMap;
import java.util.Map;

public class PersonTask5 {
    public static HashMap<String, String> createMap() {

        HashMap<String, String> maap = new HashMap<String, String>();
        maap.put("Martin", "Hugo");
        maap.put("Fisher", "Leo");
        maap.put("Stark", "David");
        maap.put("Frost", "Brayan");
        maap.put("Navy", "Daniel");
        maap.put("Marley", "Leo");
        maap.put("Loona", "David");
        maap.put("Diper", "Nick");
        maap.put("Kony", "Tony");
        maap.put("Man", "Lexxy");
        return maap;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {

        HashMap<String, String> name = new HashMap<String, String>(map);
        for (Map.Entry pair : name.entrySet()) {
            int count = 0;
            String a = (String) pair.getValue();
            for (Map.Entry pair2 : name.entrySet()) {
                if (pair2.getValue().equals(a))
                    count++;
            }
            if (count > 1) {
                for (int i = 0; i < count; i++)
                    removeItemFromMapByValue(map, String.valueOf(a));
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}