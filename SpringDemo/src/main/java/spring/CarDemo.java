package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.CarConfig;

public class CarDemo {
    public static void main(String[] args) {
        ApplicationContext factory=new AnnotationConfigApplicationContext(CarConfig.class);
        System.out.println("Car name:Swift");
        Tyre tyre=factory.getBean(Tyre.class);
        tyre.display();
        Engine engine=factory.getBean(Engine.class);
        engine.display();
        MusicSystem ms=factory.getBean(MusicSystem.class);
        ms.display();
    }
}
