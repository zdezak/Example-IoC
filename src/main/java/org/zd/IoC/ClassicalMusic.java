package org.zd.IoC;

import org.springframework.stereotype.Component;

@Component("musicBean")
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "hungarian rhapsody ";
    }
}
