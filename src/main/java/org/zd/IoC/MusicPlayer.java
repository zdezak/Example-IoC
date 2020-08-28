package org.zd.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic music;
    private RockMusic music2;
    @Autowired
    public MusicPlayer(ClassicalMusic music, RockMusic music2){
        this.music =music;
        this.music2 = music2;
    }

    public String playMusic(){
        return "playing: "+music.getSong();
    }
}
