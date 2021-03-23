package com.company;

class Calc{
    int sum(int i , int j)
    {
        return i+j;
    }
    int subract(int i , int j)
    {
        return i-j;
    }
}
public class Main extends Calc {
    int mul(int xx , int yy)
    {
        return xx*yy;
    }
    int divide(int xx , int yy)
    {
        return xx/yy;
    }
    public static void main(String args[]) {
        Main c= new Main();
        System.out.println(c.sum(2,2));
        System.out.println(c.subract(2,6));
        System.out.println(c.mul(8,9));
        System.out.println(c.divide(2,2));
    }
}