package demo;

import org.springframework.stereotype.Component;

@Component
public class Teacher implements Staff {

    public void giveLesson() {
        System.out.println("Giving a lesson");
    }

}
