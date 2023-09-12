package com.example.createendpoint.mapper;

import com.example.createendpoint.data.models.Slack;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Mapper {

    public static Slack map(String slack_name, String track){
        Slack slack = new Slack();
        slack.setSlack_name(slack_name);
        slack.setTrack(track);
        slack.setStatus_code(200);
        slack.setGithub_file_url("https://github.com/Tjoseph-O/endpoint_project/blob/main/src/main/java/com/example/createendpoint/controllers/Controller.java");
        slack.setGithub_repo_url("https://github.com/Tjoseph-O/endpoint_project");
        slack.setCurrent_day(getDay());
        slack.setUtc_time(getUtcTime());
        return slack;
    }
    private static String getDay(){
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        DateFormat formatter = new SimpleDateFormat("EEEE");
        return formatter.format(date);
    }
    private static String getUtcTime(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        return formatter.format(date);
    }

}
