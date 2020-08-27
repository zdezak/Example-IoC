package org.zd.IoC;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
    private RockMusic(){

    }
    public static RockMusic getRockMusic(){
        return new RockMusic();
    }
    @Override
    public String getSong() {
        return "Wind Cries Mary";
    }
}
