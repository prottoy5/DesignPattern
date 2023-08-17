
public class InheritanceTest {
    
    public static void main(String[] args) {

        Doctor doc = new Doctor();
        Singer singer = new Singer();
        Teacher teacher = new Teacher();

        doc.howToLoseFat();
        singer.singASong();
        teacher.givesUsALesson();

        doc.eat();
        singer.sleep();
        teacher.swim();
    }

}



