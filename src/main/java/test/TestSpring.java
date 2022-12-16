package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

//        TestBean testBean = context.getBean("testBean", TestBean.class);
//        Music music = context.getBean("musicBean", Music.class);
//        Music music1 = context.getBean("musicBean1", Music.class);
//        Music music2 = context.getBean("musicBean2", Music.class);
//
//        System.out.println(testBean.getName());
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
//        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
        MusicPlayer musicPlayer3 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer6 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer4 = context.getBean("musicPlayer1", MusicPlayer.class);
        MusicPlayer musicPlayer7 = context.getBean("musicPlayer1", MusicPlayer.class);
        MusicPlayer musicPlayer5 = context.getBean("musicPlayer2", MusicPlayer.class);

        boolean comparation = musicPlayer3 == musicPlayer6;
        boolean comparation1 = musicPlayer3.equals( musicPlayer6);

        System.out.println(comparation);
        System.out.println(comparation1);
        System.out.println(musicPlayer3);
        System.out.println(musicPlayer6);
        musicPlayer7.setVolume(20);
//        musicPlayer.playMusic();
//        musicPlayer1.playMusic();
//        musicPlayer2.playMusic();
        musicPlayer3.playMusic();
        musicPlayer4.playMusic();
        musicPlayer5.playMusicList();
        System.out.println(musicPlayer4.getName());
        System.out.println(musicPlayer4.getVolume());
        System.out.println(musicPlayer7.getVolume());

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

        context.close();
    }
}
