package spring1;

import org.springframework.stereotype.Component;
@Component
public class RAM {
    public RAM() {
    }

    public void display(){
        System.out.println("spring1.RAM: Company is SanDisk,Capacity:8GB");
    }
}
