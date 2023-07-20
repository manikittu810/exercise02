package practiceExercise02.SpringPracticeExercise02.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
@Configuration
@ComponentScan
public class BusinessApp {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(BusinessApp.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessLogic.class).findMax());
        }
    }
}
