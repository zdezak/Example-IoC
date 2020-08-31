package org.zd.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Computer {
    private int id;
    private MusicPlayer player;
        public Computer (MusicPlayer player){
        this.id = 1;
        this.player =player;
    }
    @Override
    public String toString (){
        return "Computer "+id+" "+player.playMusic();
    }
}
