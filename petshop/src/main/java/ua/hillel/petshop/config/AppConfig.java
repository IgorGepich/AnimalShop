package ua.hillel.petshop.config;

import lombok.Getter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.*;

@Configuration
public class AppConfig {

    Clock clock = Clock.system(ZoneId.of("Europe/Kiev"));

    @Getter
    private String appName = "Pet Shop";

    @Getter
    private String appAuthor = "Ihor Sutulov";

    @Bean
    public void dateKievTimeZone(){
        System.out.println(LocalDateTime.ofInstant(clock.instant(), ZoneId.of("Europe/Kiev")));
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
