package spingBoot.springLifeCycleBeans.Prototype.by_beans;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration

public class Config {
    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public  CommentService commentService(){
        return  new CommentService();
    }
}
