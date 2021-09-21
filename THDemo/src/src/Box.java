public class Box {
    private int l;
    private int w;
    private int h;
    /*constructor*/
    public Box()
    {
    System.out.println("Inside box constructor");
    }
    public  Box(int l,int w,int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    public int getH() {
        return h;
    }

    public int getL() {
        return l;
    }

    public int getW() {
        return w;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setL(int l) {
        this.l = l;
    }

    public void setW(int w) {
        this.w = w;
    }
/*
    public void initialize(int le, int wi, int he){
        l=le;
        w=wi;
        h=he;
    }
*/
    public void display()
    {
        System.out.print("length:"+l+"\n"+"width:"+w+"\n"+"height:"+h+"\n");
    }
    public int getVolume(){
        return l*w*h;

    }
}
 /*class Test{
    public static void main(String[] args) {
        Box b=new Box();
        b.initialize(2,3,4);
        b.display();
        b.getVolume();
    }
}
*/