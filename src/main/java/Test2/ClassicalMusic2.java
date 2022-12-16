package Test2;

import org.springframework.stereotype.Component;
import test.Music;

@Component("musicBean")
public class ClassicalMusic2 implements Music2 {
    private ClassicalMusic2() {

    }

    public void DoMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }


    public static ClassicalMusic2 getClassicalMusic() {
        return new ClassicalMusic2();
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
