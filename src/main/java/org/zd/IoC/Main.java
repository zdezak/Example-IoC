package org.zd.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        //Computer computer = context.getBean("computer", Computer.class);
        //System.out.println(computer);
        MusicPlayer player = context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(player.getName());
        System.out.println(player.getVolume());
        ClassicalMusic musicN = context.getBean("classicalMusic",
                                                ClassicalMusic.class);
        ClassicalMusic musicZ = context.getBean("classicalMusic",
                                                ClassicalMusic.class);
        System.out.println(musicN==musicZ);
        context.close();
    }
}
