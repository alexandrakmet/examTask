package org.univ;

import org.univ.dao.WeatherDao;
import org.univ.data.Weather;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter region to get info about its weather");
        Scanner in = new Scanner(System.in);
        String region = in.nextLine();
        ArrayList<Weather> weathersStat = WeatherDao.getWeatherStatInRegion(region);
        for (Weather w : weathersStat) {
            System.out.println(w.toString());
        }

        System.out.println("Enter region to get info when it was snowing there and the temperature was below -10.");
        region = in.nextLine();
        ArrayList<java.sql.Date> snowDates = WeatherDao.getSnowDatesInRegion(region);
        for (Date d : snowDates) {
            System.out.println(d);
        }

        System.out.println("Enter language to get info the weather for the past week in the regions where the inhabitants speak a given language.");
        String lang = in.nextLine();
        weathersStat = WeatherDao.getWeatherStatInRegionsBySpeakingLang(lang);
        for (Weather w : weathersStat) {
            System.out.println(w.toString());
        }

        System.out.println("Get info about the average temperature for the last week in regions with an area of more than 1000.");
        int temperature = WeatherDao.getAverageTemperature();
        System.out.println("Average temperature is : " + temperature);
    }
}

