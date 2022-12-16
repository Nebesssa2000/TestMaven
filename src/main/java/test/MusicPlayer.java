package test;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MusicPlayer {
    Music music;
    String name;
    int volume;
    List<Music> musicList = new ArrayList<>();

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }

    public void playMusicList(){
        for (Music music1 : musicList) {
            System.out.println("Playing: " + music1.getSong());
        }
    }
}
