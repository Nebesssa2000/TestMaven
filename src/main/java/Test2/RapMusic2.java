package Test2;

import org.springframework.stereotype.Component;

@Component("musicBean3")
public class RapMusic2 implements Music2 {
    @Override
    public String getSong() {
        return "Рэпчик";
    }
}
