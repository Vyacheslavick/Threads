package com.company;

import java.util.concurrent.ConcurrentHashMap;

public class Weather {
    ConcurrentHashMap<String,String> weather;

    public Weather(ConcurrentHashMap<String, String> weather) {
        this.weather = weather;
    }

}
