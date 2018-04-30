package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Generator.generate());
        UkrainianWeather weather = new UkrainianWeather();
        EnglishWeather englishWeather = new EnglishWeather();
        weather.start();
        Thread.sleep(4000);
        englishWeather.start();
    }
}
