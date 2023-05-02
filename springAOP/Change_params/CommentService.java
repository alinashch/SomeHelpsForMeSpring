package spingBoot.springAOP.Change_params;

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
}
