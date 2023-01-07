package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j

@CrossOrigin
public class HealthyCheckController {

    @GetMapping("/")
    public String check() {
        log.info("server is running...");
        return "server is running....";

        }

        @GetMapping("/checkhello")
        public String checkHello() {
            log.info("check Hello");
            return "check Hello has return";
    }
}