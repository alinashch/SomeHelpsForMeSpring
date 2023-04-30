package spingBoot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spingBoot.main.Parrot;

@Configuration
public class ProjectConfig {
    @Bean
    Parrot parrot(){
        var parrot=new Parrot();
        parrot.setName("koko");
        return parrot;
    }

    @Bean
    Parrot parrot2(){
        var parrot=new Parrot();
        parrot.setName("Mikky");
        return parrot;
    }

    @Bean(name="Ivan")
    Parrot parrot3(){
        var parrot=new Parrot();
        parrot.setName("koko");
        return parrot;
    }
    @Bean(value="IvanV")
    Parrot parrot4(){
        var parrot=new Parrot();
        parrot.setName("Jack");
        return parrot;
    }
}
