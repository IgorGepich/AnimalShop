package ua.hillel.petshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.*;
import java.time.temporal.ChronoUnit;

@Configuration
public class AppConfig {

    Instant kharkivTime = Instant.now().plus(2L, ChronoUnit.HOURS);

    ZonedDateTime dateKievTimeZone = ZonedDateTime.now(ZoneId.of("Europe/Kiev"));

    private final String appName = "Pet Shop";

    private final String appAuthor = "Ihor Sutulov";

    @Bean
    public Instant kharkivTime(){
        return kharkivTime;
    }

    @Bean
    public ZonedDateTime dateKievTimeZone(){
        return dateKievTimeZone;
    }

    @Bean
    public String programName(){
        return "Application name: " + appName;
    }

    @Bean
    public String applicationAuthor(){
        return "Application author: " + appAuthor;
    }
}
