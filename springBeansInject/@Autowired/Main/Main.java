package spingBoot.springBeansInject.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spingBoot.springBeans.main.Parrot;
import spingBoot.springBeansInject.Beans.Person;
import spingBoot.springBeansInject.Config.Config;

public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(Config.class);

        Person person=context.getBean(Person.class);
        Parrot parrot=context.getBean(Parrot.class);
        System.out.println(person);
        System.out.println(parrot);

    }
}
