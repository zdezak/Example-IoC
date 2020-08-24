package org.zd.IoC;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MusicPlayer {
    private List<Music> music = new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer(){
    }

    public void setMusic(List<Music> music) {
        this.music = music;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int valume) {
        this.volume = valume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusicList(){
        for (Music element: music) {
            System.out.println("playing: " + element.getSong());
        }
    }
}
