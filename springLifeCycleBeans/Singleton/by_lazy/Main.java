package spingBoot.springLifeCycleBeans.Singleton.by_lazy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(Config.class);
       CommentService commentService =context.getBean(CommentService.class);

    }
}
