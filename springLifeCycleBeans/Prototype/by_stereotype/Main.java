package spingBoot.springLifeCycleBeans.Prototype.by_stereotype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(Config.class);
        CommentService commentService=context.getBean(CommentService.class);
        System.out.println(commentService.hashCode());

        CommentService commentService2=context.getBean(CommentService.class);
        System.out.println(commentService2.hashCode());
    }
}
