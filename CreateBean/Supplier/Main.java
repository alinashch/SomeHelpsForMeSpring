package spingBoot.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spingBoot.config.ProjectConfig;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Dog  ourDog=new Dog();
        Supplier<Dog> dogSupplier=()->ourDog;
        context.registerBean("Sharik", Dog.class, dogSupplier, dog -> dog.setPrimary(true));
        Dog dog=context.getBean(Dog.class);
        dog.setVoice("gaw");
        System.out.println(dog.bark());

    }
}
