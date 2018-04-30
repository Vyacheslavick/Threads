package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RussianWeather extends Thread {
    @Override
    public void run() {
        Map<String,String> baseWeather = Generator.generate();
        for (int i = 0; i < 4; i++) {
            ConcurrentHashMap<String, String> weather = ChangeWeather.generate(i);

            if (!baseWeather.get("Влажность").equalsIgnoreCase(weather.get("Влажность"))){
                System.out.println("Город" + "=" + weather.get("Город") );
                System.out.println("Температура" + "=" + weather.get("Температура") );
                System.out.println("Давление" + "=" + weather.get("Давление") );
                System.out.println("Влажность" + "=" + weather.get("Влажность") );
                System.out.println("Скорость Ветра" + "=" + weather.get("Скорость Ветра") );
                System.out.println("Осадки" + "=" + weather.get("Осадки") );
                System.out.println("");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
