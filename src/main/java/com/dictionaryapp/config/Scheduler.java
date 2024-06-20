package com.dictionaryapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Configuration
@EnableScheduling
public class Scheduler {

    @Scheduled(cron = "*/10 * * * * *")
    public void cron() {
        System.out.println(Instant.now());
    }

}
