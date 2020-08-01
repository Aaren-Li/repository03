package com.java.Test;

public class Cs {

    public static void main(String [] args)
    {
       Fz fz1=new Fz();
        Fz fz2=new Fz();
    }
}
class Fz {
    static  int num=50;
    public Fz() {
        num=num-1;
        System.out.println(num);
    }

}