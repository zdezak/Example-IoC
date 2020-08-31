package org.zd.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private Music music1;
    private Music music2;
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1
            ,@Qualifier("classicalMusic")Music music2){
        this.music2 =music2;
        this.music1 = music1;
    }

    public String playMusic(){
        return "playing: "+music1.getSong()
                +". Next "+ music2.getSong();
    }
}
