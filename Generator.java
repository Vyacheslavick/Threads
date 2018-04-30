package com.company;

import java.util.concurrent.ConcurrentHashMap;

public class Generator {
    public static ConcurrentHashMap<String, String> generate() {
        ConcurrentHashMap<String, String> weather = new ConcurrentHashMap<>();
        weather.put("Город", "Харьков");
        weather.put("Давление", "760mm");
        weather.put("Температура", "22°");
        weather.put("Скорость Ветра", "12m");
        weather.put("Осадки", "5mm");
        weather.put("Влажность", "90%");
        return weather;
    }
}
