package org.zd.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Music music = context.getBean("classicalMusic",Music.class);
        Music music2 = context.getBean("rockMusic",Music.class);
        MusicPlayer player = new MusicPlayer(music);
        MusicPlayer player2 = new MusicPlayer(music2);
        player.playMusic();
        player2.playMusic();

        context.close();
    }
}
