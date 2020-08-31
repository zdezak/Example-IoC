package org.zd.IoC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.zd.IoC")
@PropertySource("classpath:musicPlayer.properties")
public class Config {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return RockMusic.getRockMusic();
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(rockMusic(),classicalMusic());
    }
    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
