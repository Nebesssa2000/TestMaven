package Test2;

import org.springframework.stereotype.Component;

@Component("musicBean2")
public class RockMusic2 implements Music2 {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
