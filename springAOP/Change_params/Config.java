package spingBoot.springAOP.Change_params;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "spingBoot.springAOP.Change_params")
@EnableAspectJAutoProxy
public class Config {
    @Bean
    public LoginAspect aspect(){
        return  new LoginAspect();
    }
}
