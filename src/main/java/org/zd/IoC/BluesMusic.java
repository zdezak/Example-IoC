package org.zd.IoC;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class BluesMusic implements Music {
    ArrayList list = new ArrayList(3);
    @Override
    public ArrayList<String> getSong() {
        list.add("The Thrill Is Gone");
        list.add("Hear Me Talkin' to Ya");
        list.add("Caught Out in the Rain");
        return list;
    }
}
