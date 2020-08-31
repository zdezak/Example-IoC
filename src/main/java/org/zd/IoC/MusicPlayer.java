package org.zd.IoC;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private List<Music> music;

    public MusicPlayer(List<Music> music){
        this.music = music;
    }

    public void playMusicList(){
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        System.out.println("playing: " + music.get(randomNumber).getSong());
    }
}
