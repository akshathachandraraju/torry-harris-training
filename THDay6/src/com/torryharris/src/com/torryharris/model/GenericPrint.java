package com.torryharris.model;

public class GenericPrint<T,E>{   //Generic class
    T obj1;
    E obj2;

    public GenericPrint(T obj1, E obj2) {
        this.obj1 = obj1;
        this.obj2=obj2;
    }

    public T getObj1() {
        return obj1;
    }

    public void setObj1(T obj1) {
        this.obj1 = obj1;
    }

    public E getObj2() {
        return obj2;
    }

    public void setObj2(E obj2) {
        this.obj2 = obj2;
    }
    public  <T> void GenericDisplay (T obj1)  //Generic Method
    {
        System.out.println(obj1);
    }


}
