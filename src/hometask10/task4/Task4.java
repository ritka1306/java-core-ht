package hometask10.task4;

/* Зинаида Васильевна — классный руководитель 7-Б класса. Она дарит подарки ученикам в
дни рождения. Везет не всем: летние именинники — в пролёте по причине каникул. Пишем
программу для Зинаиды: создаем словарь с фамилиями и датами рождения, удаляем из
него людей, родившихся летом.*/


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
