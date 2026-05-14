import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import resources.ProjectConfig;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);


    }
}
