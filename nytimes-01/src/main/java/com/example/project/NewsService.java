package com.example.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 Create a Spring Boot Project to consume a public API for NY Times to display the Top Stories at the moment. 



Use API available in http://developer.nytimes.com/. 



Note: You will have to generate an API key for authentication. 


 * @author shashasr
 *
 */

@Service
public class NewsService {
    
    @Autowired
    NewsController newsController;

    public News getTopStories() {
        News news = null;
        try {
            news = newsController.getNews();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return news;
    }
}
