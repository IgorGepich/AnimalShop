package ua.hillel.petshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.*;
import java.time.temporal.ChronoUnit;

@Configuration
public class AppConfig {

    Clock clock = Clock.system(ZoneId.of("Europe/Kiev"));

    Instant kharkivTime = Instant.now().plus(2L, ChronoUnit.HOURS);

    private final String appName = "Pet Shop";

    private final String appAuthor = "Ihor Sutulov";

    public Clock getClock() {
        return clock;
    }

    public Instant getKharkivTime() {
        return kharkivTime;
    }

    public String getAppName() {
        return appName;
    }

    public String getAppAuthor() {
        return appAuthor;
    }

    @Bean
    public Instant kharkivTime(){
        return getKharkivTime();
    }

    @Bean
    public void dateKievTimeZone(){
        LocalDateTime.ofInstant(getClock().instant(), ZoneId.of("Europe/Kiev"));
    }

    @Bean
    public String programName(){
        return "Application name: " + getAppName();
    }

    @Bean
    public String applicationAuthor(){
        return "Application author: " + getAppAuthor();
    }
}
