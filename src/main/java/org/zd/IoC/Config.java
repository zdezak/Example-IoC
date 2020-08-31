package org.zd.IoC;


import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;


public class Config {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public BluesMusic bluesMusic(){
        return new BluesMusic();
    }
    @Bean
    public List<Music> list(){

        return  Arrays.asList(classicalMusic(),rockMusic(),bluesMusic());
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(list());

    }
}
