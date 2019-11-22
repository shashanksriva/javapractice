package com.example.project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {


    
        public  News getNews() throws Exception{
            
            News news = new News();
            
            URL url = new URL("https://api.nytimes.com/svc/topstories/v2/home.json?api-key=K8o2eWhFRJ6GHKcJQeU0W1555wUKTba2");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int statusCode = connection.getResponseCode();
            String message = connection.getResponseMessage();
            System.out.println("Message Received :::: " +message);
            if (statusCode != HttpStatus.OK.value()) {
                throw new Exception("NYT responded with:" + statusCode);
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line+"\n");
            }
            JSONObject jsonObj = new JSONObject(stringBuilder.toString());
            
            JSONArray resultsArray = jsonObj.getJSONArray("results");
            
            bufferedReader.close();
            return news;
        }
        
}
