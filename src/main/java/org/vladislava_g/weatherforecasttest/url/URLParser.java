package org.vladislava_g.weatherforecasttest.url;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLParser {
    public static String parseURL(String urlString){
        try {
            URL url = new URL(urlString);
            URLConnection urlConnection = url.openConnection();
            Scanner scanner = new Scanner(urlConnection.getInputStream());
            StringBuilder stringBuilder = new StringBuilder();
            while (scanner.hasNext()){
                stringBuilder.append(scanner.nextLine()).append("\n");
            }
            return stringBuilder.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
