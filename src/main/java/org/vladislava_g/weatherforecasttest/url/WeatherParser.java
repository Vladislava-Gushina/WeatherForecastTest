package org.vladislava_g.weatherforecasttest.url;
import org.json.JSONArray;
import org.json.JSONObject;

public class WeatherParser {
    public static void parseJSON(String jsonString) {
        JSONObject jsonObject = new JSONObject(jsonString);
        JSONObject coordJSONObject = jsonObject.getJSONObject("coord");

        float lat = coordJSONObject.getFloat("lat");
        float lon = coordJSONObject.getFloat("lon");
        System.out.println(jsonString);

        JSONObject mainJsonObject = jsonObject.getJSONObject("main");

        float temp = mainJsonObject.getFloat("temp");
        float feelLike = mainJsonObject.getFloat("feelLoke");
        float pressure = mainJsonObject.getFloat("pressure");

        JSONArray weatherJSONArray = jsonObject.getJSONArray("weather");
        JSONObject weatherJSONObject = weatherJSONArray.getJSONObject(0);

        String name = weatherJSONObject.getString("name");
        String icon = weatherJSONObject.getString("icon");

    }



}
