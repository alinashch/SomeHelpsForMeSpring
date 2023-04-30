package spingBoot.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spingBoot.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
      

        Cat cat=context.getBean(Cat.class);
        System.out.println(cat.toString());

    }
}
