package org.zd.IoC;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                Config.class
        );
        MusicPlayer player = context.getBean("musicPlayer",MusicPlayer.class);
        player.playMusicList();
        context.close();
    }
}
