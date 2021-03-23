package com.company;
public class Concatenation
{
    public static void main(String args[])
    {
        String str1 = "Hii";
        str1 = str1.concat(" i am ");
        str1 = str1.concat(" idris ");
        System.out.println(str1);
        String str2 = "This";
        str2 = str2.concat(" is").concat(" just a").concat(" name");
        System.out.println(str2);
    }
}