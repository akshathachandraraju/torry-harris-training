public class BoxDemo {
    public static void main(String[] args) {
        Box b1=new Box(10,20,30);
       // b1.initialize(1,2,3);
        b1.display();
        Box b2=b1;
        System.out.println("volume:"+b1.getVolume());
        b1.setH(b1.getH()*110/100);
        b1.setL(b1.getL()*120/100);
        b1.setW(b1.getW()*130/100);
        b1.display();
    }
}
