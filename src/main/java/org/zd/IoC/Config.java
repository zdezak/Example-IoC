package org.zd.IoC;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.zd.IoC")
@PropertySource("classpath:musicPlayer.properties")
public class Config {

}
