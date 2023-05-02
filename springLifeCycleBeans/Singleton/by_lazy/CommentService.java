package spingBoot.springLifeCycleBeans.Singleton.by_lazy;

import jdk.jfr.Label;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class CommentService {
    public CommentService() {
        System.out.println("Create");
    }
}
