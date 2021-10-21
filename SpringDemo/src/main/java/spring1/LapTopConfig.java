package spring1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring1.HardDrive;
import spring1.IntelProcessor;

@Configuration
@ComponentScan(basePackages = "spring1")
public class LapTopConfig {
    /*
    @Bean
    public HardDrive getHardDrive(){
        return new HardDrive();
    }
    @Bean
    public RAM getRAM(){
        return new RAM();
    }
    @Bean
    public MotherBoard getMotherBoard(){
        return new MotherBoard();
    }
    @Bean
    public Processor getProcessor(){
        return new IntelProcessor();
    }*/
}
