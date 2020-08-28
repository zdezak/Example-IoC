package org.zd.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private Music blues;
    private Music classic;
    @Autowired
    public MusicPlayer(@Qualifier("bluesMusic") Music blues,
                       @Qualifier("classicalMusic")Music classic){
        this.blues = blues;
        this.classic = classic;
    }

    public enum musicEnum{
        BLUES,CLASSICAL;
    }

    public void playMusic(musicEnum musicEnum){
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        switch (musicEnum){
            case CLASSICAL:
                System.out.println(classic.getSong().get(randomNumber));
                break;
            case BLUES:
                System.out.println(blues.getSong().get(randomNumber));
                break;
        }
    }
}
