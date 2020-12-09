package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Random;

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

    private Music music;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2){
        this.music = music1;
        this.music2 = music2;
    }



    public String playMusic(Genres genres){
        int rand = (int) (Math.random() * (3+1) -1);
        String res = "";
        if(genres == Genres.ROCK) {
            res  = "Playing " +  music.getSong()[rand].toString();
        } else
            res  = "Playing " +  music2.getSong()[rand].toString();
        return res;
    }
}
