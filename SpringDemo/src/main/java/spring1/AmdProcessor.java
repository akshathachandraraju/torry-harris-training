package spring1;

import org.springframework.stereotype.Component;

@Component
public class AmdProcessor implements Processor {

    @Override
    public void process() {
        System.out.println("AMD Processor");
    }
}
