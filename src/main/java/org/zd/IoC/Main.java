package org.zd.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer player = context.getBean("musicPlayer",MusicPlayer.class);
        player.playMusic();
        System.out.println(player.getName());
        System.out.println(player.getVolume());
        context.close();
    }
}
