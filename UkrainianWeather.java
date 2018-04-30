package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UkrainianWeather  extends  Thread  {
    @Override
    public void run() {
        Map<String,String> baseWeather = Generator.generate();
        Map<String,String> uk = new HashMap<>();

        for (int i = 0; i < 4; i++) {
            ConcurrentHashMap<String, String> weather = ChangeWeather.generate(i);
            uk.put("Город", "Місто");
            uk.put("Температура", "Температура");
            uk.put("Давление", "Тиск");
            uk.put("Влажность", "Вологість");
            uk.put("Скорость Ветра", "Швидість Вітру");
            uk.put("Осадки", "Осади");
            if (!baseWeather.get("Влажность").equalsIgnoreCase(weather.get("Влажность"))){
                System.out.println(uk.get("Город") + "=" + weather.get("Город") );
                System.out.println(uk.get("Температура") + "=" + weather.get("Температура") );
                System.out.println(uk.get("Давление") + "=" + weather.get("Давление") );
                System.out.println(uk.get("Влажность") + "=" + weather.get("Влажность") );
                System.out.println(uk.get("Скорость Ветра") + "=" + weather.get("Скорость Ветра") );
                System.out.println(uk.get("Осадки") + "=" + weather.get("Осадки") );
                System.out.println("");
                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
