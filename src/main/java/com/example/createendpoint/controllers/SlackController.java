package com.example.createendpoint.controllers;

import com.example.createendpoint.data.models.Slack;
import com.example.createendpoint.services.ServicePoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SlackController {
    private ServicePoint servicePoint;

    public SlackController(ServicePoint servicePoint) {
        this.servicePoint = servicePoint;

    }


    @RequestMapping(value = "/api", method = RequestMethod.GET)
    public ResponseEntity<Slack> endPoint(@RequestParam String slack_name, @RequestParam String track){
        Slack slack = servicePoint.getJson(slack_name, track);
        return new ResponseEntity<>(slack, HttpStatus.OK);
    }


}
