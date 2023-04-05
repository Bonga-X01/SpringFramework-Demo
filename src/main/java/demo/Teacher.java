package demo;

public class Teacher implements Staff {

    private String subject;

    public Teacher(String subject) {
        this.subject = subject;
    }

    public void giveLesson() {
        System.out.println("Giving a "+ subject +" lesson");
    }

}
