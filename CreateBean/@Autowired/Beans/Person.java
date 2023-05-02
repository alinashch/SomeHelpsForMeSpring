package spingBoot.springBeansInject.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import spingBoot.springBeans.main.Parrot;

public class Person {
    private String name;
    @Autowired
    private Parrot parrot;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", parrot=" + parrot.getName() +
                '}';
    }
}
