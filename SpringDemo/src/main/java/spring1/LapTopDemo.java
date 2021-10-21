package spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring1.HardDrive;
import spring1.LapTopConfig;

public class LapTopDemo {
    public static void main(String[] args) {
        ApplicationContext factory=new AnnotationConfigApplicationContext(LapTopConfig.class);

        HardDrive segate= (HardDrive) factory.getBean("hardDrive");
        segate.display();
        RAM ram= (RAM) factory.getBean("RAM");
        ram.display();
        MotherBoard mb= (MotherBoard) factory.getBean("motherBoard");
        mb.display();
    }
}
