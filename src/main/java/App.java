import config.ProjectConfig;
import model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);


        Person person = context.getBean(Person.class);

        System.out.println(person.toString());
    }
}
