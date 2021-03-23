package com.company;
public class StringCompare{
    public static void main(String args[]){
        String str = "Bharat";
        String anotherString = "Bharat";
        Object objStr = str;

        System.out.println( str.compareTo(anotherString) );
        System.out.println( str.compareToIgnoreCase(anotherString) );
        System.out.println( str.compareTo(objStr.toString()));
    }
}