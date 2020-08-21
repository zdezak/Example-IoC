package org.zd.IoC;

public class MusicPlayer {
    private Music music;
    public MusicPlayer(){
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("playing: "+music.getSong());
    }
}
