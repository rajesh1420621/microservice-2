package com.pxp.microservice2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldController {

    @RequestMapping(value = "world", method = RequestMethod.GET)
    public String world(){
        return "World";
    }
}
