package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "spring")
public class CarConfig {
    /*
    @Bean
    public spring.Tyre getTyre() {
        return new spring.Tyre();
    }

    @Bean
    public spring.Engine getEngine() {
        return new spring.Engine();
    }

    @Bean
    public spring.MusicSystem getMusicSystem() {
        return new spring.MusicSystem();
    }

    @Bean
    public spring.Speaker getSpeaker() {
        return new spring.JBLSpeaker();

    }*/
}