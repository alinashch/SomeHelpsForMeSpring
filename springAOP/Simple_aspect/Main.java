package spingBoot.springAOP.Simple_aspect;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(Config.class);
        Comment comment=context.getBean(Comment.class);
        comment.setAuthor("Koko");
        comment.setText("dcasd");
        CommentService service=context.getBean(CommentService.class);
        service.pushCommnet(comment);
    }
}
