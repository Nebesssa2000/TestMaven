package Test2;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.ClassicalMusic;
import test.MusicPlayer;

import java.util.ArrayList;
import java.util.List;

public class TestSpring2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext2.xml");

//        Music2 music = context.getBean("musicBean", Music2.class);
//        Music2 music2 = context.getBean("musicBean2", Music2.class);
//        Music2 music3 = context.getBean("musicBean3", Music2.class);
//
//        MusicPlayer2 musicPlayer3 = context.getBean("musicPlayer2", MusicPlayer2.class);
//
//        musicPlayer3.playMusic();
//
//        List<Music2> music2List = new ArrayList<>();
//        music2List.add(music);
//        music2List.add(music2);
//        music2List.add(music3);
//
//        musicPlayer3.getMusicList();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }
}
