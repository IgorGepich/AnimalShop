package ua.hillel.petshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.*;
import java.time.temporal.ChronoUnit;

@Configuration
public class AppConfig {

    Instant kharkivTime;

    ZonedDateTime dateKievTimeZone;

    @Bean
    public Instant kharkivTime(){
        Instant.now().plus(2L, ChronoUnit.HOURS);
        return kharkivTime;
    }

    @Bean
    public ZonedDateTime dateKievTimeZone(){
        ZonedDateTime.now(ZoneId.of("Europe/Kiev"));
        return dateKievTimeZone;
    }

    @Bean
    public String programName(){
        String appName = "Pet Shop";
        return "Application name: " + appName;
    }

    @Bean
    public String applicationAuthor(){
        String appAuthor = "Ihor Sutulov";
        return "Application author: " + appAuthor;
    }
}
