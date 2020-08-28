package org.zd.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer player;
    @Autowired
    public Computer (MusicPlayer player){
        this.id = 1;
        this.player =player;
    }
    public void play (){
        player.playMusic(MusicPlayer.musicEnum.CLASSICAL);
        player.playMusic(MusicPlayer.musicEnum.BLUES);
    }
}
