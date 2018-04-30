package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EnglishWeather extends Thread {
    @Override
    public void run() {
        Map<String,String> baseWeather = Generator.generate();
        Map<String,String> eng = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            ConcurrentHashMap<String, String> weather = ChangeWeather.generate(i);
            eng.put("Город", "City");
            eng.put("Температура", "Temperature");
            eng.put("Давление", "Pressure");
            eng.put("Влажность", "Humidity");
            eng.put("Скорость Ветра", "Wind speed");
            eng.put("Осадки", "precipitation");
            if (!baseWeather.get("Влажность").equalsIgnoreCase(weather.get("Влажность"))){
                System.out.println(eng.get("Город") + "=" + weather.get("Город") );
                System.out.println(eng.get("Температура") + "=" + weather.get("Температура") );
                System.out.println(eng.get("Давление") + "=" + weather.get("Давление") );
                System.out.println(eng.get("Влажность") + "=" + weather.get("Влажность") );
                System.out.println(eng.get("Скорость Ветра") + "=" + weather.get("Скорость Ветра") );
                System.out.println(eng.get("Осадки") + "=" + weather.get("Осадки") );
                System.out.println("");
                try {
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
