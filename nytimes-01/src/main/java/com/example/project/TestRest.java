package com.example.project;

import java.net.HttpURLConnection;
import java.net.URL;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

/*import org.springframework.http.HttpStatus;

import com.example.project.News;*/

public class TestRest {
    
    public static void main(String...strings) throws Exception{

        
        //News news = new News();
        
        URL url = new URL("https://api.nytimes.com/svc/topstories/v2/home.json?api-key=K8o2eWhFRJ6GHKcJQeU0W1555wUKTba2");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int statusCode = connection.getResponseCode();
        System.out.println(statusCode);
        if (statusCode != 200) {
            throw new Exception("NYT responded with:" + statusCode);
        }
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println("Line :::: " + line);
            stringBuilder.append(line+"\n");
        }*/
        String message = connection.getResponseMessage();
        System.out.println(message);
        
        JsonReader reader = Json.createReader(connection.getInputStream());
        JsonObject jsonObj = reader.readObject();
        
        JsonArray jsonArray = jsonObj.getJsonArray("results");
        
        for (int i = 0; i < jsonArray.size(); i++) {
            JsonObject arrayElemObj = jsonArray.getJsonObject(i);
            String title = arrayElemObj.get("title").toString();
            String section = arrayElemObj.get("section").toString();
            System.out.println("Title ::" + title);
            System.out.println("Section ::" + section);
        }
    }
}
