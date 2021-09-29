package com.torryharris.driver;

import com.torryharris.model.*;

public class CarTypeDemo {
    public static void main(String[] args) {
        Tyre mrf=new Tyre("MRF",17);
        MusicSystem sony=new MusicSystem("Sony",true,8,2);
        HatchBag swift=new HatchBag("Swift","petrol",1500,93.4,5,mrf,sony,"power");
        swift.displayHatchFeature();
        Sedan dzire=new Sedan("Dezire","Disel",1500,94.3,6,mrf,sony,378);
        dzire.displaySedanFeature();
        Suv Thar=new Suv("Mahindra Thar","Disel",1800,93.4,6,mrf,sony,"city",false);
        Thar.displaySuvFeature();

    }
}
