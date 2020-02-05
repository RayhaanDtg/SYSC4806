package App;

import
        org.springframework.context.support.ClassPathXmlApplicationContext;


public class Launcher {
    public void launch() {
        String[] contextPaths = new String[] {"config.xml"};
        new ClassPathXmlApplicationContext(contextPaths);
    }
}