package demo;

import org.springframework.stereotype.Component;

@Component
public class Tutor implements Staff {
    public void giveLesson() {
        System.out.println("Giving a tutorial");
    }
}
