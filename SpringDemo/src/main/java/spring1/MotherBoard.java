package spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class MotherBoard {
    @Autowired
    @Qualifier("intelProcessor")
    Processor cpu;

    public Processor getCpu() {
        return cpu;
    }

    public void setCpu(Processor cpu) {
        this.cpu = cpu;
    }

    public void display(){
        System.out.println("Mother Board from ASUS");
        cpu.process();
    }
}
