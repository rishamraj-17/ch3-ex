import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig{
    @Bean
    public Parrot parrot(){
        Parrot parrot = new Parrot();
        parrot.setName("koko");
        return parrot;
    }

    @Bean
    public Person person(){
        Person person = new Person();
        person.setName("Nimita");
        return person;
    }
}