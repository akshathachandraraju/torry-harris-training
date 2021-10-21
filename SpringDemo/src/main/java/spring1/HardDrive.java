package spring1;

import org.springframework.stereotype.Component;

@Component
public class HardDrive {
    public HardDrive() {
    }

    public void display(){
        System.out.println("Hard Disk: \nType-Magnetic\nSize-1TB");
    }
}
