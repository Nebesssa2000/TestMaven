package Test2;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MusicPlayer2 {
    Music2 music;
    String name;
    int volume;
    List<Music2> musicList = new ArrayList<>();


    public MusicPlayer2(@Qualifier("musicBean ") Music2 music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }

    public void playMusicList(){
        for (Music2 music1 : musicList) {
            System.out.println("Playing: " + music1.getSong());
        }
    }
}
