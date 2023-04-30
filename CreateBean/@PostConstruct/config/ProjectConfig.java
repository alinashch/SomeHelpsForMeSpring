package spingBoot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import spingBoot.main.Parrot;

@Configuration
@ComponentScan(basePackages = "spingBoot.main")
public class ProjectConfig {



}
