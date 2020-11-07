package ua.hillel.petshop.config;

import lombok.Getter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.*;
import java.time.temporal.ChronoUnit;

@Configuration
public class AppConfig {

    @Getter
    Clock clock = Clock.system(ZoneId.of("Europe/Kiev"));

    @Getter
    Instant kharkivTime = Instant.now().plus(2L, ChronoUnit.HOURS);

    @Getter
    private final String appName = "Pet Shop";

    @Getter
    private final String appAuthor = "Ihor Sutulov";

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
