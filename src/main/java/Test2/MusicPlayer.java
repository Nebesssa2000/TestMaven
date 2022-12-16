package Test2;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import test.ClassicalMusic;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Component
public class MusicPlayer {
    ClassicalMusic2 classicalMusic2;
    RockMusic2 rockMusic2;

    @Autowired
    public MusicPlayer(ClassicalMusic2 classicalMusic2, RockMusic2 rockMusic2) {
        this.classicalMusic2 = classicalMusic2;
        this.rockMusic2 = rockMusic2;
    }

    public String playMusic() {
        return "Playing: " + getClassicalMusic2().getSong();
    }
}
