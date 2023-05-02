package spingBoot.springLifeCycleBeans.Singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "spingBoot.springLifeCycleBeans.Singleton")

public class Config {
    @Bean
    public  CommentService commentService(){
        return  new CommentService();
    }

}
