package spingBoot.springAOP.Change_params_with_annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {
    private static final Logger logger= Logger.getLogger(Main.class.getName());


    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(Config.class);

        CommentService service=context.getBean(CommentService.class);

        Comment comment=new Comment();
        comment.setAuthor("Kokok");
        comment.setText("cdscsdcds");
        String val= service.pushCommnet(comment);

        logger.info(val);
    }
}
