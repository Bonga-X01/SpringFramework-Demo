package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");

        Staff teacher = context.getBean(Teacher.class);
        teacher.giveLesson();
        Staff tutor = context.getBean(Tutor.class);
        tutor.giveLesson();
    }
}
