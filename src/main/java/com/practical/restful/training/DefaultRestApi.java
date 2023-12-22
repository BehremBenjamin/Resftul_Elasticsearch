package com.practical.restful.training;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping("/api")
public class DefaultRestApi {

    private static final Logger logger = LogManager.getLogger(DefaultRestApi.class);


    @GetMapping("/welcome")
    public String welcome() {

        logger.warn("testing logging color");
        return "WELCOME TO SPRING BOOT !!!";
    }

    @GetMapping("/time")
    public String time(){
        return LocalTime.now().toString();
    }
}
