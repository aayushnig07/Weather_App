package com.aayush.weatherApp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.Gson;

public class App 
{	
	private static final String WEATHER_API_ID = "Enter you api id here";	
	static BufferedReader br;
	
    public static void main( String[] args )
    {
    	String jsonData = openUrl("delhi");
//    	System.out.println(jsonData);
    	parseJson(jsonData);
    }
    
    public static String parseJson(String jsonData) {
    	
    	Gson gson=new Gson();
    	beans.WeatherData json = gson.fromJson(jsonData,beans.WeatherData.class);
    	String jsonStringdata = gson.toJson(json);
    	return jsonStringdata;
    }
    
    public static String openUrl(String cityNameOrID) {
    	try {
    		URL weatherApiUrl = new URL("http://api.openweathermap.org/data/2.5/weather?q="+cityNameOrID+"&appid="+WEATHER_API_ID);
        	URLConnection urlConnection=weatherApiUrl.openConnection(); 
        	 HttpURLConnection connection = null;
             if(urlConnection instanceof HttpURLConnection) {
                connection = (HttpURLConnection) urlConnection;
             }else {
                System.out.println("Please enter an HTTP URL.");
             }
        	br=new BufferedReader(new InputStreamReader(connection.getInputStream()));
        	return br.readLine();
    	}catch(Exception e) {e.printStackTrace();}
    	return null;
    }
}
