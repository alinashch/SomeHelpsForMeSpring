package spingBoot.springLifeCycleBeans.Singleton.by_stereotype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(Config.class);
        CommentService commentService=context.getBean(CommentService.class);
        UserService userService=context.getBean(UserService.class);
        System.out.println(commentService.hashCode());
        System.out.println(userService.hashCode());
        if (userService.getCommentService() == commentService.getCommentService()){
            System.out.println(true);
        }
    }
}
