package com.example.createendpoint.services;

import com.example.createendpoint.data.models.Slack;
import org.springframework.stereotype.Service;

import static com.example.createendpoint.mapper.Mapper.map;
@Service
public class ServicePoint {
    public Slack getJson(String slackName, String track){
        return map(slackName, track);
    }
}
