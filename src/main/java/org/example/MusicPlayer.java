package org.example;

public class MusicPlayer {
    private Music music;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private String name;
    private int volume;


    public void setMusic(Music music) {
        this.music = music;
    }
    public MusicPlayer(){}
    //This is IoC
    public  MusicPlayer(Music music){
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing: " + music.getSong() + " \nPlayer name: " + this.getName() + ", volume: " + this.getVolume());
    }
}
