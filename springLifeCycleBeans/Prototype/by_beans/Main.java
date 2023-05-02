package spingBoot.springLifeCycleBeans.Prototype.by_beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(Config.class);
        CommentService commentService1=context.getBean(CommentService.class);
        CommentService commentService2=context.getBean(CommentService.class);
        System.out.println(commentService2);
        System.out.println(commentService1);

    }
}
