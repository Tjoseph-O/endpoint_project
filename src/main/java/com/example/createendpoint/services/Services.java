package com.example.createendpoint.services;

import com.example.createendpoint.data.models.Requirements;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

@Service
public class Services {
    public Requirements giveRes (String slackName, String track){

        Requirements requirement_response = new Requirements();
        requirement_response.setSlackName(slackName);
        requirement_response.setCurrentDay(get_current_day());
        requirement_response.setCurrentTime(getTime());
        requirement_response.setGitHubFileUrl();
        requirement_response.setGitHubRepoUrl();
        requirement_response.setTrack(track);
        requirement_response.setStatusCode(200);

        return requirement_response;
    }

    private static String get_current_day(){
        DayOfWeek currentDay = LocalDateTime.now().getDayOfWeek();
        return currentDay.getDisplayName(TextStyle.FULL, Locale.forLanguageTag("en-Ng"));
    }
    private static String getTime(){
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-DD HH:mm:ss");

        return currentTime.format(formatter);
    }

}
