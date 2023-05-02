package spingBoot.springAOP.Change_params_with_annotation;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;
@Service
public class CommentService {
    private Logger logger= Logger.getLogger(CommentService.class.getName());

    public String pushCommnet(Comment comment){
        logger.info("publish comment "+comment.getText());
        return "Successful";
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }


    @ToLog
    public  void deleteComment(Comment comment){
        logger.info("Delete "+ comment.getText());
    }
}
