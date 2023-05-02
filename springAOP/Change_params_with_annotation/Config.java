package spingBoot.springAOP.Change_params_with_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "spingBoot.springAOP.Change_params_with_annotation")
@EnableAspectJAutoProxy
public class Config {
    @Bean
    public LoginAspect aspect(){
        return  new LoginAspect();
    }
}
