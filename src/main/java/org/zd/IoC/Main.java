package org.zd.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer firstPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        MusicPlayer secondPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        boolean comparison = firstPlayer == secondPlayer;
        firstPlayer.setVolume(10);
        System.out.println(firstPlayer.getVolume());
        System.out.println(secondPlayer.getVolume());
        System.out.println(comparison);
        System.out.println(firstPlayer);
        System.out.println(secondPlayer);
        firstPlayer.playMusic();

        context.close();
    }
}
