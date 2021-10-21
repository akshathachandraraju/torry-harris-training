package spring1;

import org.springframework.stereotype.Component;

@Component
public class IntelProcessor implements Processor {

    @Override
    public void process() {
        System.out.println("Intel Processor:i7,11th Gen,Octa Core 3GHz");
    }
}
