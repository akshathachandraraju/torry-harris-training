package com.torryharris.driver;
import com.torryharris.model.Rectangle;
import com.torryharris.model.Shape;
import com.torryharris.model.Triangle;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape t1=new Triangle(5,3);
        t1.area();
        t1=new Rectangle(4,5);
        t1.area();

    }
}
