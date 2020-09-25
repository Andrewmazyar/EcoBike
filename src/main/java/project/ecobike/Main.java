package project.ecobike;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import project.ecobike.config.AppConfig;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        ConsoleHandler consoleHandler = context.getBean(ConsoleHandler.class);
        consoleHandler.start();
    }
}
