package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> music = new ArrayList<>();

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


    public void setMusic(List<Music> music) {
        this.music = music;
    }
    public MusicPlayer(){}
    //This is IoC
    public  MusicPlayer(List<Music> music){
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Player: "  + this.getName() + " volume: " + this.getVolume());
        for (int i = 0; i < music.size(); i++) {
            System.out.println(music.get(i).getSong());
        }
    }
}
