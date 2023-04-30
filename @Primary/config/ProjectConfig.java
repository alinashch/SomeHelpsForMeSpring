package spingBoot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import spingBoot.main.Parrot;

@Configuration
public class ProjectConfig {
    @Bean
    @Primary
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


}
