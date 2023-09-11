package com.example.createendpoint.controllers;

import com.example.createendpoint.data.models.Requirements;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @RequestMapping(value = JsonAutoDetect.Value/"api",method = RequestMethod.GET)
    public ResponseEntity<Requirements> getUserInfomation(
            @RequestParam String slackName,
            @RequestParam String track
    ){
     return new ResponseEntity<>( new Requirements(), HttpStatus.OK);
    }


}
