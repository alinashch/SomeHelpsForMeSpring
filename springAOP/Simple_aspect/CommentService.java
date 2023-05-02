package spingBoot.springAOP.Simple_aspect;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;
@Service
public class CommentService {
    private Logger logger= Logger.getLogger(CommentService.class.getName());

    public void pushCommnet(Comment comment){
        logger.info("publish comment "+comment.getText());
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
