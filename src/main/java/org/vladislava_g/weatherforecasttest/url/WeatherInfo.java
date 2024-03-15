package org.vladislava_g.weatherforecasttest.url;

public record WeatherInfo(float lat, float lon, float temp, float feelsLike, float pressure, String icon, String name) {

}
