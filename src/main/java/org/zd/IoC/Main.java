package org.zd.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Computer computer = context.getBean("computer", Computer.class);
        computer.play();
        context.close();
    }
}
