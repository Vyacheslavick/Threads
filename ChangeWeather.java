package com.company;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class ChangeWeather extends Thread{
    public static ConcurrentHashMap<String, String> generate(int num) {
        ConcurrentHashMap<String, String> baseWeather = Generator.generate();
        ConcurrentHashMap<String, String> weather = new ConcurrentHashMap<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();
        ArrayList<String> list5 = new ArrayList<>();
        list1.add(0, "45%");
        list1.add(1, "55%");
        list1.add(2, "50%");
        list1.add(3, "70%");
        list2.add(0, "760mm");
        list2.add(1, "750mm");
        list2.add(2, "764mm");
        list2.add(3, "770mm");
        list3.add(0, "30°");
        list3.add(1, "27°");
        list3.add(2, "25°");
        list3.add(3, "24°");
        list4.add(0,"11 m");
        list4.add(1,"10 m");
        list4.add(2,"8 m");
        list4.add(3,"14 m");
        list5.add(0, "2mm");
        list5.add(1, "4mm");
        list5.add(2, "7mm");
        list5.add(3, "5mm");
        for (int i = num; i < 4; i++) {
            weather.put("Город", "Харьков");
            weather.put("Влажность", list1.get(i));
            weather.put("Давление", list2.get(i));
            weather.put("Температура", list3.get(i));
            weather.put("Скорость Ветра", list4.get(i));
            weather.put("Осадки", list5.get(i));
            if (!weather.get("Влажность").equalsIgnoreCase(baseWeather.get("Влажность"))){
                baseWeather = weather;
                break;
            }
        }
        return baseWeather;
    }
}
