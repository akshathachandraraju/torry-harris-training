package spring;

import org.springframework.stereotype.Component;

@Component
public class JBLSpeaker implements Speaker {
    @Override
    public void speaker() {
        System.out.println("Speaker is JBL");
    }
}
