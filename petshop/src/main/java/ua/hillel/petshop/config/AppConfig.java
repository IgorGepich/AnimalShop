package ua.hillel.petshop.config;

import lombok.Getter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.*;
import java.time.temporal.ChronoUnit;

@Configuration
public class AppConfig {

    Clock clock = Clock.system(ZoneId.of("Europe/Kiev"));
    Instant kharkivTime = Instant.now().plus(2L, ChronoUnit.HOURS);

    @Getter
    private String appName = "Pet Shop";

    @Getter
    private String appAuthor = "Ihor Sutulov";

    @Bean
    public Instant getKharkivTime(){
        return kharkivTime;
    }

    @Bean
    public void dateKievTimeZone(){
        LocalDateTime.ofInstant(clock.instant(), ZoneId.of("Europe/Kiev"));
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
