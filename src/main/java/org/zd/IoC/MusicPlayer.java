package org.zd.IoC;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    public MusicPlayer(Music music){
        this.music = music;
    }

    public void setMusic(Music music) {
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

    public void playMusic(){
        System.out.println("playing: "+music.getSong());
    }
}
