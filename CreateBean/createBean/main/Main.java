package spingBoot.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spingBoot.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrot=context.getBean("parrot2", Parrot.class);
        System.out.println(parrot.getName());

         parrot=context.getBean("Ivan", Parrot.class);
        System.out.println(parrot.getName());


         parrot=context.getBean("IvanV", Parrot.class);
        System.out.println(parrot.getName());
    }
}
