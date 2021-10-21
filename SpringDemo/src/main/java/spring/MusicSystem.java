package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicSystem {
    @Autowired
    Speaker sp;

    public Speaker getSp() {
        return sp;
    }

    public void setSp(Speaker sp) {
        this.sp = sp;
    }
    public void display(){
        System.out.println("Music system is Speaker");
        sp.speaker();
    }
}
