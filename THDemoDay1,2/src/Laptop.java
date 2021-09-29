public class Laptop {
    private int ram;
    private int hdd;
    private String processor;
    private double screensize;
    private String lname;
   /* public void initialize(String ln,int r,int h,String p,double sz){
        lname=ln;
        ram=r;
        hdd=h;
        processor=p;
        screensize=sz;
    }*/
    public int getRam() {
        return ram;
    }
    public int getHdd() {
        return hdd;
    }
    public String getLname() {
        return lname;
    }
    public double getScreensize() {
        return screensize;
    }
    public String getProcessor() {
        return processor;
    }
    public void setRam(int ram){
        this.ram=4;
    }

    public void setHdd(int hdd) {
        this.hdd = 256;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setScreensize(double screensize) {
        this.screensize = screensize;
    }

    public void display(){
        System.out.print("Laptop features:\n");
        System.out.print("laptop name:"+lname+"\n"+"Ram :"+ram+"GB"+"\n"+"HDD:"+hdd+"GB"+"\n"+"Processor:"+processor+"\n"+"screen size:"+screensize+"\n" );
    }
}
class LaptopDemo{
    public static void main(String[] args) {
        Laptop l1=new Laptop();
        //l1.initialize("hp",16,256,"intel",15.7);
        l1.display();
    }
}