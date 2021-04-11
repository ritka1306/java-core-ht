package hometask10.task4;

import java.util.HashMap;


import static hometask10.task4.Children.createMap;
import static hometask10.task4.Children.fixedHappyList;

public class Task4 {
    public static void main(String[] args) {
        HashMap<String, Integer> mapy = createMap();

        System.out.println(mapy);

        fixedHappyList(mapy);

        System.out.println(mapy);
    }
}
