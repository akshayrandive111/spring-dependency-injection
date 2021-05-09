import com.java.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService speakerService1 = applicationContext.getBean("speakerService", SpeakerService.class);
        System.out.println("First Name is " + speakerService1.getAllSpeakers().get(0).getFirstName());

        System.out.println(speakerService1);
        SpeakerService speakerService2 = applicationContext.getBean("speakerService", SpeakerService.class);
        System.out.println(speakerService2);
    }
}
