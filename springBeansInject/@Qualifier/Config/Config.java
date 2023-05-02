package spingBoot.springBeansInject.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import spingBoot.springBeans.main.Parrot;
import spingBoot.springBeansInject.Beans.Person;

@Configuration
@ComponentScan(basePackages = "spingBoot.springBeansInject.Beans")
public class Config {

    @Bean
    Parrot parrot(){
        Parrot parrot=new Parrot();
        parrot.setName("Mikky");
        return parrot;
    }
    @Bean
    Parrot parrot1(){
        Parrot parrot=new Parrot();
        parrot.setName("koko");
        return parrot;
    }

    @Bean
    Person person(){
        Person person=new Person(parrot1());
        person.setName("Ivan");
        return person;
    }
}
