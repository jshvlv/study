package org.example;

import org.springframework.stereotype.Component;

@Component
public class RockMusic  implements Music{
    private String[] songs = {"KISH - Men eated the meat", "KISH - Gorbun", " KISH - The Bear"};
    @Override
    public String[] getSong() {
        return songs;
    }
}
