public class MusicSystem {
    private String name;
    private boolean soundwoofer;
    private int noofspeakers;
    private int LCDsize;

    public MusicSystem(String name, boolean soundwoofer, int LCDsize,int noofspeakers) {
        this.name = name;
        this.soundwoofer = soundwoofer;
        this.LCDsize = LCDsize;
        this.noofspeakers=noofspeakers;
    }

    public int getNoofspeakers() {
        return noofspeakers;
    }

    public void setNoofspeakers(int noofspeakers) {
        this.noofspeakers = noofspeakers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSoundwoofer() {
        return soundwoofer;
    }

    public void setSoundwoofer(boolean soundwoofer) {
        this.soundwoofer = soundwoofer;
    }

    public int getLCDsize() {
        return LCDsize;
    }

    public void setLCDsize(int LCDsize) {
        this.LCDsize = LCDsize;
    }
}
